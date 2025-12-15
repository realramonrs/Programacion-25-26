package interfaces;

public abstract class Vehiculo implements Conducible {

	private int velocidadActual;
	private String marca;
	public Vehiculo( String marca) {
		super();
		this.marca = marca;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", marca=" + marca + "]";
	}
	
	
}
