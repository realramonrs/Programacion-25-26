package ficheros;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Recuperar el contenido del fichero Series
		ArrayList<Serie> series = Utilidades.getDatosFicheroSeries();
		
		System.out.println("Escoge una opción: ");
		System.out.println("1. Ver series guardadas");
		System.out.println("2. Obtener series por plataforma.");
		System.out.println("3. Añadir una nueva serie.");
		
		
		int opcion = 1;
		
		switch(opcion) {
		case 1:
			System.out.println("Las series guardadas son: ");
			for(Serie s : series) {
				System.out.println(s);
			}
			break;
		case 3:
			Scanner lector = new Scanner(System.in);
			System.out.println("Introduzca el titulo");
			String titulo = lector.nextLine();
			System.out.println("Introduzca la plataforma: ");
			String plataforma = lector.nextLine();
			Utilidades.addRegistro(titulo, plataforma);
			series = Utilidades.getDatosFicheroSeries();
			
		}
	}

}
