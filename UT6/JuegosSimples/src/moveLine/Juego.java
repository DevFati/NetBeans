/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveLine;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author fatmo
 */
public class Juego {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Move a Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        //agregames el panel donde veremos la linea vertical 
        MoveLinePanel l=new MoveLinePanel();
        frame.add(l,BorderLayout.CENTER);
        // Configurar el marco
        frame.pack(); //ajusta el tamaño automaticamente 
        frame.setLocationRelativeTo(null); // Centrar ventana
        frame.setResizable(false);
        frame.setVisible(true); // Mostrar ventana
        
    }
}
