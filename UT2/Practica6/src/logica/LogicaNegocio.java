
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import beans.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tarde
 */
public class LogicaNegocio {
    public List<Cliente> listaClientes=new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
   
    public LogicaNegocio(){
        
        listaClientes=new ArrayList<>();
        
        try {
            listaClientes.add(new Cliente("Juan", "Pérez", "García", sdf.parse("11-10-2024 12:40"),  sdf.parse("15-10-2024 08:15"), 105, "Doble", "+34 678 123 456", "Activa"));
            listaClientes.add(new Cliente("María", "Rodríguez", "López", sdf.parse("18-09-2023 06:15"),  sdf.parse("20-09-2023 10:11"), 203, "Suite", "+34 600 987 654", "Activa"));
            listaClientes.add(new Cliente("Carlos", "Gómez", "Martínez", sdf.parse("20-09-2024 04:15"),  sdf.parse("25-09-2024 22:00"), 301, "Individual", "+34 622 456 789", "Cancelada"));
            listaClientes.add(new Cliente("Lucía", "Fernández", "Ruiz", sdf.parse("09-10-2024 09:00"), sdf.parse("12-10-2024 12:00"), 410, "Doble", "+34 644 123 890", "Completada"));
            listaClientes.add(new Cliente("Raúl", "Sánchez", "Ortega", sdf.parse("08-10-2024 18:30"), sdf.parse("11-10-2024 10:30"), 512, "Suite", "+34 667 789 123", "Activa"));
            listaClientes.add(new Cliente("Ana", "Jiménez", "Méndez", sdf.parse("07-10-2024 13:00"), sdf.parse("09-10-2024 09:00"), 602, "Individual", "+34 655 321 987", "Cancelada"));
            listaClientes.add(new Cliente("Alberto", "Díaz", "Romero", sdf.parse("06-10-2024 17:00"), sdf.parse("10-10-2024 12:00"), 704, "Doble", "+34 677 654 321", "Completada"));
            listaClientes.add(new Cliente("Isabel", "Hernández", "Navarro", sdf.parse("11-10-2024 16:00"), sdf.parse("12-10-2024 11:00"), 805, "Suite", "+34 611 999 888", "Activa"));
            listaClientes.add(new Cliente("Javier", "Torres", "Castillo", sdf.parse("14-10-2024 10:00"), sdf.parse("18-10-2024 09:00"), 910, "Doble", "+34 699 888 777", "Activa"));
            listaClientes.add(new Cliente("Sofía", "García", "Vega", sdf.parse("15-10-2024 14:00"), sdf.parse("19-10-2024 11:00"), 1011, "Individual", "+34 644 555 333", "Activa"));
            listaClientes.add(new Cliente("Miguel", "López", "Fernández", sdf.parse("22-09-2024 13:30"), sdf.parse("27-09-2024 11:00"), 1201, "Suite", "+34 677 543 210", "Completada"));
            listaClientes.add(new Cliente("Elena", "Martínez", "Soler", sdf.parse("18-09-2024 17:00"), sdf.parse("23-09-2024 10:30"), 1503, "Doble", "+34 600 876 543", "Activa"));


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

   
    
    
    
    
}
