/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.tablemodels;

import beans.Cliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tarde
 */
public class ClientesTableModel extends AbstractTableModel{
    private List<Cliente> listCliente;
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    private String[] columnas={"Nombre","Primer apellido","Segundo apellido","Check in","Check out","Numero de habitación","Tipo de habitación","Numero de teléfono","Estado de reserva"};

    public ClientesTableModel(List<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    @Override
    public int getRowCount() {
        return listCliente.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int i, int il) {
        switch(il){
            case 0: 
                return listCliente.get(i).getNombre();
            case 1:
                return listCliente.get(i).getApellido1();
            case 2: 
                return listCliente.get(i).getApellido2();
            case 3: 
                Date n=listCliente.get(i).getCheckIn();
                return df.format(n);
            case 4: 
                Date n1=listCliente.get(i).getCheckOut();
                return df.format(n1);
            case 5: 
                
                return listCliente.get(i).getNumHabitacion();
            case 6: 
                return listCliente.get(i).getTipoHabitacion();
            case 7: 
                return listCliente.get(i).getNumTelefono();
            case 8: 
                return listCliente.get(i).getEstadoReserva();
            
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }
    
    
    
}
