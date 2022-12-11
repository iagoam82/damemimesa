package modelo;

/**
 * @author Iago Alonso 
 * Clase qaue representa una entidad de mesa
 */
public class Mesa {

    private int idMesa;
    private int numeroMesa;
    private int comensalesMesa;
    private boolean estadoMesa;

    /**
     * Constructor con cuatro parámetros
     * @param idMesa
     * @param numeroMesa
     * @param comensalesMesa
     * @param estadoMesa 
     */
    public Mesa(int idMesa, int numeroMesa, int comensalesMesa, boolean estadoMesa) {
        super();
        this.idMesa = idMesa;
        this.numeroMesa = numeroMesa;
        this.comensalesMesa = comensalesMesa;
        this.estadoMesa = estadoMesa;
    }
 
    /**
     * Constructor vacío
     */
    public Mesa() {
    }

    /**
     * Método que recoge el id de una mesa
     * @return int
     */
    public int getIdMesa() {
        return idMesa;
    }

    /**
     * Método que modifica el id de una mesa
     * @param idMesa 
     */
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    /**
     * Método que recoge el numero de una mesa
     * @return int
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    /**
     * Método que modifica el numero de una mesa
     * @param numeroMesa 
     */
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    /**
     * Método que recoge el numero de comensales de una mesa
     * @return int
     */
    public int getComensalesMesa() {
        return comensalesMesa;
    }

    /**
     * Método que modifica el numero de comensales de una mesa
     * @param comensalesMesa 
     */
    public void setComensalesMesa(int comensalesMesa) {
        this.comensalesMesa = comensalesMesa;
    }

    /**
     * Método que devuelve si una mesa está libre u ocupada
     * @return boolean
     */
    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    /**
     * Método que modifica el estado de una mesa
     * @param estadoMesa 
     */
    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    /**
     * Método que escribe los valores de los atributos de la clase
     * @return string
     */
    @Override
    public String toString() {
        return "Mesa [idMesa=" + idMesa + ", numeroMesa=" + numeroMesa + ", comensalesMesa=" + comensalesMesa
                + ", estadoMesa=" + estadoMesa + "]";
    }

}
