/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagenrelativa;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author fatmo
 */
public class JpanelImagenRelativa extends JPanel implements  Serializable{

    private File rutaRelativa;
    public JpanelImagenRelativa() {
    }

    public JpanelImagenRelativa(File rutaRelativa) {
        this.rutaRelativa = rutaRelativa;
    }

    public File getRutaRelativa() {
        return rutaRelativa;
    }

    public void setRutaRelativa(File rutaRelativa) {
        this.rutaRelativa = rutaRelativa;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if(rutaRelativa!=null && rutaRelativa.exists()){
            ImageIcon n=new ImageIcon(rutaRelativa.getPath());
            
            g.drawImage(n.getImage(), 0, 0, null);
            
        }
            
            
    }
    
    

    

   
    
      
    
}
