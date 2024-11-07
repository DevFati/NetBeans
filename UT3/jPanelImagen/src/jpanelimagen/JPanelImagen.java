/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Tarde
 */
public class JPanelImagen extends JPanel implements Serializable {

    /**
     * @param args the command line arguments
     */
    private ImagenFondo imagenFondo;

    public JPanelImagen() {
    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        if(imagenFondo!=null){
            
        
        if (imagenFondo.getRutaimagen() != null && imagenFondo.getRutaimagen().exists()) {
            
            try{
                //Cargar la imagen desde el archivo 
            BufferedImage b=ImageIO.read(imagenFondo.getRutaimagen());
            //Ajuste de saturacion
            float saturacion=imagenFondo.getSaturacion();
            RescaleOp op=new RescaleOp(1f,saturacion,null);
            
         
                //generamos la imagen ajustada medianteun "snapshot" de imageview
                BufferedImage ad=op.filter(b, null);

            Graphics2D g2d = (Graphics2D) grphcs;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
            g2d.drawImage(ad, 0, 0, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        }

    }

}
