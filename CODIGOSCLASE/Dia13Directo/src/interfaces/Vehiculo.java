package interfaces;

public abstract class Vehiculo implements Conducible {
	
	protected int velocidadActual;
	private String marca;
	
	public Vehiculo(int velocidadActual, String marca) {
		super();
		this.velocidadActual = velocidadActual;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	

	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", marca=" + marca + "]";
	}

	@Override
	public void frenar() {
		this.velocidadActual = 0;
		
	}
	
	

}
