package introMetodos;

import java.util.Random;

public class Utiles {
	
	public static void llenarMatriz(int[] x) {
		Random generador = new Random();
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt(50);
		}
	}
	
	//Método que calcula la suma de los elementos de un array
	static int sumaMatriz(int[] x) {
		int suma = 0;
		
		for(int valor : x) {
			suma = suma + valor;
			
		}
		return suma;
		
	}

}
