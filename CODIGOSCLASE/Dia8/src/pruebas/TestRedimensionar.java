package pruebas;

import java.util.Scanner;

import utilidades.MetodosArrays;

public class TestRedimensionar {

	public static boolean guardarTemperatura(float[] temperaturas, float temp) {
		boolean guardado = false;
		//Guardar temperatura en la primera pos vacía
		for(int i = 0;i<temperaturas.length;i++) {
			if(temperaturas[i] == -300) {
				temperaturas[i] = temp;
				
				return true;
			}
		}		
		temperaturas = MetodosArrays.redimArray(temperaturas,-300);
		guardado = guardarTemperatura(temperaturas, temp);
		
		return guardado;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tenemos un programa que tiene que guardar temperaturas que introduce el usuario por teclado
		
		float[] temperaturas = new float[3];
		//Inicializar todas las posiciones de la matriz a valor absurdo:
		
		for(int i = 0;i<temperaturas.length;i++) {
			temperaturas[i] = -300;
		}
		
		int opcion;
		Scanner lector = new Scanner(System.in);
		boolean continuar;
		do {
		System.out.println("Escoja una opción: "); 
		System.out.println("1. Mostrar matriz de temperaturas: ");
		System.out.println("2. Introducir un nuevo registro: ");
		System.out.println("3. Obtener la temperatura máxima");
		System.out.println("4. Salir del programa.");
		opcion = lector.nextInt();
		continuar = true;
		switch(opcion) {
		
		case 1:
				System.out.println("Las temperaturas registradas son:");
				for(float temp : temperaturas) {
					System.out.print(temp + " ");
				}
				System.out.println();
			break;
		case 2:
			System.out.println("Introduce una temperatura: ");
			float temperatura = lector.nextFloat();
			
			guardarTemperatura(temperaturas, temperatura);
					
				
				for(float temp : temperaturas) {
					System.out.print(temp + " ");
				}
				System.out.println();
						
			break;
		case 3:
			break;
		case 4:
			continuar = false;
			break;
			default:
				System.out.println("Opción errónea vuelva a intentarlo.");
				break;
		}	
		
		
		}while(continuar);
		
	}

}
