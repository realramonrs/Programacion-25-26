package metodos1;

import java.util.Random;

public class MetodosVoid {

	//Son métodos que no devuelven ningún valor:
	//Normalmente porque modifican el valor de alguno de los argumentos que reciben
	//O porque directamente lo envían a un medio externo al programa: Consola, fichero, bbdd, 
	
	//Método que llena una matriz de enteros con números aleatorios(acceso público)
	public static void llenarArray(int[] x) {
		Random generador = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt();
		}
	}
	
	public static void llenarArray(float[] x) {
		Random generador = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextFloat();
		}
	}
	
	public static void llenarArray(int[] x,int limite) {
		Random generador = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt(limite+1);
		}
	}
	
	public static void llenarArray(float[] x,float limite) {
		Random generador = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextFloat(limite+1);
		}
	}	
	
	public static void llenarArray(int[] x,int limiteInferior,int limiteSuperior) {
		Random generador = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt(limiteInferior,limiteSuperior + 1);
		}
	}
	
	public static void llenarArray(float[] x,float limiteInferior,float limiteSuperior) {
		Random generador = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextFloat(limiteInferior,limiteSuperior + 1);
		}
	}
	
	
	//Método que muestra por Consola el array que recibe como argumento
	public static void mostrarArray(int[] x) {
		
		for(int valor : x) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	public static void mostrarArray(float[] x) {
			
			for(float valor : x) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
	
	
}
