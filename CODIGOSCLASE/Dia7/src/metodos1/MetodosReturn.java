package metodos1;

public class MetodosReturn {
	
	//Concepto de método (función) -> Algoritmo al que se le pone un nombre
	//con la idea de poder reutilizarlo
	//Métodos se identifican univocamente por la firma: nombre 
	//,y el tipo y número de sus argumentos
	
	//Método que calcula la suma de dos números(acceso público)
	
	public static int sumar(int x,int y) {
		
		int suma = x + y;			
		return suma;
		
	}
	
	//Método que obtiene (devuelve) el mayor de 3 números (acceso de paquete)
	
	static int calcularMaximo(int a, int b, int c) {
		
		//Calcula el mayor entre a y b
		int mayor = Math.max(a, b);
		if(c > mayor) {
			return c;
		}
		else {
			return mayor;
		}
	}
	
	//Método que busca un valor en un array y devuelve la posición de la primera aparición
	//acceso publico
	public static int buscarEnArray(int[] matriz,int valor) {
		
		for(int i = 0; i < matriz.length;i++) {
			if(matriz[i] == valor) {
				return i;
			}
		}
		//Esta línea sólo se ejecuta si no entró en el if
		return -1;
		
		
	/*	int posicion = -1;
		for(int i = 0; i < matriz.length;i++) {
			if(matriz[i] == valor) {
				posicion = i;
				break;
			}
		}
		return posicion;
		
		*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
