package modelo;

public class Cliente {

    //atributos
    private String nombreCliente;
    private String passwordCliente;
    private String emailCliente;

    //Constructor
    public Cliente(String nombreCliente, String passwordCliente, String emailCliente) {
        this.nombreCliente = nombreCliente;
        this.passwordCliente = passwordCliente;
        this.emailCliente = emailCliente;
    }

    public Cliente() {
    }

    //Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPasswordCliente() {
        return passwordCliente;
    }

    public void setPasswordCliente(String passwordCliente) {
        this.passwordCliente = passwordCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
