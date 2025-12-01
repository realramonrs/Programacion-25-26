package ejercicioRepasoII;

import java.time.LocalDate;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Examen ex1 = new ExamenEscrito(LocalDate.now(),80, 7);
		Examen ex2 = new ExamenEscrito(LocalDate.now(),80, 6);
		Examen ex3 = new ExamenOral(LocalDate.now(),NivelSatisfaccion.insuficiente);
		Examen ex4 = new ExamenOral(LocalDate.now(),NivelSatisfaccion.suficiente);
		
		Alumno a1 = new Alumno("PEPITO");
		a1.asignarExamen(ex1);
		a1.asignarExamen(ex2);
		a1.asignarExamen(ex3);
		a1.asignarExamen(ex4);
		
		if(a1.evaluar()) {
			System.out.println("Enhorabuena!!!!");
		}
		else {
			System.out.println("Vaya , estás suspenso...:(");
		}
		
		//Mostrar por pantalla la media del alumno
		System.out.println(a1.getMedia());

	}

}
