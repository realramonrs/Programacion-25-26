package ejemplosDia3;

import java.util.Scanner;

public class LecturaConScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dni,email,telefono;
		int edad;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce tu dni:");
		dni = lector.next();
		System.out.println("DNI introducido: " + dni);
		System.out.println("Introduce tu email: ");
		email = lector.next();
		
		System.out.println("Email: " + email);
		
		System.out.println("Introduce tu edad: ");
		edad = lector.nextInt();
		
		System.out.println("Edad : " + edad);
		
		System.out.println("Introduce tu teléfono:");
		telefono = lector.next();
		
		
		System.out.println("Telefono: " + telefono);
		
		lector.close();
	}

}
