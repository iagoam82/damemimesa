package modelo;

import java.time.LocalDateTime;

public class Reserva {

	//Atributos
    private int idReserva;
    private LocalDateTime fechaHoraReserva;

    //Constructor
    public Reserva(int idReserva, LocalDateTime fechaHoraReserva) {
        this.idReserva = idReserva;
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public Reserva() {
    }

    //Getters y Setters

    public int getidReserva() {
        return idReserva;
    }

    public void setidReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDateTime getfechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setfechaHoraReserva(LocalDateTime fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }
}
