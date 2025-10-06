package sentenciasSeleccion;

public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String calificacion;
		int nota = 8;
		
		//Calificación es suspenso si nota <7 o aprobado si nota >=7
		
		/*if(nota < 7) {
			calificacion = "Suspenso";
		}
		else {
			calificacion = "Aprobado";
		}*/
		
		calificacion = nota < 7 ? "Suspenso" : "Aprobado";
		
		
		
	}

}
