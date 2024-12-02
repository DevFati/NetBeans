/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Locale;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Fatima Mortahil Chachou
 */
public class FeelAndLook {

    public static void main(String[] args) {
     
        //Aqui configuramos para que las ventanas usen "Look and Feel" 
        JFrame.setDefaultLookAndFeelDecorated(true);
        //Cambiamos el estilo visual. 
       SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");

        //Instanciamos la ventana LogIn y la hacemos visible
        Login v = new Login();
        v.setVisible(true);
        
        
        
    }
}
