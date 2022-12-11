package modelo;

/**
 * @author Iago Alonso 
 * Clase que representa una entidad cliente
 */
public class Cliente {

    private String nombreCliente;
    private String passwordCliente;
    private String emailCliente;

    /**
     * Constructor con tres parámetros
     *
     * @param nombreCliente
     * @param passwordCliente
     * @param emailCliente
     */
    public Cliente(String nombreCliente, String passwordCliente, String emailCliente) {
        this.nombreCliente = nombreCliente;
        this.passwordCliente = passwordCliente;
        this.emailCliente = emailCliente;
    }

    /**
     * Constructor vacío
     */
    public Cliente() {
    }

    /**
     * Método que recoge el nombre del cliente
     *
     * @return nombre del cliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Método que modifica el nombre de un cliente
     *
     * @param nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Método que recoge el password del cliente
     *
     * @return
     */
    public String getPasswordCliente() {
        return passwordCliente;
    }

    /**
     * Método que modifica el password de un cliente
     *
     * @param passwordCliente
     */
    public void setPasswordCliente(String passwordCliente) {
        this.passwordCliente = passwordCliente;
    }

    /**
     * Método que recoge el email del cliente
     *
     * @return
     */
    public String getEmailCliente() {
        return emailCliente;
    }

    /**
     * Método que modifica el email del cliente
     *
     * @param emailCliente
     */
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
