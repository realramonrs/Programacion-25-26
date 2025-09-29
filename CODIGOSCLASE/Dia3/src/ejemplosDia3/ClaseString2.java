package ejemplosDia3;

import java.util.Arrays;

public class ClaseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Método que permite separar un String en tokens a partir de un separador
		
		String frase = "Este año el celta baja a segunda";
		String[] palabras = frase.split(" ");
		
		System.out.println(Arrays.toString(palabras));
		
		//Métodos que parecen modificar un String
		//Método replace
		String copia = frase.replace(" ", "*");
		System.out.println(frase);
		System.out.println(copia);
		
		//Modificar el String original
		frase = frase.replace(" ","*");
		
		System.out.println(frase);
		
		//Método que pasa un String a Mayúsculas
		String copia2 = frase.toUpperCase();
		
		System.out.println(copia2);
		
		//Problema : Necesito añadirle un símbolo de $ al String frase
		frase = frase.concat("$");
		frase = frase + "$" + 1;
		System.out.println(frase);
		
		//Eliminar espacios al final y al principio de un String
		String ejemplo = "Hola ";
		ejemplo = ejemplo.trim();
		ejemplo+= "*";
		System.out.println(ejemplo);
	}

}
