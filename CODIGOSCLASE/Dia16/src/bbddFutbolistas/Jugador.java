package bbddFutbolistas;

public class Jugador {

	private String codigo;
	private String nombre;
	private String posicion;
	private String equipo;
	private double valoracion;
	private int goles;
	private int minutos;
	public Jugador(String codigo, String nombre, String posicion, String equipo, double valoracion, int goles,
			int minutos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.posicion = posicion;
		this.equipo = equipo;
		this.valoracion = valoracion;
		this.goles = goles;
		this.minutos = minutos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public double getValoracion() {
		return valoracion;
	}
	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	
	
	
}
