package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
	//Atributos. Son todos static
    private final static String URL = "jdbc:mysql://localhost:3306/damemimesa";
    private final static String USER = "iago";
    private final static String PASSWORD = "1234";
    //Método que devuelve una conexión
    public static  Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    //Método que cierra el resultSet
    public static void close(ResultSet rs) {
        try {
                rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    //Método que cierra el PrepareStatement
    public static void close(PreparedStatement stmt) {
        try {
                stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    //Método que cierra la conexion
    public static void close(Connection conn) {
        try {
                conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    } 
}
