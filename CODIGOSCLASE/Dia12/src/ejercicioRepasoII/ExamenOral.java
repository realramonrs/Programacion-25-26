package ejercicioRepasoII;

import java.time.LocalDate;

public class  ExamenOral extends Examen {
	
	private NivelSatisfaccion ns;

	public ExamenOral(LocalDate fecha, NivelSatisfaccion ns) {
		super(fecha);
		this.ns = ns;
	}

	public NivelSatisfaccion getNs() {
		return ns;
	}

	public void setNs(NivelSatisfaccion ns) {
		this.ns = ns;
	}

	@Override
	public String toString() {
		return "ExamenOral [ns=" + ns + ", " + super.toString() + "]";
	}

	@Override
	public boolean isAprobado() {
		// TODO Auto-generated method stub
		if(ns==NivelSatisfaccion.excelente || ns == NivelSatisfaccion.suficiente) {
			return true;
		}
		return false;
	}
	
	
	
	
	

}
