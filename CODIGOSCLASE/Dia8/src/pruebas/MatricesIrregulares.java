package pruebas;

public class MatricesIrregulares {
	
	/**
	 * Clase que representa una matriz irregular (jagged array) y permite
	 * operaciones básicas como imprimirla, sumar elementos de cada fila
	 * y encontrar la fila con más columnas.
	 * 
	 * Ejemplo de uso:
	 * <pre>
	 * MatrizIrregularEjemplo matriz = new MatrizIrregularEjemplo();
	 * matriz.imprimirMatriz();
	 * matriz.sumarFilas();
	 * matriz.filaConMasColumnas();
	 * </pre>
	 * 
	 * @author José
	 * @version 1.0
	 */

	   int[][] matriz = new int[][]{
	            {2, 5, 7},
	            {1, 2},
	            {8, 9, 10, 11}
	        };
	    

	    /**
	     * Imprime la matriz irregular por consola.
	     * Cada fila puede tener un número distinto de columnas.
	     */
	    public void imprimirMatriz() {
	        System.out.println("Matriz irregular:");
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    /**
	     * Calcula y muestra la suma de los elementos de cada fila.
	     */
	    public void sumarFilas() {
	        for (int i = 0; i < matriz.length; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < matriz[i].length; j++) {
	                sumaFila += matriz[i][j];
	            }
	            System.out.println("Suma de la fila " + i + ": " + sumaFila);
	        }
	    }

	    /**
	     * Encuentra la fila con más columnas y la muestra por consola.
	     */
	    public void filaConMasColumnas() {
	        int filaMasColumnas = 0;
	        for (int i = 1; i < matriz.length; i++) {
	            if (matriz[i].length > matriz[filaMasColumnas].length) {
	                filaMasColumnas = i;
	            }
	        }
	        System.out.println("La fila con más columnas es la fila " + filaMasColumnas +
	                " con " + matriz[filaMasColumnas].length + " elementos.");
	    }
	    
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
