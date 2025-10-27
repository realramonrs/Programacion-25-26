package metodos1;

public class TestMetodosReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prueba método sumar.
		int suma = MetodosReturn.sumar(6, 32);
		
		//Calcular la raiz cuadrada de la suma de dos numeros
		int a = 9;
		int b = 6;
		double raiz = Math.sqrt(MetodosReturn.sumar(a, b));
		
		
		//Prueba método CalcularMaximo
		int maximo = MetodosReturn.calcularMaximo(10, 6, 4);
		
		System.out.println("El máximo es : " + MetodosReturn.calcularMaximo(3, 9, 1));
	
		//Prueba método buscar en Array
		int[] matriz = {4,5,6,7,8,9};
		
		int posicion = MetodosReturn.buscarEnArray(matriz, 4);
		int posicion2 = MetodosReturn.buscarEnArray(matriz, 0);
		
		//Informo al usuario de si está el valor o no
		
		if(posicion == - 1) {
			System.out.println("No se encontró el valor buscado");
		}
		else {
			System.out.println("Está en la posición: " + posicion);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
