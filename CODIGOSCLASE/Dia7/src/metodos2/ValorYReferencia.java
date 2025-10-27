package metodos2;

import metodos1.MetodosVoid;

public class ValorYReferencia {
	//Las variables primitivas como argumentos se pasan por valor: es decir , el método
	//trabaja con una copia local de las mismas-> No puede modificar el valor original
	//Método que intercambia el valor de dos variables: Fallido (No funciona)
	
	static void intercambia(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	//Método que suma 10 a un número entero
	static int sumar10(int numero) {
		numero = numero + 10;
		return numero;
	}
	
	//Las variables complejas se pasan por referencia, es decir el método tiene acceso
	//a la variable original
	//Método que intercambia la 1ª posicion y la última de un array
	
	static void intercambia(int[] matriz) {
		int temp = matriz[0];
		matriz[0] = matriz[matriz.length-1];
		matriz[matriz.length-1] = temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5,b = 9;
		//Intercambiar dos variables a y b
		intercambia(a, b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//Sumar10
		//a = sumar10(a);
		System.out.println("a = " + sumar10(a));
		System.out.println("a = " + a);
		
		//intercambia primera pos y ultima de un array
		int[] matriz = new int[10];
		MetodosVoid.llenarArray(matriz, 10);
		MetodosVoid.mostrarArray(matriz);
		
		intercambia(matriz);
		MetodosVoid.mostrarArray(matriz);

		
		
		
		
		
		
	}

}
