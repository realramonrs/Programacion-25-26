package sentenciasSeleccion;

import java.util.Random;

public class EjemploIfsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Número par , mayores o menores que 100
		
		Random generador = new Random();
		int numero = generador.nextInt(201);
		
		if(numero % 2 == 0) {
			if(numero >= 100) {
				System.out.println("Número par y >= 100");
			}
			else {
				System.out.println("Número par y < 100");
			}
		}
		else {
			if(numero >= 100) {
				System.out.println("Número impar y >= 100.");
			}
			else {
				System.out.println("Número impar y < 100");
			}
			
		}		
		//Esto sería equivalente a
		if(numero % 2 == 0 && numero >= 100) {
			
			System.out.println("Número par y >= 100");
		}
		else if(numero % 2 == 0 && numero < 100) {
			System.out.println("Número par y < 100");
		}
		else if(numero % 2 != 0 && numero >= 100) {
			System.out.println("Número impar y >= 100.");
		}
		else {
			System.out.println("Número impar y < 100");
		}
		
	}

}
