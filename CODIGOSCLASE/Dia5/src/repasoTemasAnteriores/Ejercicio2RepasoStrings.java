package repasoTemasAnteriores;

import java.util.Scanner;

public class Ejercicio2RepasoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que pide al usuario que introduzca un password que cumpla las siguientes condiciones:
		//Tener al menos 4 caracteres
		//Tener al menos una mayúscula
		//No puede empezar por un número
		//El usuario tiene 3 oportunidades para introducir el password correctamente
		String password;
		boolean correcto;
		Scanner lector = new Scanner(System.in);
		int contador = 0;
		do {
			contador++;
			
			switch(contador) {
			case 2:
				System.out.println("Te quedan 2 intentos");
				break;
			case 3:
				System.out.println("Te queda 1 intento");
				break;
			}
			
		System.out.println("Introduce un password");
		password = lector.next();
		
		correcto = false;
		
				
		if(password.length()>=4) {
			if(!Character.isDigit(password.charAt(0))) {
				if(!password.equals(password.toLowerCase())){
					correcto = true;
				}
				else {
					System.out.println("Debe tener al menos una mayúscula.");
				}
			}
			else {
				System.out.println("No puede empezar por un digito.");
			}
		}
		else {
			System.out.println("Debe tener al menos 4 caracteres");
		}
		
		if(correcto) {
			System.out.println("EL password es correcto");
		}
		else {
			System.out.println("El password no es correcto.");
		}
		
		}while(!correcto && contador<3);
		
		if(contador == 3) {
			System.out.println("Has agotado todos los intentos.");
		}
	}

}
