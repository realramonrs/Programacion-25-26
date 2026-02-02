package repasoParte2;

public abstract class Mensaje {

	private String destino;
	private String origen;
	
	
	public Mensaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mensaje(String origen, String destino) {
		super();
		this.destino = destino;
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public abstract void enviarMensaje(String mensaje);
	@Override
	public String toString() {
		return "Mensaje [destino=" + destino + ", origen=" + origen + "]";
	}
	
	
}
