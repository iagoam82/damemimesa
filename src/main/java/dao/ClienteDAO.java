package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import modelo.*;

public class ClienteDAO {

    private static final String SQL_INSERT = "INSERT INTO cliente(nombre_cliente, email_cliente, password_cliente) "
            + " VALUES(?, ?, ?)";

    private static final String SQL_UPDATE = "UPDATE cliente "
            + " SET nombre_cliente=? WHERE email_cliente=?";

    private static final String SQL_DELETE = "DELETE FROM cliente WHERE email_cliente = ? AND nombre_cliente =?";

    private static final String SQL_FINDBYID = "SELECT * FROM cliente WHERE email_cliente = ? AND password_cliente = ?";

    public int insertar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cliente.getNombreCliente());
            stmt.setString(2, cliente.getEmailCliente());
            stmt.setString(3, cliente.getPasswordCliente());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return rows;
    }

    public int actualizar(String nombre, String email) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, nombre);
            stmt.setString(2, email);

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return rows;
    }

    public int eliminar(String email, String nombre) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, email);
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

    public Cliente encontrar(String email, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_FINDBYID);
            stmt.setString(1, email);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre_cliente");
                cliente = new Cliente(nombre, password, email);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(rs);
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return cliente;
    }
    
    
}
