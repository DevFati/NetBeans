/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveBall;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import moveLine.MoveLinePanel;

/**
 *
 * @author fatmo
 */
public class Juego {
    
    public static void main(String[] args) {
         JFrame frame=new JFrame("Move a Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
      
        //agregames el panel 
        MoveBall l=new MoveBall();
        frame.add(l,BorderLayout.CENTER);
        // Configurar el marco
        frame.pack(); //ajusta el tamaño automaticamente 
        frame.setLocationRelativeTo(null); // Centrar ventana
        frame.setVisible(true); // Mostrar ventana
    }
}
