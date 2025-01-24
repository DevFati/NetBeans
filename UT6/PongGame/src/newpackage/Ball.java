package newpackage;

import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fatmo
 */
public class Ball {
    private int x, y, width, height; 
    private double xSpeed = 3.0, ySpeed = 3.0;
    
    public Ball(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    
    public void move(){
        x+=xSpeed;
        y+=ySpeed;
    }
    
    public void checkCollision(Paddle p1, Paddle p2, int screenWidth, int screenHeight, Score score) {
    if (y <= 0 || y + height >= screenHeight) ySpeed *= -1; 

    
    if (x <= p1.getX() + p1.getWidth() && y + height >= p1.getY() && y <= p1.getY() + p1.getHeight()) {
        xSpeed *= -1;
        increaseSpeed();
    }

    
    if (x + width >= p2.getX() && y + height >= p2.getY() && y <= p2.getY() + p2.getHeight()) {
        xSpeed *= -1;
        increaseSpeed();
    }

    // Punto para el jugador 2 si la pelota pasa el lado izquierdo
    if (x + width < 0) {
        score.addPoint(2);
        resetPosition(screenWidth, screenHeight); // Reiniciar posición
    }

    // Punto para el jugador 1 si la pelota pasa el lado derecho
    if (x > screenWidth) {
        score.addPoint(1);
        resetPosition(screenWidth, screenHeight); // Reiniciar posición
    }
}

    
   public void increaseSpeed() {
    if (xSpeed > 0) {
        xSpeed += 0.1;
    } else {
        xSpeed -= 0.1;
    }

    if (ySpeed > 0) {
        ySpeed += 0.1;
    } else {
        ySpeed -= 0.1;
    }
}
   //tanta la velocidad como la posicion de la bola se reinicia despues de que se anote un punto
   public void resetPosition(int screenWidth, int screenHeight) {
    x = screenWidth / 2;
    y = screenHeight / 2;
    xSpeed = 3; // Reinicia velocidad base
    ySpeed = 3; // Reinicia velocidad base
}


    
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
    }
    
}
