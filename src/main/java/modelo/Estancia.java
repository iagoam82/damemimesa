package modelo;

public class Estancia {

	//Atributos
    private int idEstancia;
    private String nombreEstancia;
    private String tipoEstancia;

    //Constructor
    public Estancia(int idEstancia, String nombreEstancia, String tipoEstancia) {
        this.idEstancia = idEstancia;
        this.nombreEstancia = nombreEstancia;
        this.tipoEstancia = tipoEstancia;
    }

    public Estancia() {
    }

    //Getters y Setters
    public int getidEstancia() {
        return idEstancia;
    }

    public void setidEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public String getnombreEstancia() {
        return nombreEstancia;
    }

    public void setnombreEstancia(String nombreEstancia) {
        this.nombreEstancia = nombreEstancia;
    }

    public String gettipoEstancia() {
        return tipoEstancia;
    }

    public void settipoEstancia(String tipoEstancia) {
        this.tipoEstancia = tipoEstancia;
    }
}
