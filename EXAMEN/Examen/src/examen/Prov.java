/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

/**
 *
 * @author Fatima Mortahil Chachou 
 */

//Nuestra clase Prov representa un proveedor con los diferentes datos 
//Nit, nombreEmpresa, telefono, ciudad, consulta y email. 
public class Prov {
    private String Nit; 
    private String nombreEmpresa;
    private String telefono; 
    private String ciudad; 
    private String consulta; 
    private String email; 

    public Prov(String Nit, String nombreEmpresa, String telefono, String ciudad, String consulta, String email) {
        this.Nit = Nit;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.consulta = consulta;
        this.email = email;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

        
    
}
