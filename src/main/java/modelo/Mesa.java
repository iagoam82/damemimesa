package modelo;

public class Mesa {

	//Atributos
    private int idMesa;
	private int numeroMesa;
    private int comensalesMesa;
    private boolean estadoMesa;
    
    //Constructor
    public Mesa(int idMesa, int numeroMesa, int comensalesMesa, boolean estadoMesa) {
		super();
		this.idMesa = idMesa;
		this.numeroMesa = numeroMesa;
		this.comensalesMesa = comensalesMesa;
		this.estadoMesa = estadoMesa;
	}

    public Mesa() {
    }

  //Getters y Setters
	public int getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getComensalesMesa() {
		return comensalesMesa;
	}

	public void setComensalesMesa(int comensalesMesa) {
		this.comensalesMesa = comensalesMesa;
	}

	public boolean isEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(boolean estadoMesa) {
		this.estadoMesa = estadoMesa;
	}

	
	//toString
	@Override
	public String toString() {
		return "Mesa [idMesa=" + idMesa + ", numeroMesa=" + numeroMesa + ", comensalesMesa=" + comensalesMesa
				+ ", estadoMesa=" + estadoMesa + "]";
	}
    
    
    
    
    
    
    
    
    
    
    
    
}
