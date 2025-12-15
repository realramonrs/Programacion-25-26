package interfaceComparable;

import java.util.Comparator;

public class Jugador implements Comparable<Jugador> {

	private String nombre;
	private int puntos;
	public Jugador(String nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		//Integer i2 = this.puntos;
		//return i2.compareTo(o.getPuntos());
		
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	
}
