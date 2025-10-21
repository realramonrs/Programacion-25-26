package matrices2D;

import java.util.Random;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar matriz2D con 4 filas y 5 columnas
		//Llenarla con números aleatorios entre 0 y 50
		//Mostrar por pantalla la matriz generada
		//Calcular la suma de la primera fila
		//Contar números pares de la última columna
		
		int[][] matriz = new int[7][3];
		//Propiedad length -> el número de filas de la matriz
		int numFilas = matriz.length;
		int columnas = matriz[0].length;
		System.out.println("La matriz tiene " + numFilas + " filas");
		
		Random generador = new Random();
		//Recorrer la matriz
		for(int fila = 0;fila<numFilas;fila++) {
			for(int col = 0;col<matriz[fila].length;col++) {
				matriz[fila][col] = generador.nextInt(51);
			}
		}
		//Mostrar por pantalla la matriz generada
		for(int fila = 0;fila<numFilas;fila++) {
			for(int col = 0;col<matriz[fila].length;col++) {
				System.out.print(matriz[fila][col] + " ");
			}
			System.out.println();
		}
		
		//Calcular suma de los valores de la primera fila
		int suma = 0;
		for(int i = 0;i<matriz[0].length ;i++) {
			suma = suma + matriz[0][i];
		}
		System.out.println("La suma de la primera fila es: " + suma);
		
		//Contar pares última fila
		int contador = 0;
		
		for(int j = 0;j<matriz.length;j++) {
			if(matriz[j][matriz[j].length - 1] % 2 == 0) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " números pares.");
		
		//Se puede recorrer una matriz 2D con bucles for mejorado
		//REpaso con un array de 1D
		int[] a = {6,7,5,4,3,1};
		for(int valor : a) {
			System.out.print(valor + " ");
		}
		System.out.println();
		
		//Mostramos la matriz 2D con un for mejorado
		for(int[] fila : matriz) {
			for(int valor : fila) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
