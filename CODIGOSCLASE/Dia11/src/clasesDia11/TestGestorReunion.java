package clasesDia11;

public class TestGestorReunion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestorReunion gr = new GestorReunion(10);
		
		//Añadir reuniones
		gr.addReunion("E3", "Análisis Presupuesto", 2025, 11, 24);
		gr.addReunion("E4", "Comunicación Noviembre", 2025, 12, 2);
		gr.addReunion("E5", "Sustitución baja paternidad", 2025, 11, 24);
		gr.addReunion("E6", "Preparación lanzamiento producto", 2026, 2, 1);
		
		//Obtener reunión a partir del código
		
		Reunion r = gr.getReunionById("E3");
		
		System.out.println("Info de la reunión: E3 ");
		System.out.println(r);
		
		//Tomar notas de la reunión E5
		gr.addAnotacion("E5", "Empieza el lunes 5 de febrero");
		gr.addAnotacion("E5", "Hablar con RRHH para que acuerden horario inicial");
		
		System.out.println("Info de la reunión: E5 ");
		System.out.println(gr.getReunionById("E5"));
		
		//Mostrar reuniones de hoy
		Reunion[] hoy = gr.getReunionesToday();
		
		System.out.println("Reuniones de hoy: ");
		for(Reunion reunion : hoy) {
			if(reunion!=null)
			System.out.println(reunion);
		}
		
		
		
		
		
		
		
		
		
	}

}
