package ejercicioRepasoII;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {

	private ArrayList<Examen> examenes;
	private String nombre;
	public Alumno(String nombre) {
		super();
		this.examenes = new ArrayList<Examen>();
		this.nombre = nombre;
	}
	
	//Asignar examenes al alumno
	public void asignarExamen(Examen ex) {
		examenes.add(ex);
	}
	
	public void asignarExamenEscrito(LocalDate fecha,int duracion,int nota) {
		examenes.add(new ExamenEscrito(fecha , duracion, nota));
	}
	
	public void asignarExamenOral(LocalDate fecha,NivelSatisfaccion ns) {
		examenes.add(new ExamenOral(fecha,ns));
	}
	
	//Calcular media de todos los exámenes escritos
	
	public double getMedia() {
		int suma = 0;
		int contador = 0;
		for(Examen ex : examenes) {
			if(ex instanceof ExamenEscrito) {
				contador++;
				ExamenEscrito exEsc = (ExamenEscrito)ex;
				suma+= exEsc.getNota();
			}
		}
		return (double)suma/contador;
	}
	
	
	//Método que indique si un alumno está aprobado
	
	public boolean evaluar() {
				
		//Si todos los exámenes están aprobados devuelve true
		for(Examen ex : examenes) {
			if(ex.isAprobado()==false) {
				return false;
			}
		}
		
		return true;
	}
	
	//Método que muestre todos los exámenes realizados
	public void mostrarInfo() {
		for(Examen ex : examenes) {
			System.out.println(ex);
		}
	}
	
	
	
	
}
