package modelo;

import java.io.Serializable;

public class Local implements Serializable {

    //Atributos
    private long telefonoLocal;
    private String direccionLocal;
    private String nombreLocal;
    private String emailLocal;
    private String passwordLocal;

    //Constructor
    public Local(long telefonoLocal, String direccionLocal, String nombreLocal, String emailLocal, String passwordLocal) {
        this.telefonoLocal = telefonoLocal;
        this.direccionLocal = direccionLocal;
        this.nombreLocal = nombreLocal;
        this.emailLocal = emailLocal;
        this.passwordLocal = passwordLocal;
    }

    public Local(long telefonoLocal, String direccionLocal, String nombreLocal, String emailLocal) {
        this.telefonoLocal = telefonoLocal;
        this.direccionLocal = direccionLocal;
        this.nombreLocal = nombreLocal;
        this.emailLocal = emailLocal;
    }

    public Local() {
        super();
    }
    
    
    //Getters y Setters

    public long getTelefonoLocal() {
        return telefonoLocal;
    }

    public void setTelefonoLocal(long telefonoLocal) {
        this.telefonoLocal = telefonoLocal;
    }

    public String getDireccionLocal() {
        return direccionLocal;
    }

    public void setDireccionLocal(String direccionLocal) {
        this.direccionLocal = direccionLocal;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getEmailLocal() {
        return emailLocal;
    }

    public void setEmailLocal(String emailLocal) {
        this.emailLocal = emailLocal;
    }

    public String getPasswordLocal() {
        return passwordLocal;
    }

    public void setPasswordLocal(String passwordLocal) {
        this.passwordLocal = passwordLocal;
    }

    @Override
    public String toString() {
        return "Local{" + "telefonoLocal=" + telefonoLocal + ", direccionLocal=" + direccionLocal + ", nombreLocal=" + nombreLocal + ", emailLocal=" + emailLocal + ", passwordLocal=" + passwordLocal + '}';
    }

}
