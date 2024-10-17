/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author Tarde
 */
public class Cliente {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date checkIn;
    private Date checkOut;
    private int numHabitacion;
    private String tipoHabitacion;
    private String numTelefono; 
    private String estadoReserva;
   

    public Cliente(String nombre, String apellido1, String apellido2, Date checkIn, Date checkOut, int numHabitacion, String tipoHabitacion, String numTelefono, String estadoReserva) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.numTelefono = numTelefono;
        this.estadoReserva = estadoReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }
    
    
    
            
            
            
    
    
    
}
