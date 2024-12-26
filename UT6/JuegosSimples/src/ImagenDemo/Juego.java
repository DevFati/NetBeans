/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImagenDemo;

import MoveBall.MoveBall;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author fatmo
 */
public class Juego {
    public static void main(String[] args) {
          JFrame frame=new JFrame("Image Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
      
        //agregames el panel 
        ImageDemo l=new ImageDemo();
        frame.add(l,BorderLayout.CENTER);
        // Configurar el marco
        frame.pack(); //ajusta el tamaño automaticamente 
        frame.setLocationRelativeTo(null); // Centrar ventana
        frame.setSize(400, 400);
        frame.setVisible(true); // Mostrar ventana

        
    }
}
