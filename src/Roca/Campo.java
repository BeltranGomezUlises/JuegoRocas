
package Roca;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Campo extends JPanel{
            
    public static String dificultadActual;
    
    public static final String DIFICULTAD_FACIL = "facil";
    public static final String DIFICULTAD_MEDIO = "medio";
    public static final String DIFICULTAD_DIFICIL = "dificil";
    //instancia a la piedra en posicion (X,Y) => (0,0)
    private Piedra miPiedra = new Piedra(0, 0);
    private Piedra miPiedra2 = new Piedra (100, 0, "/Images/piedrat.png");
    private Piedra miPiedra3 = new Piedra (200, 0, "/Images/piedrat.png");    
    private Personaje mipersonaje;
    private Timer timer, timer2, timer3, timer4;

    //Constructor
    public Campo(Dimension d) {
        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(new Color(255,255,255));
        mipersonaje = new Personaje(getWidth(), getHeight(), 25);
        miPiedra.LimitesXY(getWidth(), getHeight());        
        miPiedra2.LimitesXY(getWidth(), getHeight());
        miPiedra3.LimitesXY(getWidth(), getHeight());
        timer = new Timer(14, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                miPiedra.move();             
                repaint();
                validaraplastada();              
            }                    
        });  
        timer2 = new Timer(14, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                miPiedra2.move();             
                repaint();
                validaraplastada2();
            }                    
        });
        timer3 = new Timer(14, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                //miPiedra3.aumentarVelocidad();
                miPiedra3.move();             
                repaint();
                validaraplastada3();
            }                    
        }); 
        timer4 = new Timer(8000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                miPiedra.aumentarVelocidad();
                miPiedra2.aumentarVelocidad();
                miPiedra3.aumentarVelocidad();
            }
        }); 
    }

    
    public void animar(boolean turnOnOff) {
        mipersonaje.ponePersonaje("/Images/mono.jpg");
        
        if(dificultadActual.equals(DIFICULTAD_DIFICIL)){
            if (turnOnOff) {
                miPiedra.setVelocidadXY(8);                
                timer.start();
                miPiedra2.setVelocidadXY(6);                
                timer2.start();
                miPiedra3.setVelocidadXY(4);                
                timer3.start();
                timer4.start();
            } else {
                timer.stop();
                miPiedra.regresar(0,0);
                timer2.stop();
                miPiedra2.regresar(100,0);
                timer3.stop();
                miPiedra3.regresar(200,0);
                timer4.stop();
                repaint();
            }

        }else{
            if(dificultadActual.equals(DIFICULTAD_MEDIO)){
                if (turnOnOff) {
                    miPiedra.setVelocidadXY(8);                    
                    timer.start();
                    miPiedra2.setVelocidadXY(6);                    
                    timer2.start();
                } else {
                    timer.stop();
                    miPiedra.regresar(0,0);repaint();
                    timer2.stop();
                    miPiedra2.regresar(100,0);repaint();
                }     
            }else{ //la fificultad es dicifil
                if (turnOnOff) {
                    miPiedra.setVelocidadXY(8);                    
                    timer.start();
                } else {
                    timer.stop();
                    miPiedra.regresar(0,0);repaint();
                }   
            }   
        }            
    } 
    
    //pinta la animación
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mipersonaje.dibujar(g);
        miPiedra.dibujar(g);
        miPiedra2.dibujar(g);
        miPiedra3.dibujar(g);
    }
    
     //mueve el personaje
    public void izquierda(){
        mipersonaje.moverI();
        repaint();
    }
    
    public void derecha(){
        mipersonaje.moverD();
        repaint();
    }
       
    //validar fin del juego
    public void validaraplastada(){
        if ((miPiedra.valorXD() - 5) >= mipersonaje.valorXI() && (miPiedra.valorXI() + 5) <= mipersonaje.valorXD()){
            if ((miPiedra.valorB() - 3) >= mipersonaje.valorY()){
                timer.stop();
                timer2.stop();
                timer3.stop();
                animar(false);
                mipersonaje.ponePersonaje("/Images/monop.jpg");                                
                JOptionPane.showMessageDialog(null, "Has perdido...reinicia el juego");
            }
        }   
    }
    
    public void validaraplastada2(){
        if ((miPiedra2.valorXD() - 5) >= mipersonaje.valorXI() && (miPiedra2.valorXI() + 5) <= mipersonaje.valorXD()){
            if (miPiedra2.valorB()-3>=mipersonaje.valorY()){                 
                timer.stop();
                timer2.stop();
                timer3.stop();                                
                animar(false);
                mipersonaje.ponePersonaje("/Images/monop.jpg");
                JOptionPane.showMessageDialog(null,"Has perdido...reinicia el juego");                
            }
        }
    }
    
    public void validaraplastada3(){
        if ((miPiedra3.valorXD() - 5) >= mipersonaje.valorXI() && (miPiedra3.valorXI() + 5) <= mipersonaje.valorXD()){
            if ((miPiedra3.valorB() - 3) >= mipersonaje.valorY()){
                timer.stop();
                timer2.stop();
                timer3.stop();                                
                animar(false);
                mipersonaje.ponePersonaje("/Images/monop.jpg");
                JOptionPane.showMessageDialog(null,"Has perdido...reinicia el juego");
            }
        }   
    }            
}

