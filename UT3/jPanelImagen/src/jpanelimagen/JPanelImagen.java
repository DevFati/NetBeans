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
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;
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

  

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
        repaint(); //volvemos a dibujar si se elige otra imagen de fondo 
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        if(imagenFondo!=null){
            
        
        if (imagenFondo.getRutaimagen() != null && imagenFondo.getRutaimagen().exists()) {
            
            try{
                //Cargar la imagen desde el archivo 
            BufferedImage b=ImageIO.read(imagenFondo.getRutaimagen());
            
            //verificar si la imagen es indexada y convertir a RGB si no es asi
            if(b.getType()==BufferedImage.TYPE_BYTE_INDEXED){
                BufferedImage rgb=new BufferedImage(b.getWidth(), b.getHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d=rgb.createGraphics();
                g2d.drawImage(b, 0,0, null);
                g2d.dispose();
                b=rgb;
            }
            //Ajuste de saturacion
            float saturacion=imagenFondo.getSaturacion();
            RescaleOp op=new RescaleOp(saturacion,1f,null);
            
         
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
