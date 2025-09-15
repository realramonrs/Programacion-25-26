package ejemplos;

public class TiposDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de variables
		//Numéricas: byte,short,int, long
		byte x1 = 0;
		//Sumale a 1 a x1
		int x2 = x1 + 1;
		short x3 = 900;
		long x4 = 90000000;
		
		//Errores valores variables
		//x1 = 200; El valor almacenado no cabe en la variable
		x1 = (byte)(x1 + 1);
		//Mostrar por pantalla el valor de x1
		System.out.println("x1 = " + x1);
		x1 = (byte)(x1 + 456);
		System.out.println("x1 = " + x1);
		
		//Variables numéricas con decimales
		float x5 = 10.7f;
		double x6 = 5.678484;
		
		int x7 = (int) (x5 + 7);
		
		System.out.println("x7 = " + x7);
		
		//Conversiones de cast implícitas
		//byte -> short
		short s1 = x1;
		//short -> int
		int x8 = s1;
		
		//float -> double
		x6 = x5;
		
		
		//Declarar varias variables en la misma línea
		int a1,a2,a3;
		int b1 = 9,b2 = 9,b3 = 5;
		
		long l1 = 9_000_000_000L;
		
		//Mostrar por pantalla números con formato
		System.out.println("l1= " + l1);
		System.out.printf("l1 = %,d \n", l1);
		System.out.println("x6= " + x6);
		System.out.printf("X6= %.2f", x6);
		
		//Java tiene dos grupos de variables
		//Primitivas --> Sólo almacenan un valor
		//Complejas --> Objetos --> Pueden almacenar muchos valores y además
		// pueden realizar operaciones con esos valores.
		
		//Texto:
		
		char caracter='9';
		String frase = "Programación es increíble";
		char caracter0 = frase.charAt(0);
		
		//boolean: True o False
		boolean condicion1 = true;
		boolean condicion2 = false;
		
		
			
		
		
		
		
		
		
		
		//booleanas
		
		//Texto (caracteres)
	}

}
