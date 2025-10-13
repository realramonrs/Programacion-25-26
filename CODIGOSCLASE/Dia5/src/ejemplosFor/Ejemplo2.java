package ejemplosFor;

import java.util.Random;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Llenar un array con números aleatorios entre 0 y 10
		//Mostrar el array por pantalla
		//En aquellas posiciones donde haya un 0 poner un número negativo
		//Mostrar la posición en la que se encuentra el primer número negativo
		int[] valores = new int[20];
		Random generador = new Random();
		
		for(int i = 0;i<valores.length;i++) {
			valores[i] = generador.nextInt(0,11);
		}
		
		//Mostrar el array generado por pantalla
		for(int valor : valores) {
			System.out.print(valor + " ");
		}
		System.out.println();
		//Cambiar posiciones en las que haya un cero por un numero negativo
		for(int i = 0;i<valores.length;i++) {
			if(valores[i]==0) {
				valores[i] = -1;
			}
		}
		
		//Mostrar otra vez el array generado
		for(int valor : valores) {
			System.out.print(valor + " ");
		}
		System.out.println();
		//Posición en la que está el primer número negativo:
		int posicion = -1;
		boolean encontrado = false;
		for(int i = 0;i<valores.length;i++) {
			if(valores[i]<0) {
				posicion = i;
				encontrado = true;
				System.out.println("Posición  negativo : " + (i + 1));
				break;
			}			
		}
		
		if(!encontrado) {
			System.out.println("No hay números negativos");
		}
		if(posicion<0) {
			System.out.println("No hay números negativos");
		}
		
		
		
		
	}

}
