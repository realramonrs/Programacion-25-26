package sentenciasSeleccion;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Menú usuario:
		// a) El programa da los buenos días
		// b) Mensaje optimista aleatorio
		// c) Mensaje pesimista aleatorio
		char opcion;
		boolean error = false;
		
		do {
			error = false;
			System.out.println("ESCOJA UNA OPCIÓN:\na) El programa da los buenos días\n"
					+ "b) Mensaje optimista aleatorio\n"
					+ "c) Mensaje pesimista aleatorio");
				//Leer la opción que el usuario introdujo por teclado
				Scanner lector = new Scanner(System.in);
				//String opcion = lector.next();
				 opcion = lector.next().charAt(0);
				
				switch(opcion) {
				case 'a':
					System.out.println("Muy buenos días !!!!");
					break;
				case 'b':
					System.out.println("El celta se salvará esta temporada y tu vas a verlo!!");
					break;
				case 'c':
					System.out.println("Seguirá subiendo el precio de la gasolina y el diesel!!");
					break;
				default:
					System.out.println("Opción no válida.");
					error = true;
					break;
					
				}
		
		} while(error);     //while(opcion != 'a' && opcion!='b' && opcion!='c');
		
	}

}
