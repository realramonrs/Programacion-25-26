package ejemplosDia2;

import java.io.File;
public class OperadoresMatematicos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores matemáticos:
		//+ , - , * , / , %
		//Asignación = 
		//Asignacion + operacion  +=, -=, *= , /=
		//Incremento ++ , decremento --.
		
		int num1 = 9 , num2 = 4;
		int suma = num1 + num2;
		
		//Operador división
		float division =  (9f / 4);
		
		System.out.println("Division: " + division);
		
		// BLOQUE TRY CATCH PARA CAPTURAR EXCEPCIÓN
		int num3 = 0;
		
		try {
			float division2 = num1 / num3;
			System.out.println("Division2 = " + division2);
		}
		catch(ArithmeticException ex) {
			System.out.println("No se puede dividir por cero!");
		}
		
		System.out.println("Continua ejecución programa...");
		
		//Operador % : Resto de la división entera
		int resto = 9 % 3;
		int resto1 = 9 % 4;
		
		//Operador asignación y suma
		int num4 = 1;
		num4+= 6; // num4 = num4 + 1;
		
		//Operador ++ y --
		int num5 = 1;
		num5++; // Le suma 1 a num5
		++num5; // Le suma 1 a num5
		System.out.println("num5 : " + num5);
		
		int num6 =2 + --num5;
		System.out.println("num6 : " + num6);
		System.out.println("num5 : " + num5);
		
		File f; //Clase situada en el paquete java.io
	} // Fin del main

}
