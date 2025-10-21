package ejemplosRepaso;

import java.util.Random;

import introMetodos.Utiles;

public class Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[1500000];
		Random generador = new Random();
		
		for(int i = 0;i<numeros.length;i++) {
			numeros[i] = generador.nextInt(101);
		}
		Utiles.llenarMatriz(numeros);
		
		System.out.println("Matriz original: ");
		for(int i = 0;i<numeros.length;i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
		//Método de la burbuja: Ordenar de menor a mayor comparando elementos contiguos
	boolean intercambio = false;
	int iteraciones = 0;
	for(int j = 0;j<numeros.length;j++) {
		intercambio = false;
		
		for(int i = 0;i<numeros.length-j-1;i++) {
			iteraciones++;
			if(numeros[i]>numeros[i+1]) {
				int aux = numeros[i];
				numeros[i] = numeros[i+1];
				numeros[i + 1] = aux;
				intercambio = true;
			}
		}
		
		//Mostrar como queda la matriz:
	/*	System.out.println("Iteración número: " + (j + 1));
		for(int i = 0;i<numeros.length;i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();*/
		if(!intercambio) {
			System.out.println("Matriz ordenada!!!");
			System.out.println("Iteraciones: " + iteraciones);
			break;
		}
	}
		
		
	
	}

}
