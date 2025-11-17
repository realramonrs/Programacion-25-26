package composicionObjetos;

public class Vehiculo {

	private Motor motor;
	private float velocidadMaxima;
	private float precio;
	
	public Vehiculo(Motor motor, float velocidadMaxima, float precio) {
		super();
		this.motor = motor;
		this.velocidadMaxima = velocidadMaxima;
		this.precio = precio;
	}
	
	public Vehiculo(String marca,int potencia,TipoMotor tpm,float velocidadMaxima, float precio) {
		this.motor = new Motor(marca,potencia,tpm);
		this.velocidadMaxima = velocidadMaxima;
		this.precio = precio;
	}	

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [motor=" + motor + ", velocidadMaxima=" + velocidadMaxima + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
