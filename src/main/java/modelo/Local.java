package modelo;

import java.io.Serializable;

/**
 * @author Iago Alonso Clase qaue representa una entidad de Local
 */
public class Local implements Serializable {

    private long telefonoLocal;
    private String direccionLocal;
    private String nombreLocal;
    private String emailLocal;
    private String passwordLocal;

    /**
     * Constructor con 5 parámetros
     *
     * @param telefonoLocal
     * @param direccionLocal
     * @param nombreLocal
     * @param emailLocal
     * @param passwordLocal
     */
    public Local(long telefonoLocal, String direccionLocal, String nombreLocal, String emailLocal, String passwordLocal) {
        this.telefonoLocal = telefonoLocal;
        this.direccionLocal = direccionLocal;
        this.nombreLocal = nombreLocal;
        this.emailLocal = emailLocal;
        this.passwordLocal = passwordLocal;
    }

    /**
     * Constructor con 4 parámetros
     *
     * @param telefonoLocal
     * @param direccionLocal
     * @param nombreLocal
     * @param emailLocal
     */
    public Local(long telefonoLocal, String direccionLocal, String nombreLocal, String emailLocal) {
        this.telefonoLocal = telefonoLocal;
        this.direccionLocal = direccionLocal;
        this.nombreLocal = nombreLocal;
        this.emailLocal = emailLocal;
    }

    /**
     * Constructor vacio
     */
    public Local() {
        super();
    }

    /**
     * Método que recoge el telefono de un local
     *
     * @return long
     */
    public long getTelefonoLocal() {
        return telefonoLocal;
    }

    /**
     * Método que modifica el telefono de un local
     *
     * @param telefonoLocal
     */
    public void setTelefonoLocal(long telefonoLocal) {
        this.telefonoLocal = telefonoLocal;
    }

    /**
     * Método que recoge la direccion de un local
     *
     * @return String
     */
    public String getDireccionLocal() {
        return direccionLocal;
    }

    /**
     * Método que modifica la direccion de un local
     *
     * @param direccionLocal
     */
    public void setDireccionLocal(String direccionLocal) {
        this.direccionLocal = direccionLocal;
    }

    /**
     * Método que recoge el nombre de un local
     *
     * @return String
     */
    public String getNombreLocal() {
        return nombreLocal;
    }

    /**
     * Método que modifica el nombre de un local
     *
     * @param nombreLocal
     */
    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    /**
     * Método que recoge el email de un local
     *
     * @return String
     */
    public String getEmailLocal() {
        return emailLocal;
    }

    /**
     * Método que modifica el email de un local
     *
     * @param emailLocal
     */
    public void setEmailLocal(String emailLocal) {
        this.emailLocal = emailLocal;
    }

    /**
     * Método que recoge el password de un local
     *
     * @return String
     */
    public String getPasswordLocal() {
        return passwordLocal;
    }

    /**
     * Método que modifica el password de un local
     *
     * @param passwordLocal
     */
    public void setPasswordLocal(String passwordLocal) {
        this.passwordLocal = passwordLocal;
    }

    /**
     * Método que escribe el valor de los atributos de la clase
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Local{" + "telefonoLocal=" + telefonoLocal + ", direccionLocal=" + direccionLocal + ", nombreLocal=" + nombreLocal + ", emailLocal=" + emailLocal + ", passwordLocal=" + passwordLocal + '}';
    }

}
