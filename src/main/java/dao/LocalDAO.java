
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


public class LocalDAO {
    
   private static final String SQL_SELECT = "SELECT telefono_local, direccion_local, nombre_local, email_local FROM local"; 
   private static final String SQL_INSERT = "INSERT INTO local(telefono_local, direccion_local, nombre_local,email_local, password_local)  VALUES(?, ?, ?, ?, ?)";
    
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
    
    public int insertar(Local local)  {
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
    
    
    
    
}
