package controladores;

import dao.LocalDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Local;

@WebServlet("/ControladorLocal")
public class ControladorLocal extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarLocal(request, response);
                    break;
                case "loginLocal":  
                    this.loginLocal(request,response);
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
                case "listar":
                    this.listarLocal(request, response);
                    break;
                case "listaVista":
                    this.listarLocalVistaPrincipal(request, response);
                    break;
            }
        }
    }

    private void insertarLocal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long telefono = Long.parseLong(request.getParameter("telefono"));
        String direccion = request.getParameter("direccion");
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Local local = new Local(telefono, direccion, nombre, email, password);
        int registrosModificados = new LocalDAO().insertar(local);
        System.out.println("Req modif" + registrosModificados);
    }

    private void listarLocal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Local> locales = new LocalDAO().listar();
        HttpSession session = request.getSession();
        session.setAttribute("locales", locales);
        response.sendRedirect("ListaRestaurantes.jsp");     
    }

    private void listarLocalVistaPrincipal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Local> locales = new LocalDAO().listar();
        HttpSession session = request.getSession();
        session.setAttribute("locales", locales);
        response.sendRedirect("PrincipalCliente.jsp");
    }

    private void loginLocal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
         String email = request.getParameter("email");
         String password = request.getParameter("password");
         boolean localExiste = new LocalDAO().encontrar(email,password);
         if(localExiste= true ){
            HttpSession sesion = request.getSession();
            sesion.setAttribute("email", email);
            response.sendRedirect("PrincipalLocal.jsp");            
         }
         else{             
             response.sendRedirect("index.jsp");   
         }
    }
}
