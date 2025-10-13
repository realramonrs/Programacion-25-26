package ejemplosFor;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que muestra todos los números entre 1 y 10
		//Variable de control -> inicializar -> condición de continuidad -> modificarse dentro del bucle
	
		for(int i = 1;i<=10;i=i+1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Programa que muestra por pantalla los valores de un array de enteros
		int[] valores = {5,6,7,3,2,1,5,6,7};
		
		for(int i = 0;i<valores.length;i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
	
		//Programa que muestra los números pares almacenados en el array
		System.out.println("Valores pares del array: ");
		for(int i = 0;i<valores.length;i++) {
		
			if(valores[i] % 2 == 0) {
				System.out.print(valores[i] + " ");
			}
			
		}
		
		
		
	}

}
