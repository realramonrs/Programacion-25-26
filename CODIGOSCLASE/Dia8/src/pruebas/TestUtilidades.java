package pruebas;

import utilidades.MetodosArrays;

public class TestUtilidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = new int[5];
		MetodosArrays.llenarArray(a1, 10);
		MetodosArrays.mostrarArray(a1);
		
		double media = MetodosArrays.calcularMediaMatriz(a1);
		System.out.println("La media es : " + media);

		//Test método sumaFilasArray2D
		int[][] a2 = new int[3][3];
		
		for(int i = 0;i<a2.length;i++) {
			MetodosArrays.llenarArray(a2[i],10);
			}
		//Mostrar el array de 2D
		System.out.println("La matriz 2D es: ");
		MetodosArrays.mostrarArray(a2);
		int[] sumas = MetodosArrays.getSumasFilasArray2D(a2);
		
		System.out.println("Las sumas de las filas de la matriz 2D son");
		MetodosArrays.mostrarArray(sumas);
		
		//Forzar una excepcion en el método calcularMediaArray
		int capacidad = 0;
		int[] matriz = new int[capacidad];
		System.out.println(matriz.length);
		
		MetodosArrays.calcularMediaMatriz(matriz);
		
		//Prueba método getValueByIndex capturando la Exception que lanza
		int[] a3 = {9,8,4,3,0};
		int valor = -1;
		
		
			try {
				valor = MetodosArrays.getValueByIndex(a3, 5);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}	
				
		System.out.println("Valor posicion 0 = " + valor);
		
	}

}
