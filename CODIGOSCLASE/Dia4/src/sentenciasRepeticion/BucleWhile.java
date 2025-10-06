package sentenciasRepeticion;

import java.util.Arrays;
import java.util.Random;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ej 1: Programa que muestra los números del 1 al 50
		
		int i = 1;
		
		while(i <= 50) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("**************** EJEMPLO 2 ****************");
		//Ej 2: Programa que llena una matriz con números aleatorios entre -10 y 10
	    int[] matriz = new int[20];
	    Random generador = new Random();
	    int j = 0;
	    while(j<matriz.length) {
	    	matriz[j] = generador.nextInt(-10, 11);
	    	j++;
	    }
	    System.out.println("Matriz generada:");
	    System.out.println(Arrays.toString(matriz));
	    
	
	    //Ej 3: Programa que muestra los valores pares almacenados en la matriz
		
		System.out.println("****************   EJEMPLO 3   ****************");
		//reseteamos variable j
		j = 0;
		System.out.println("Valores pares de la matriz: ");
		while(j < matriz.length) {
			if(matriz[j] % 2 == 0) {
				System.out.print(matriz[j] + " ");
				}
			j++;
		}
		System.out.println();
		
		//Ej 4: Programa que calcula la suma de los valores de una matriz
		int suma = 0;
		//reseteamos variable j
		j = 0;
		
	//	suma = matriz[0] + matriz[1] + matriz[2] + matriz[3]
		while(j<matriz.length) {
			suma = suma + matriz[j];
			j++;
		}
			System.out.println("La suma es : " + suma);
			
			System.out.println("**************  EJEMPLO 5  *************");
		//Ej 5: Programa que indica si un número es primo
		//Un número es primo cuando sólo es divisible entre 1 y si mismo
		//No tiene divisores dstintos de 1 y de si mismo
		//Ejemplo : 7 , 11, 13, 17, 19,23, 29,31 ---   8 , 9,, 100 -> 50, 
		int numero = 80000000;
		boolean primo = true;
		int k = 2;
		
		while(k<= numero/2) {
			
			if(numero % k == 0) {
				primo = false;
				break; //Salida prematura de un bucle.
			}
			k++;
		}
		
		if(primo) {
			System.out.println("Número primo");
		}
		else {
			System.out.println("Número no primo");
		}
		
		
		System.out.println("********** EJEMPLO 6: BUCLES WHILE ANIDADOS ***********");
		//Mostrar por pantalla todos los números primos de una matriz
		int[] valores = {31,6,7,13,9,8,11,17,14,16,15,23};
		
		//reseteamos i, j 
		i = 0;
		j = 0;
		
		while(i<valores.length) {
			//reseteamos variable booleana primo
			primo = true;
			j=2;
			while(j<=valores[i]/2) {
				if(valores[i] % j == 0) {
					primo = false;
					break;//Salida prematura del while interno
				}
				j++;
			} //Final del while interno
			
			if(primo) {
				System.out.print(valores[i] + " ");
			}
			
			i++;
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		//DIFERENCIA ENTRE WHILE Y DO WHILE
		int z = 10;
		while(z < 10) {
			System.out.println("BUCLE WHILE CON VARIABLE Z");
			z++;
		}
		
		do {
			System.out.println("BUCLE WHILE CON VARIABLE Z");
			z++;
		}
		while(z < 10);
		
	}

}
