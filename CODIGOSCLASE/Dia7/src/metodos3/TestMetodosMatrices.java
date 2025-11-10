package metodos3;

import metodos1.MetodosVoid;

public class TestMetodosMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz = new int[10];
		MetodosVoid.llenarArray(matriz,-10,10);
		
		MetodosVoid.mostrarArray(matriz);
		
		int[] negativos = MetodosMatrices.obtenerArrayNegativos(matriz);
		
		MetodosVoid.mostrarArray(negativos);
		
		
		//Método para redimensionar una matriz
		//Concepto avanzado de clase.
		//Hacer ejercicios de repaso.
		
		
	}

}
