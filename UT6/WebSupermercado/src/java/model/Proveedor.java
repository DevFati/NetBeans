/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Fatima
 */
public class Proveedor implements Serializable{
     private String idNit;       
    private String nombre;      
    private String telefono;   
    private String direccion;  
    private String email;  

    public Proveedor() {
        this.idNit = "";
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
    }

    public Proveedor(String idNit, String nombre, String telefono, String direccion, String email) {
        this.idNit = idNit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public String getIdNit() {
        return idNit;
    }

    public void setIdNit(String idNit) {
        this.idNit = idNit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
