package ejercicioRepasoII;

import java.time.LocalDate;

public class ExamenEscrito extends Examen {

	private int duracion;
	private int nota;
	
	public ExamenEscrito(LocalDate fecha, int duracion, int nota) {
		super(fecha);
		this.duracion = duracion;
		this.nota = nota;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "ExamenEscrito [duracion=" + duracion + " minutos , nota=" + nota + ", " + super.toString() + "]";
	}
	
	
	

	@Override
	public boolean isAprobado() {
		// TODO Auto-generated method stub
		if(duracion<90 && nota >= 6) {
			return true;
		}
		return false;
	}
	
	
	
	
}
