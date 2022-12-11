package modelo;

/**
 * @author Iago Alonso Clase qaue representa una entidad de Estancia
 */
public class Estancia {

    private int idEstancia;
    private String nombreEstancia;
    private String tipoEstancia;

    /**
     * Constructor con tres parámetros
     *
     * @param idEstancia
     * @param nombreEstancia
     * @param tipoEstancia
     */
    public Estancia(int idEstancia, String nombreEstancia, String tipoEstancia) {
        this.idEstancia = idEstancia;
        this.nombreEstancia = nombreEstancia;
        this.tipoEstancia = tipoEstancia;
    }

    /**
     * Constructor vacío
     */
    public Estancia() {
    }

    /**
     * Método que recoge el id de una estancia
     *
     * @return int
     */
    public int getIdEstancia() {
        return idEstancia;
    }

    /**
     * Método que modifica el id de una estancia
     *
     * @param idEstancia
     */
    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    /**
     * Método que recoge el nombre de una estancia
     *
     * @return String
     */
    public String getNombreEstancia() {
        return nombreEstancia;
    }

    /**
     * Método que modifica el nombre de una estancia
     *
     * @param nombreEstancia
     */
    public void setNombreEstancia(String nombreEstancia) {
        this.nombreEstancia = nombreEstancia;
    }

    /**
     * Método que recoge el tipo de una estancia
     *
     * @return String
     */
    public String getTipoEstancia() {
        return tipoEstancia;
    }

    /**
     * Método que modifica el tipo de una estancia
     *
     * @param tipoEstancia
     */
    public void setTipoEstancia(String tipoEstancia) {
        this.tipoEstancia = tipoEstancia;
    }

    /**
     * Método que escribe el valor de los atributos de la clase
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Estancia{" + "idEstancia=" + idEstancia + ", nombreEstancia=" + nombreEstancia + ", tipoEstancia=" + tipoEstancia + '}';
    }

}
