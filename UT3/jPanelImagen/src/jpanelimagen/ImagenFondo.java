/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Tarde
 */
public class ImagenFondo implements Serializable {
    private File rutaimagen;
    private Float opacidad;
    private Float saturacion;

    public ImagenFondo(File rutaimagen, Float opacidad,Float saturacion) {       
        this.rutaimagen = rutaimagen;
        this.opacidad = opacidad;
        this.saturacion=saturacion;
    }

    public Float getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(Float saturacion) {
        this.saturacion = saturacion;
    }
    
    

    public File getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(File rutaimagen) {
        this.rutaimagen = rutaimagen;
    }

    public Float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(Float opacidad) {
        this.opacidad = opacidad;
    }
    
    
    
}
