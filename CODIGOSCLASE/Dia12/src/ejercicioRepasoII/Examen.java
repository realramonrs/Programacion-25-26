package ejercicioRepasoII;

import java.time.LocalDate;

public abstract class Examen {

	private LocalDate fecha;
	

	public Examen(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Examen [fecha=" + fecha + "]";
	}
	
			
	public abstract boolean isAprobado();
}
