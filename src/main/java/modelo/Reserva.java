package modelo;

import java.time.LocalDateTime;

/**
 * @author Iago Alonso 
 * Clase qaue representa una entidad de reserva
 */
public class Reserva {

    private int idReserva;
    private LocalDateTime fechaHoraReserva;

    /**
     * Constructor con dos parámetros
     *
     * @param idReserva
     * @param fechaHoraReserva
     */
    public Reserva(int idReserva, LocalDateTime fechaHoraReserva) {
        this.idReserva = idReserva;
        this.fechaHoraReserva = fechaHoraReserva;
    }

    /**
     * Constructor vacío
     */
    public Reserva() {
    }

    /**
     * Método que recoge el id de una reserva
     * @return int
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * Método que modifica el id de una reserva
     * @param idReserva
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * Método que recoge la fecha y hora de una reserva
     * @return LocalDateTime
     */
    public LocalDateTime getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    /**
     * Método que modifica la fecha y hora de una reserva
     * @param fechaHoraReserva
     */
    public void setFechaHoraReserva(LocalDateTime fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    /**
     * Método que escribe el valor de los atributos de la clase
     * @return String
     */
    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", fechaHoraReserva=" + fechaHoraReserva + '}';
    }
    
}
