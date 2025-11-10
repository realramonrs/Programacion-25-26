package utilidades;

import java.util.Arrays;
import java.util.Random;

public class MetodosArrays {

	//Método que muestra por Consola el array que recibe como argumento
		public static void mostrarArray(int[] x) {
			
			for(int valor : x) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
		public static void mostrarArray(int[][] x) {
			
			for(int[] fila : x) {
				mostrarArray(fila);
			}			
		}
	
	//Método que llena un array con valores de tipo int aleatorio
	
		public static void llenarArray(int[] x) {
			Random generador = new Random();
			
			for(int i = 0;i<x.length;i++) {
				x[i] = generador.nextInt();
			}
		}
		
		public static void llenarArray(int[] x,int limite) {
			Random generador = new Random();
			
			for(int i = 0;i<x.length;i++) {
				x[i] = generador.nextInt(limite+1);
			}
		}
		
		public static void llenarArray(int[] x,int limiteInferior,int limiteSuperior) {
			Random generador = new Random();
			
			for(int i = 0;i<x.length;i++) {
				x[i] = generador.nextInt(limiteInferior,limiteSuperior + 1);
			}
		}
	// Método que calcula la suma de los elementos de un array de tipo int
	public static int sumaMatriz(int[] x) {
		int suma = 0;
		
		for(int valor : x) {
			suma = suma + valor;
		}
		
		return suma;
	}
	
	//Sobrecargar el método anterior para que trabaje con arrays de tipo double
	public static double sumaMatriz(double[] x) {
		double suma = 0;
		
		for(double valor : x) {
			suma = suma + valor;
		}
		
		return suma;
	}
	
	//Calcular un método que calcula la media de una matriz de tipo int
	
	public static double calcularMediaMatriz(int[] x) {
		int capacidad = x.length;
		return (double)sumaMatriz(x)/x.length;
		
	}
	
	//Método que calcula la suma de todas las filas de un array 2D
	//1 4 5   -> sumaFila0
	//3 4 9   -> sumaFila1
	// ...    -> sumaFilaN   -> int[] 
	public static int[] getSumasFilasArray2D (int[][] x) {
		int[] sumas = new int[x.length];
		/*int posicion = 0;
		for(int[] fila : x) {
			sumas[posicion] = sumaMatriz(fila);
		}*/
		for(int indice = 0;indice<x.length;indice++) {
			sumas[indice] = sumaMatriz(x[indice]);
		}
		
	/*	for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x[i].length;j++) {
				sumas[i] = sumas[i] + x[i][j];				
			}
		}*/		
		
		return sumas;
	}
	
	//Método que devuelve el valor que ocupa una posición 
	
	/**
	 * Este método devuelve el valor que ocupa una determinada posición en el array que
	 * recibe como argumento.
	 * @param x -> Es el array en el que se realiza la búsqueda
	 * @param posicion -> Es el índice del cuál quiero saber el valor que contiene
	 * @return Devuelve el valor que está en la posición que recibe como parámtro
	 * @throws Exception Lanza una excepción si el índice está fuera de los límites de la matriz
	 * @author Ramón RS
	 * @see Si quieres saber más mira el método ....
	 */
	
	public static int getValueByIndex(int[] x,int posicion) throws Exception   {
		
		if(posicion<0 || posicion>= x.length) {
			throw new Exception("Error , el valor de la posición excede los límites de la matriz");
		}			
			return  x[posicion];
		
		
	}
	
	//Método que permita redimensionar un array
	public static void redimArray(int[] original) {
		//1. Crear una nueva matriz del tamaño deseado, en este ejemplo, el doble
		int[] copia = new int[original.length*2];
		//2. Volcar los valores a la copia
		Arrays.copyOf(original, original.length);
		//3. Igualar la copia al original
		original = copia;
	}
	
	public static float[] redimArray(float[] original) {
		//1. Crear una nueva matriz del tamaño deseado, en este ejemplo, el doble
		float[] copia = new float[original.length*2];
		//2. Volcar los valores a la copia
		copia = Arrays.copyOf(original, original.length*2);
		//LLenar el resto de posiciones con el valor -300
		/*for(int i = original.length;i<copia.length;i++) {
			copia[i] = -300;
		}*/
		//3. Devuelvo el array generado
		return copia;
	}
	
	public static float[] redimArray(float[] original,float valorPosVacia) {
		//1. Crear una nueva matriz del tamaño deseado, en este ejemplo, el doble
		float[] copia = new float[original.length*2];
		//2. Volcar los valores a la copia
		copia = Arrays.copyOf(original, original.length*2);
		//LLenar el resto de posiciones con el valor -300
		for(int i = original.length;i<copia.length;i++) {
			copia[i] = valorPosVacia;
		}
		//3. Devuelvo el array generado
		return copia;
	}
	
	
	
	
	
	
	
	
	
	
}
