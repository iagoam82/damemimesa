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
import dao.LocalDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Cliente;
import modelo.Local;

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
                case "login":
                    this.loginCliente(request,response);
                    break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "eliminar":
                    this.eliminarCliente(request, response);
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
        if(registrosModificados > 0){
            HttpSession sesion = request.getSession();
            sesion.setAttribute("email", cliente.getEmailCliente());
            System.out.println(cliente.getEmailCliente());
             this.listarLocal(request, response);
            //RequestDispatcher rd = request.getRequestDispatcher("PrincipalCliente.jsp");
            //response.sendRedirect("PrincipalCliente.jsp");
        }
        
    }

    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        String emailCliente = sesion.getAttribute("email").toString();
        int registrosModificados = new ClienteDAO().eliminar(emailCliente);
        RequestDispatcher rd = request.getRequestDispatcher("PrincipalCliente.jsp");
        rd.forward(request, response);

    }
    
    
    private void loginCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
         String email = request.getParameter("email");
         String password = request.getParameter("password");
         boolean usuarioExiste = new ClienteDAO().encontrar(email,password);
         if(usuarioExiste == true ){
            HttpSession sesion = request.getSession();
            sesion.setAttribute("email", email);
            this.listarLocal(request, response);
            //response.sendRedirect("/ControladorLocal?accion=listaVista");            
         }else {
             response.sendRedirect("index.jsp");
         }
        
         
        
        
    }
    
    private void listarLocal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Local> locales = new LocalDAO().listar();
        HttpSession session = request.getSession();
        session.setAttribute("locales", locales);
        response.sendRedirect("PrincipalCliente.jsp");
    }
}
