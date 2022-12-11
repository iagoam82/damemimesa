package controladores;

import dao.ClienteDAO;
import dao.LocalDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Cliente;
import modelo.Local;

/**
 * @author Iago Alonso Clase que procesa las peticiones del navegador y las
 * comunica a las clase DAO del cliente
 */
@WebServlet("/ControladorRegistroCliente")
public class ControladorRegistroCliente extends HttpServlet {

    /**
     * Método que recoge las acciones de insertar y login
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
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
                    this.login(request, response);
                    break;
            }
        }
    }

    /**
     * Método que recoge las acciónes de eliminar y actualizar
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "eliminar":
                    this.eliminarCliente(request, response);
                    break;
                case "actualizar":
                    this.actualizarCliente(request, response);
                    break;
            }
        }
    }

    /**
     * Método que recoge información del navegador para insertar un cliente
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.ClienteDAO.insertar()
     */
    private void insertarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        Cliente cliente = new Cliente(nombre, password, email);
        int registrosModificados = new ClienteDAO().insertar(cliente);
        if (registrosModificados > 0) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("cliente", cliente);
            this.listarLocal(request, response);
        }
    }

    /**
     * Método que recoge los datos para eliminar un cliente
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.ClienteDAO.eliminar()
     */
    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        Cliente cliente = (Cliente) sesion.getAttribute("cliente");
        String email = cliente.getEmailCliente();
        String nombre = cliente.getNombreCliente();
        int registrosModificados = new ClienteDAO().eliminar(email, nombre);
        if (registrosModificados > 0) {
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("PerfilCliente.jsp");
        }
    }

    /**
     * Método que busca coincidencia email-password en clientes, si no encuentra
     * busca telefono-password en locales
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.ClienteDAO.encontrar(), dao.LocalDAO.encontrar()
     */
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Cliente cliente = new ClienteDAO().encontrar(email, password);
        if (cliente != null) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("cliente", cliente);
            this.listarLocal(request, response);
        } else {
            Local local = new LocalDAO().encontrar(email, password);
            if (local == null) {
                response.sendRedirect("index.jsp");
            } else {
                HttpSession sesion = request.getSession();
                sesion.setAttribute("local", local);
                response.sendRedirect("PrincipalLocal.jsp");
            }
        }
    }

    /**
     * Método que crea una lista de locales y manda la info a PrincipalCliente
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.LocalDAO.listar()
     */
    private void listarLocal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Local> locales = new LocalDAO().listar();
        HttpSession session = request.getSession();
        session.setAttribute("locales", locales);
        response.sendRedirect("PrincipalCliente.jsp");
    }

    /**
     * Método que sustituye el nombre de un cliente
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.ClienteDAO.actualizar()
     */
    private void actualizarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        int actualizado = new ClienteDAO().actualizar(nombre, email);
        if (actualizado > 0) {
            HttpSession sesion = request.getSession();
            Cliente cliente = (Cliente) sesion.getAttribute("cliente");
            cliente.setNombreCliente(nombre);
            sesion.setAttribute("cliente", cliente);
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("PerfilCliente.jsp");
        }
    }
}
