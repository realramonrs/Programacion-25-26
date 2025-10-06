package sentenciasSeleccion;

import java.util.Random;

public class EjempliIfelseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que determina si un número positivo tiene , 1 , 2 , 3 o más cifras
		
		//El número lo generamos de forma aleatoria
		Random generador = new Random();
		
		//Vamos a generar 10 números aleatorios y ver cuantas cifras tienen
		int contador = 0;
		do {
				
				int numero = generador.nextInt(200);
				
				if(numero < 0) {
					System.out.println("Error en la entrada, el número no puede ser negativo");
				}
				else if(numero < 10) {
					System.out.println(numero + " tiene una cifra");
				}
				else if(numero <100) {
					System.out.println(numero + " tiene dos cifras.");
				}
				else {
					System.out.println(numero + " tiene 3 o más cifras.");
				}
				contador++;
		}//Llave que cierra el bloque do
		while(contador < 50);
		
		
		
		
		
	}

}
