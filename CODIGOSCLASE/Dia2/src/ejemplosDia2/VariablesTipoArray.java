package ejemplosDia2;

import java.util.Arrays;

public class VariablesTipoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ARRAY: CONJUNTO DE VALORES DE UN MISMO TIPO
		int[] valores = {7,5,2,1,1,3,8,9}; //Array con tamaño 8
		byte[] valores2 = new byte[10]; // Array con capacidad para 10 varables de tipo Byte
		
		//Un array indexa los valores que almacena
		//El primer elemento tiene de índice 0 
		//El último elemento tiene de índice : capacidad - 1
		//Para acceder a una determinada posición:
		int valor1 = valores[0];
		int ultimoValor = valores[7];
		
		valores2[0] = 4;
		valores2[1] = 5;
		valores2[9] = 3;
		
		//Obtener el tamaño de un array: propiedad .length
		int capacidad = valores.length;
		//Acceder de forma segura a la última pos de un array
		ultimoValor = valores[valores.length - 1];
		System.out.println("Ultimo valor " + ultimoValor);
		
		//Quiero ver un array por pantalla
		System.out.println(valores);
		System.out.println(valores[0] + " " + valores[1] + " " + valores[2]);
		System.out.println(Arrays.toString(valores));
		System.out.println(Arrays.toString(valores2));
		
		//Copiar los elementos de un Array
		int[] copia = new int[valores.length] ;
		/*copia[0] = valores[0];
		copia[1] = valores[1];
		copia[2] = valores[2];
		copia[3] = valores[3];
		copia[4] = valores[4];
		copia[5] = valores[5];*/
		
		copia = Arrays.copyOf(valores, valores.length);
		
		//Ordenar los elementos de un array : sort
		
		Arrays.sort(valores);
		System.out.println("Array valores ordenado: ");
		System.out.println(Arrays.toString(valores));
		System.out.println("Copia ordenada? ");
		System.out.println(Arrays.toString(copia));
		
		//Buscar valores en un array:
		
		int posicion = Arrays.binarySearch(valores, 1);
		System.out.println("El 1 está en la posición: " + posicion);
		
		//Comprobar si dos arrays son iguales:
		int[] x1 = {1,2,3,4};
		int[] x2 = {1,2,3,4};
		
		boolean iguales = Arrays.equals(x1,x2);
		
		System.out.println(Arrays.toString(x1));
		System.out.println(Arrays.toString(x2));
		System.out.println("Son iguales ? : " + iguales);
		
		
		
	}

}
