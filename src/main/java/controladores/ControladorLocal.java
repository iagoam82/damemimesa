package controladores;

import dao.LocalDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Local;

/**
 *
 * @author Iago Alonso 
 * Clase que procesa las peticiones del navegador y las comunica a la clase DAO del local
 */
@WebServlet("/ControladorLocal")
public class ControladorLocal extends HttpServlet {

    /**
     * Método que recoge la acción de insertar
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarLocal(request, response);
                    break;
            }
        }
    }

    /**
     * Método que recoge las acciones de listar, listarVista y eliminar
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
                case "listar":
                    this.listarLocal(request, response);
                    break;
                case "listaVista":
                    this.listarLocalVistaPrincipal(request, response);
                    break;
                case "eliminar":
                    this.eliminarLocal(request, response);
                    break;
            }
        }
    }

    /**
     * Método que recoge información del navegador para insertar un local
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.LocalDAO.insertar()
     */
    private void insertarLocal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long telefonoLocal = Long.parseLong(request.getParameter("telefonoLocal"));
        String direccionLocal = request.getParameter("direccionLocal");
        String nombreLocal = request.getParameter("nombreLocal");
        String emailLocal = request.getParameter("emailLocal");
        String passwordLocal = request.getParameter("passwordLocal");
        Local local = new Local(telefonoLocal, direccionLocal, nombreLocal, emailLocal, passwordLocal);
        int registrosModificados = new LocalDAO().insertar(local);
        if (registrosModificados > 0) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("local", local);
            response.sendRedirect("PrincipalLocal.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    /**
     * Método que crea una lista de locales y manda la info a ListaRestaurantes
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
        response.sendRedirect("ListaRestaurantes.jsp");
    }

    /**
     * Método que crea una lista de locales y manda la info a PrincipalCliente
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.LocalDAO.listar()
     */
    private void listarLocalVistaPrincipal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Local> locales = new LocalDAO().listar();
        HttpSession session = request.getSession();
        session.setAttribute("locales", locales);
        response.sendRedirect("PrincipalCliente.jsp");
    }

    /**
     * Método que recoge los datos para eliminar un local
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see dao.LocalDAO.eliminar()
     */
    private void eliminarLocal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();

        Local local = (Local) sesion.getAttribute("local");
        long telefono = local.getTelefonoLocal();
        String nombre = local.getNombreLocal();
        int registrosModificados = new LocalDAO().eliminar(telefono, nombre);
        if (registrosModificados > 0) {
            response.sendRedirect("index.jsp");
            //rd.forward(request, response);
        } else {
            response.sendRedirect("PerfilLocal.jsp");
        }
    }
}
