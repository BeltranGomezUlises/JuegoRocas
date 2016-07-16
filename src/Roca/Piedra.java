package Roca;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Piedra {

    private Image piedra;
    //Coordenadas de la piedra
    public int X;
    public int Y;
    public int E=0;
    private int velocidad_X;
    private int velocidad_Y;

    private int limite_izquierda=0;
    private int limite_derecha;
    private int limite_superior=0;
    private int limite_inferior;

    public Piedra(int x, int y) {
        //coordenadas iniciales
         this.X=x; this.Y = y;
        //imagen de la piedra
        piedra = new ImageIcon(getClass().getResource("piedrat.png")).getImage();
    }
    
     public Piedra(int x, int y,String archivo) {
        //coordenadas iniciales
        this.X = x; this.Y = y;
        //imagen de la piedrq
        piedra = new ImageIcon(getClass().getResource(archivo)).getImage();
        
    }
     
    //dado las dimensiones del contendor JPanel
   public void LimitesXY(int width, int height) {
        limite_derecha  = width  - piedra.getWidth(null);
        limite_inferior = height - piedra.getHeight(null);
      
    }

   //recalcula variables para dar la sensacion de movimiento
   public void move() {
        //nueva posicion
        Y += velocidad_Y;
        //controla que la piedra no salga del margen del panel
        if (Y > this.limite_inferior) {
            Y = 0;
            X=getNumberRandom(420);
            E=E+1;   
        } 
    }
   public void aumentarVelocidad(){
   if (velocidad_Y<30)
       velocidad_Y++;
   }
    public void setVelocidadXY(int velY){
        velocidad_Y = velY;
        X=getNumberRandom(360); 
        Y=0;
    }
    public void regresar(int a,int b){
      X=a; 
      Y=b;  
    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(piedra, X, Y, null); 
    }
   

    //devuelve un número aleatorio entre 1 y MAX
    public int getNumberRandom(int Max){
        return (int) (Math.random()*Max+1);
    }
    
    //regresa la posicion de la pelota
    public int valorXI(){
        return X;
    }
    public int valorXD(){
        return X+piedra.getWidth(null);
    }
    public int valorB(){
        return Y+piedra.getHeight(null);
    }
    public int valorA(){
        return Y;
    }
    
    
     public void ponePiedra(String archivo) {
        piedra = new ImageIcon(getClass().getResource(archivo)).getImage();
    }
     public int es(){
         return E;
     }
}
