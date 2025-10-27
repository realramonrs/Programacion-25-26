package metodos3;

public class MetodosMatrices {

	//Método que devuelve una matriz con los valores negativos de una matriz que
	//recibe como argumento
	
	//1º Crear un método auxiliar que obtenga la cantidad de números negativos
	private static int contarNegativos(int[] x) {
		int contador = 0;
		for(int valor : x) {
			if(valor< 0) {
				contador++;
			}
		}
		return contador;
	}
	
	//2º Creo el método que devuelve el array de números negativos
	
	public static int[] obtenerArrayNegativos(int[] matriz) {
		int cantidad = contarNegativos(matriz);
		int[] negativos = new int[cantidad];
		int contador = 0;
		
		for(int valor : matriz) {
			if(valor < 0) {
				negativos[contador] = valor;
				contador++;
			}
		}
		return negativos;
			
	}
	
	
	
	
	
}
