/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roca;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Personaje {
    

    private Image pers;
    //Coordenadas del pernosaje
    private int X;
    private int Y;

    private int avance_X;
    private int avance_Y;

    private int limite_izquierda=0;
    private int limite_derecha;
     private int limite_bajo=0;
    private int limite_alto;

    public Personaje(int ancho, int alto, int avance) {
        //imagen del personaje
        pers = new ImageIcon(getClass().getResource("mono.jpg")).getImage();
        //coordenadas iniciales
        X = ancho/2; Y = alto - pers.getHeight(null);
        //pone avance de desplazamiento
        avance_X=avance;
        avance_Y=avance;
        //establece limite derecho
        limite_derecha=ancho - pers.getWidth(null);
        limite_alto=alto - pers.getHeight(null);
    }
    public Personaje(int ancho, int alto, int avance,String archivo) {
        //imagen de la pelota
        pers = new ImageIcon(getClass().getResource(archivo)).getImage();
        //coordenadas iniciales
        X = ancho/2; Y = alto - pers.getHeight(null);
        //pone avance de desplazamiento
        avance_X=avance;
        avance_Y=avance;
        //establece limite derecho
        limite_derecha=ancho - pers.getWidth(null);
        limite_alto=alto - pers.getHeight(null);
        
    }
     

   //mover la tabla
   public void moverD() {
        //nueva posicion
        X += avance_X;     
        //controla que la tabla no salga de los limites del contenedor
        if (X > limite_derecha) {
            X = limite_derecha;            
        } 
    }    
   
   public void moverI() {
        X -= avance_X;     
        //controla que la tabla no salga de los limites del contenedor
        if (X < limite_izquierda) {
            X = limite_izquierda;            
        } 
    }
   public void moverAr() {
        //nueva posicion
        Y += avance_Y;     
        //controla que la tabla no salga de los limites del contenedor
        if (Y > limite_alto) {
            Y = limite_alto;            
        } 
    }    
   
   public void moverAb() {
        Y -= avance_Y;     
        //controla que la tabla no salga de los limites del contenedor
        if (Y < limite_bajo) {
            Y = limite_bajo;            
        } 
    }
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(pers, X, Y, null);
    }

    //devuelve un número aleatorio entre 1 y MAX
    private int getNumberRandom(int Max){
        return (int) (Math.random()*Max+1);
    }
    
    //regresa la posicion del personaje
    public int valorXI(){
        return X;
    }
    public int valorY(){
        return Y;
    }
    public int valorXD(){
        return X+pers.getWidth(null);
    }
    public void ponePersonaje(String archivo) {
        pers = new ImageIcon(getClass().getResource(archivo)).getImage();
    }
}
