/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author fatmo
 */
public class GamePanel extends JPanel implements Runnable, KeyListener {

    private final int WIDTH = 800, HEIGHT = 600;
    private Thread gameThread;
    private boolean running;
    private Ball ball;
    private Paddle player1, player2;
    private Score score;
    private Image background;
    private int puntosT = 0;

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);
        //Aqui cargamos nuestra imagen de fondo OJO!!!! Tenemos que poner la ruta absoluta
        background = new ImageIcon(getClass().getResource("/imgs/dos.png")).getImage();

        ball = new Ball(WIDTH / 2, HEIGHT / 2, 20, 20);
        player1 = new Paddle(10, HEIGHT / 2 - 40, 10, 250); // Paleta del jugador 1
        player2 = new Paddle(WIDTH - 20, HEIGHT / 2 - 40, 10, 250); // Paleta del jugador 2
        score = new Score();
        startGame();

    }

    private void startGame() {
        running = true;
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        while (running) {
            update();
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        ball.move();
        ball.checkCollision(player1, player2, WIDTH, HEIGHT, score);
        player1.move(HEIGHT);
        player2.move(HEIGHT);

        // Reducir la altura de las paletas solo si el puntaje total cambia
        int puntosAhora = score.getTotalScore();
        if (puntosAhora != puntosT) { // Solo pasa si los puntos cambian
            player1.reduceHeight();
            player2.reduceHeight();
            puntosT = puntosAhora; // Actualiza el puntaje procesado
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Dibujamos el fondo 
        g.drawImage(background, 0, 0, WIDTH, HEIGHT, null);

        ball.draw(g);
        player1.draw(g);
        player2.draw(g);
        score.draw(g, WIDTH, HEIGHT);

    }

    //Metodos keyListener 
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W) {
            player1.setDirection(-1);
        }
        if (key == KeyEvent.VK_S) {
            player1.setDirection(1);
        }
        if (key == KeyEvent.VK_UP) {
            player2.setDirection(-1);
        }
        if (key == KeyEvent.VK_DOWN) {
            player2.setDirection(1);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W || key == KeyEvent.VK_S) {
            player2.setDirection(0);
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            player2.setDirection(0);
        }

    }

}
