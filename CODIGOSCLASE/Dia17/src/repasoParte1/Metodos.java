package repasoParte1;

import java.util.Random;

public class Metodos {
	
	//Método que calcula el mínimo en un Array 1D
	int x;
	
	
	public static int calcMinimo(int[] valores) {
		
		int minimo = valores[0];
		
		for(int i = 1;i<valores.length;i++) {
			if(valores[i]<minimo) {
				minimo = valores[i];
			}
		}
		return minimo;
		
	}
	
	//Método que valida si un String está formado por dos caractes: letra + digito
	public static boolean validarString(String cadena) {
		
		boolean formato = true;
		if(cadena.length()==2) {
			if(!Character.isLetter(cadena.charAt(0))||!Character.isDigit(cadena.charAt(1))) {
				formato = false;
			}			
		}
		else {
			formato = false;
			
		}
		return formato;
	}
	
	//Método que el primer cero en una matriz de 2D y muestrar por pantalla la fila y la columna
	
	public static void buscarPrimerCero(int[][] matriz) {
		
		int fila = -1;
		int col = -1;
		boolean encontrado = false;
		
		
		for(int i = 0;i<matriz.length;i++) {
			
			for(int j = 0;j<matriz[i].length;j++) {
				if(matriz[i][j] == 0) {
					fila = i;
					col = j;
					encontrado = true;
					break;
				}
			} //Cierra for j
			if(encontrado) {
				break;
			}
		}// Cierra for i
		
		if(fila==-1) {
			System.out.println("No hay ceros en la matriz");
		}
		else {
			System.out.println("El primer cero está en la fila : " + fila + " col : " + col);
		}
	}
	
	public static void llenarArray2D(int[][] array2D, int limInferior,int limSuperior) {
	
		Random generador = new Random();
		for(int i = 0;i<array2D.length;i++) {
			for(int j = 0;j<array2D[i].length;j++) {
				array2D[i][j] = generador.nextInt(limInferior, limSuperior + 1);
			}
		}
	}
	
	public static void mostrarMatriz(int[][] m) {
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void mostrarMatriz(double[][] m) {
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void mostrarMatriz(int[] m) {
		
		for(int valor : m) {
			System.out.print(valor + " ");
		}
		System.out.println();		
	}
	
	
	
	
	

}
