package soluciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][10];
		Random aleatorio = new Random();

		//Llenamos la matriz con valores en el rango -10 , 10

		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				matriz[i][j] = aleatorio.nextInt(-5,6);
			}
		}

		//Mostramos la matriz generada
		System.out.println("***********  La matriz generada es la siguiente:  *********");
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Apartado a) Mostrar fila cuyo índice introduce el usuario por teclado
				
		System.out.println();
		System.out.println("************ Apartado a) *************");
		System.out.println();
		int indice = -1;
		System.out.println("Intro fila que deseas visualizar: ");
		indice = new Scanner(System.in).nextInt();
		for(int valor : matriz[indice]) {
			System.out.print(valor + " ");
		}
		System.out.println();

		//************************   Apartado b ***********************************

		System.out.println();
		System.out.println("************ Apartado d) *************");
		System.out.println();

		//Contar ceros en la fila 3 y en la fila 4
		int contador3 = 0, contador4 = 0;
		for(int i = 0;i<matriz[2].length;i++) {

			if(matriz[2][i]==0) {
				contador3++;
				break;
			}
		}

		for(int i = 0;i<matriz[matriz.length-1].length;i++) {

			if(matriz[matriz.length-1][i]==0) {
				contador4++;
				break;
			}
		}

		//Si en la fila 3 hay un cero y en la última no
		if(contador3>0&&contador4==0) {
			//Intercambiar filas pero debemos mostrar antes la matriz original 
			System.out.println("Matriz original: ");
			for(int i = 0;i<matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}

			//Intercambiamos elementos fila 2 con ultima fila


			for(int j = 0;j<matriz[2].length;j++) {

				int aux = matriz[2][j];
				matriz[2][j] = matriz[matriz.length-1][j];
				matriz[matriz.length-1][j] = aux;

			}

			System.out.println("Matriz intercambiadas fila 2 y última: ");
			for(int i = 0;i<matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}

		}

		//Apartado c
		System.out.println();
		System.out.println("************ Apartado c) *************");
		System.out.println();
		//Encontrar la columna que tenga más números positivos

		//Creamos un array para guardar la cuenta de números positivos de cada columna
		int[] positivos = new int[matriz[0].length];

		//Recorremos las columnas contando números positivos
		int cuentaPositivos = 0;
		int maximo = 0;
		int indiceColMasPositivos = 0;
		for(int col = 0;col<matriz[0].length;col++) {
			cuentaPositivos = 0;
			for(int fil = 0;fil<matriz.length;fil++) {
				if(matriz[fil][col]>0) {
					cuentaPositivos++;
				}
			}

			System.out.println("Positivos columna : " + col + " = " + cuentaPositivos);
			if(maximo<cuentaPositivos) {
				maximo = cuentaPositivos;
				indiceColMasPositivos = col;
			}

		}

		System.out.println("La columna con más positivos tiene índice: " + indiceColMasPositivos);
		System.out.println("Elementos columna con más positivos: ");
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i][indiceColMasPositivos] + " ");
		}
		System.out.println("");

		//Sumamos los elementos de esta columna
		int sumaColumnaMasPositivos = 0;

		for(int i = 0;i<matriz.length;i++) {
			sumaColumnaMasPositivos+=matriz[i][indiceColMasPositivos];
		}

		System.out.println("La suma de la columna con más positivos es : " + sumaColumnaMasPositivos);

		

	}//Fin de la clase

}
