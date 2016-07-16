
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
    boolean facil=true;
    boolean medio=false;
    boolean difi=false;
    //instancia a la piedra en posicion (X,Y) => (0,0)
    private Piedra mipiedra = new Piedra(0, 0);
    private Piedra mipiedra2 = new Piedra (100, 0, "piedrat.png");
    private Piedra mipiedra3 = new Piedra (200, 0, "piedrat.png");
    private Label label1=new Label ("");
    private Personaje mipersonaje;
    private Timer timer,timer2, timer3, timer4;

    //Constructor
    public Campo(Dimension d) {
        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(new Color(255,255,255));
        mipersonaje = new Personaje(getWidth(), getHeight(), 25);
        mipiedra.LimitesXY(getWidth(), getHeight());
        mipiedra2.LimitesXY(getWidth(), getHeight());
        mipiedra3.LimitesXY(getWidth(), getHeight());
        timer = new Timer(14, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                mipiedra.move();             
                repaint();
                validaraplastada();              
            }                    
        });  
        timer2 = new Timer(14, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                mipiedra2.move();             
                repaint();
                validaraplastada2();
            }                    
        });
        timer3 = new Timer(14, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                //mipiedra3.aumentarVelocidad();
                mipiedra3.move();             
                repaint();
                validaraplastada3();
            }                    
        }); 
        timer4 = new Timer(8000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mipiedra.aumentarVelocidad();
                mipiedra2.aumentarVelocidad();
                mipiedra3.aumentarVelocidad();
            }
        }); 
    }

    
    public void animar(boolean turnOnOff) {
        mipersonaje.ponePersonaje("mono.jpg");
        
   if(difi && facil==false && medio==false){
        if (turnOnOff) {
            mipiedra.setVelocidadXY(8);
            mipiedra.ponePiedra("piedrat.png");
            timer.start();
            mipiedra2.setVelocidadXY(6);
            mipiedra2.ponePiedra("piedrat.png");
            timer2.start();
            mipiedra3.setVelocidadXY(4);
            mipiedra3.ponePiedra("piedrat.png");
            timer3.start();
            timer4.start();
        } else {
            timer.stop();
            mipiedra.regresar(0,0);
            timer2.stop();
            mipiedra2.regresar(100,0);
            timer3.stop();
            mipiedra3.regresar(200,0);
            timer4.stop();
            repaint();
        }
      
    }
       if(medio && facil==false &&difi==false){
        if (turnOnOff) {
            mipiedra.setVelocidadXY(8);
            mipiedra.ponePiedra("piedrat.png");
            timer.start();
            mipiedra2.setVelocidadXY(6);
            mipiedra2.ponePiedra("piedrat.png");
            timer2.start();
        } else {
            timer.stop();
            mipiedra.regresar(0,0);repaint();
            timer2.stop();
            mipiedra2.regresar(100,0);repaint();
        }     
       }   
       
    if (facil && medio==false && difi==false){
       if (turnOnOff) {
            mipiedra.setVelocidadXY(8);
            mipiedra.ponePiedra("piedrat.png");
            timer.start();
        } else {
            timer.stop();
            mipiedra.regresar(0,0);repaint();
        } 
    }
 
   
    
} 
    
    //pinta la animación
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mipersonaje.dibujar(g);
        mipiedra.dibujar(g);
        mipiedra2.dibujar(g);
        mipiedra3.dibujar(g);
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
    public void arriva(){
        mipersonaje.moverAr();
        repaint();
    }
    public void abajo(){
    mipersonaje.moverAb();
    repaint();    
    }
    public void validaraplastada(){
    if (mipiedra.valorXD()-5>= mipersonaje.valorXI()&&mipiedra.valorXI()+5<=mipersonaje.valorXD()){
        if (mipiedra.valorB()-3>=mipersonaje.valorY()){
            timer.stop();
            timer2.stop();
            timer3.stop();
            animar(false);
            mipersonaje.ponePersonaje("monop.jpg");
            JOptionPane.showMessageDialog(null,"Has perdido...reinicia el juego");
        }
    }
   
    }
    public void validaraplastada2(){
    if (mipiedra2.valorXD()-5>= mipersonaje.valorXI()&&mipiedra2.valorXI()+5<=mipersonaje.valorXD()){
        if (mipiedra2.valorB()-3>=mipersonaje.valorY()){
            timer2.stop(); 
            timer.stop();
        timer3.stop();
        mipersonaje.ponePersonaje("monop.jpg");
            JOptionPane.showMessageDialog(null,"Has perdido...reinicia el juego");
            animar(false);
        }
    }
    }
    public void validaraplastada3(){
    if (mipiedra3.valorXD()-5>= mipersonaje.valorXI()&&mipiedra3.valorXI()+5<=mipersonaje.valorXD()){
        if (mipiedra3.valorB()-3>=mipersonaje.valorY()){
            timer3.stop();
            timer2.stop();
            timer.stop();
            mipersonaje.ponePersonaje("monop.jpg");
            animar(false);
            JOptionPane.showMessageDialog(null,"Has perdido...reinicia el juego");
       
        }
    }
   
    }
    public Boolean facil(){
        return facil;
    }
    
}

