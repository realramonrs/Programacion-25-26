package practica;

public abstract class ObjetoEspacial {

	private String nombre;
	private double masa;
	private double velocidad;
	private double distancia;
	public ObjetoEspacial(String nombre, double masa, double velocidad, double distancia) {
		super();
		this.nombre = nombre;
		this.masa = masa;
		this.velocidad = velocidad;
		this.distancia = distancia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	@Override
	public String toString() {
		return "ObjetoEspacial [nombre=" + nombre + ", masa=" + masa + ", velocidad=" + velocidad + ", distancia="
				+ distancia + "]";
	}
	
	//Desintegración
	public abstract void desintegrar();
}
