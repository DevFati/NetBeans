/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Color;
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

// Resto de las importaciones y definición de la clase JPanelImagen...

@Override
protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    if (imagenFondo != null) {
        if (imagenFondo.getRutaimagen() != null && imagenFondo.getRutaimagen().exists()) {
            try {
                BufferedImage b = ImageIO.read(imagenFondo.getRutaimagen());

               
                float saturacion = imagenFondo.getSaturacion();

                for (int x = 0; x < b.getWidth(); x++) {
                    for (int y = 0; y < b.getHeight(); y++) {
                        int pixel = b.getRGB(x, y);
                        Color color = new Color(pixel);
                        float[] hsbVals = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);

                        // Ajuste de saturación
                        hsbVals[1] *= saturacion; 
                        hsbVals[1] = Math.min(1.0f, Math.max(0.0f, hsbVals[1])); // Limitar entre 0 y 1

                        int nuevoColor = Color.HSBtoRGB(hsbVals[0], hsbVals[1], hsbVals[2]);
                        b.setRGB(x, y, nuevoColor);
                    }
                }

                Graphics2D g2d = (Graphics2D) grphcs;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
                g2d.drawImage(b, 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

    

    

}
