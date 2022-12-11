package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
import modelo.ConexionBD;

/**
 * @author Iago Alonso Clase con los atributos y métodos para comunicarse con la
 * base de datos
 */
public class LocalDAO {

    private static final String SQL_SELECT = "SELECT telefono_local, direccion_local, nombre_local, email_local FROM local";
    private static final String SQL_INSERT = "INSERT INTO local(telefono_local, direccion_local, nombre_local,email_local, password_local)  VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_FINDBYID = "SELECT * FROM local WHERE email_local = ? AND password_local = ?";
    private static final String SQL_DELETE = "DELETE FROM local WHERE telefono_local = ? AND nombre_local =?";

    /**
     * Método que crea una lista de locales
     *
     * @return List
     * @see Web Pages.PrincipalCliente, Web
     * Pages.recursos.comunes.navegadorCliente, Web
     * Pages.recursos.comunes.navegadorLocal
     */
    public List<Local> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Local local = null;
        List<Local> locales = new ArrayList<>();
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LocalDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {

                long telefono = rs.getLong("telefono_local");
                String direccion = rs.getString("direccion_local");
                String nombre = rs.getString("nombre_local");
                String email = rs.getString("email_local");

                local = new Local(telefono, direccion, nombre, email);
                locales.add(local);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(rs);
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return locales;
    }

    /**
     * Método que inserta un local
     *
     * @param local
     * @return int
     * @see Web Pages.RegistroLocal
     */
    public int insertar(Local local) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LocalDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setLong(1, local.getTelefonoLocal());
            stmt.setString(2, local.getDireccionLocal());
            stmt.setString(3, local.getNombreLocal());
            stmt.setString(4, local.getEmailLocal());
            stmt.setString(5, local.getPasswordLocal());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return rows;
    }

    /**
     * Método que busca coincidencia entre un email y un password
     *
     * @param email
     * @param password
     * @return Local
     * @see Web Pages.index
     */
    public Local encontrar(String email, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Local local = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LocalDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_FINDBYID);
            stmt.setString(1, email);
            stmt.setString(2, password);
            rs = stmt.executeQuery();

            if (rs.next()) {
                long telefonoLocal = rs.getLong("telefono_local");
                String direccionLocal = rs.getString("direccion_local");
                String nombreLocal = rs.getString("nombre_local");
                local = new Local(telefonoLocal, direccionLocal, nombreLocal, email, password);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(rs);
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return local;
    }

    /**
     * Método que elimina un local
     *
     * @param telefono
     * @param nombre
     * @return int
     */
    public int eliminar(Long telefono, String nombre) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LocalDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setLong(1, telefono);
            stmt.setString(2, nombre);
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return rows;
    }
}
