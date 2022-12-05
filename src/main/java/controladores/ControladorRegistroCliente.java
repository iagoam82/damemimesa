package controladores;

/*
import modelo.ConexionBD;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 */
import dao.ClienteDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

@WebServlet("/ControladorRegistroCliente")
public class ControladorRegistroCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarCliente(request, response);
                    break;
            }
        }
    }

    private void insertarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        Cliente cliente = new Cliente(nombre, password, email);
        int registrosModificados = new ClienteDAO().insertar(cliente);
        System.out.println("Req modif" + registrosModificados);

    }

    /*
    //Método para el insert
    public static void insertar(Cliente cliente) {
                
        PreparedStatement ps;
	String sql = "INSERT INTO cliente VALUES (?,?,?)";
	try {
            Connection conexion = ConexionBD.getConnection();
            ps = conexion.prepareStatement(sql);
            ps.setString (1,cliente.getnombreCliente());
            ps.setString (2,cliente.getemailCliente());
            ps.setString (3,cliente.getpasswordCliente());
            ps.executeUpdate();
            ConexionBD.close(ps);
            ConexionBD.close(conexion);
	} catch (SQLException ex) {
            ex.printStackTrace(System.out);
	}
    }
     */

 /*response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        //Recoger parámetros y creo objeto Cliente
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        Cliente cliente=new Cliente(nombre,email,password);
         ClienteDAO cliente1 =  new ClienteDAO();
         cliente1.insertar(cliente);*/
 /*Connection conexion;
                PreparedStatement ps;
		String sql = "INSERT INTO cliente VALUES (?,?,?)";
		try {
                    Class.forName("com.mysql.jdbc.Driver");
		    conexion = ConexionBD.getConnection();
		    ps = conexion.prepareStatement(sql);
		    ps.setString (1,nombre);
		    ps.setString (2,email);
		    ps.setString (3,password);
		    ps.executeUpdate();
		    ps.close();
		    conexion.close();
		} catch (SQLException ex) {
		    ex.printStackTrace(System.out);
		} catch (ClassNotFoundException ex) {
           Logger.getLogger(ControladorRegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
       }*/
    //Escribir en pantalla
    /*out.print(nombre);
        out.print("<hr>");
        out.print(email);
        out.print("<hr>");
        out.print(password);
        out.print("<hr>");*/
}
