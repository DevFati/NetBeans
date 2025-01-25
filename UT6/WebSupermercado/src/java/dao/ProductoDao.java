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
import model.Producto;

/**
 *
 * @author Fatima
 */
public class ProductoDao {

    public static boolean registrar(Producto p) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        try {
            String SQL = "INSERT INTO productos (codigo, nombre, descripcion, cantidad, precio, categoria_id, proveedor_id) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?);";
            con = conexion.conectar();
            if (con == null) {
                return false;
            }

            st = con.prepareStatement(SQL);
            st.setInt(1, p.getCodigo());
            st.setString(2, p.getNombre());
            st.setString(3, p.getDescripcion());
            st.setInt(4, p.getCantidad());
            st.setDouble(5, p.getPrecio());
            st.setInt(6, p.getCategoriaId());
            st.setString(7, p.getProveedorId());

            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static boolean actualizar(Producto p) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            String SQL = "UPDATE productos "
                    + "SET "
                    + "    nombre = ?, "
                    + "    descripcion = ?, "
                    + "    cantidad = ?, "
                    + "    precio = ?, "
                    + "    categoria_id = ?, "
                    + "    proveedor_id = ?"
                    + "WHERE codigo = ?;";

            con = conexion.conectar();
            if (con == null) {
                return false;
            }

            st = con.prepareStatement(SQL);
            st.setString(1, p.getNombre()); 
            st.setString(2, p.getDescripcion()); 
            st.setInt(3, p.getCantidad()); 
            st.setDouble(4, p.getPrecio()); 
            st.setInt(5, p.getCategoriaId()); 
            st.setString(6, p.getProveedorId()); 
            st.setInt(7, p.getCodigo()); 

            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static boolean eliminar(Producto p) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            String SQL = "DELETE FROM productos where codigo =?";

            con = conexion.conectar();
            if (con == null) {
                return false;
            }

                   

            st = con.prepareStatement(SQL);
            st.setInt(1, p.getCodigo()); 
            

            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static ArrayList<Producto> listar() {
        ArrayList<Producto> lista = new ArrayList<>();
        Connection con = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        try {
            String SQL = "select * from productos";
            con = conexion.conectar();
            if (con == null) {
                return null;
            }
            st = con.prepareStatement(SQL);
            resultado = st.executeQuery();

            //  st.setString(1,cat.getNombre());
            Producto p;
            while (resultado.next()) {
                p = new Producto();

                p.setCodigo(resultado.getInt("codigo"));
                p.setNombre(resultado.getString("nombre"));
                p.setDescripcion(resultado.getString("descripcion"));
                p.setCantidad(resultado.getInt("cantidad"));
                p.setPrecio(resultado.getDouble("precio"));
                p.setCategoriaId(resultado.getInt("categoria_id"));
                p.setProveedorId(resultado.getString("proveedor_id"));
                lista.add(p); // Agregar el producto a la lista
            }

            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
