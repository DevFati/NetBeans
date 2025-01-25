/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Proveedor;

/**
 *
 * @author Fatima
 */
public class ProveedorDao {

    public static boolean registrar(Proveedor p) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            String SQL = "INSERT INTO proveedores (id_nit, nombre, telefono, direccion, email) VALUES (?, ?, ?, ?, ?);";
            con = conexion.conectar();
            if (con == null) {
                return false;
            }
            st = con.prepareStatement(SQL);
            st.setString(1, p.getIdNit());
            st.setString(2, p.getNombre());
            st.setString(3, p.getTelefono());
            st.setString(4, p.getDireccion());
            st.setString(5, p.getEmail());
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            // Asegúrate de cerrar la conexión y el PreparedStatement
            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static ArrayList<Proveedor> listar() {
        ArrayList<Proveedor> lista = new ArrayList<>();
        Connection con = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        try {
            String SQL = "select * from proveedores";
            con = conexion.conectar();
            if (con == null) {
                return null;
            }
            st = con.prepareStatement(SQL);
            resultado = st.executeQuery();

            //  st.setString(1,cat.getNombre());
            Proveedor p;
            while (resultado.next()) {
                p = new Proveedor();
                p.setIdNit(resultado.getString("id_nit"));
                p.setNombre(resultado.getString("nombre"));
                p.setTelefono(resultado.getString("telefono"));
                p.setDireccion(resultado.getString("direccion"));
                p.setEmail(resultado.getString("email"));
                lista.add(p);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            // Asegúrate de cerrar los recursos
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static String getProveedor(String id_nit) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        try {
            String SQL = "select nombre from proveedores where id_nit=?";
            con = conexion.conectar();
            if (con == null) {
                return null;
            }
            st = con.prepareStatement(SQL);
            st.setString(1, id_nit);
            resultado = st.executeQuery();

            //  st.setString(1,cat.getNombre());
     
            if(resultado.next()){ 
               
                return (resultado.getString("nombre"));
              
            }
           return "--";
           
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDao.class.getName()).log(Level.SEVERE, null, ex);
            return "--";
        } finally {
            // Asegúrate de cerrar los recursos
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProveedorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
