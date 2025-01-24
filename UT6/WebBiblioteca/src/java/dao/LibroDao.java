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
import model.Libro;

/**
 *
 * @author Fatima
 */
public class LibroDao {

    public static boolean registrar(Libro l) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        try {
            String SQL = "INSERT INTO libros "
                    + "VALUES (?, ?, ?, ?, ?, (SELECT NOW()),?,?);";
            con = conexion.conectar();
            if (con == null) {
                return false;
            }

            st = con.prepareStatement(SQL);
            st.setString(1, l.getIsbn());
            st.setString(2, l.getTitulo());
            st.setString(3, l.getDescripcion());
            st.setString(4, l.getNombreAutor());
            st.setString(5, l.getPublicacion());
            st.setInt(6, l.getCodigoCategoria());
            st.setString(7, l.getNitEditorial());

            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static boolean actualizar(Libro l) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            String SQL = "UPDATE libros SET "
                    + "titulo = ?, "
                    + "descripcion = ?, "
                    + "nombre_autor = ?, "
                    + "publicacion = ?, "
                    + "codigo_categoria = ?, "
                    + "nit_editorial = ? "
                    + "WHERE isbn = ?;";

            con = conexion.conectar();
            if (con == null) {
                return false;
            }

            st = con.prepareStatement(SQL);
            st.setString(7, l.getIsbn());
            st.setString(1, l.getTitulo());
            st.setString(2, l.getDescripcion());
            st.setString(3, l.getNombreAutor());
            st.setString(4, l.getPublicacion());
            st.setInt(5, l.getCodigoCategoria());
            st.setString(6, l.getNitEditorial());

            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

     public static boolean eliminar(Libro l) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            String SQL = "DELETE FROM libros where isbn=?";

            con = conexion.conectar();
            if (con == null) {
                return false;
            }

            st = con.prepareStatement(SQL);
            st.setString(1, l.getIsbn());
           

            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
     
    public static ArrayList<Libro> listar() {
        ArrayList<Libro> lista = new ArrayList<>();
        Connection con = null;
        PreparedStatement st = null;
        ResultSet resultado = null;
        try {
            String SQL = "select * from libros";
            con = conexion.conectar();
            if (con == null) {
                return null;
            }
            st = con.prepareStatement(SQL);
            resultado = st.executeQuery();

            //  st.setString(1,cat.getNombre());
            Libro l;
            while (resultado.next()) {
                l = new Libro();
                l.setIsbn(resultado.getString("isbn"));
                l.setTitulo(resultado.getString("titulo"));
                l.setNombreAutor(resultado.getString("nombre_autor"));
                l.setDescripcion(resultado.getString("descripcion"));
                l.setFechaRegistro(resultado.getString("fecha_registro"));
                l.setPublicacion(resultado.getString("publicacion"));
                l.setNitEditorial(resultado.getString("nit_editorial"));
                l.setCodigoCategoria(resultado.getInt("codigo_categoria"));
                lista.add(l); // Agregar libro a la lista
            }

            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LibroDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
