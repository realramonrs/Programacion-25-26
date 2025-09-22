package ejemplosDia2;

public class ClaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Clase String - (Idea: Clase = Tipo de Variable)
		//Un string es un array de variables de tipo Char , inmutable
		String frase = "Esta clase es genial";
		String frase2 = new String("Estoy flipando con Java");
		
		//Tamaño de un string = length();
		int caracteresFrase = frase.length();
		System.out.println(frase + " tiene " + caracteresFrase + " caracteres");
		
		//Obtener el caracter que ocupa una determinada posición:
		char c = frase.charAt(0); //char c1 = frase[0]; --> No se puede
		
		//Buscar la posición que ocupa un determinado caracter
		int posicion = frase.indexOf(" ");
		System.out.println("El primer espacio está en la posición: " + posicion);
		
		//Sobrecarga indexOf
		int segundaPosicion = frase.indexOf(" ", posicion + 1);
		System.out.println("El segundo espacio está en la posición: " + segundaPosicion);
		
		//Buscar si hay un caracter o no en el string
		boolean encontrado = frase.contains("clase");
		System.out.println("Encontrado: " + encontrado);
		
		//Comprobar si dos strings son iguales:
		String s1 = "hola";
		String s2 = "Hola";
		boolean iguales = s1.equals(s2);
		boolean igualesIgnoreMayusculas = s1.equalsIgnoreCase(s2);
		System.out.println("Iguales: " + iguales);
		System.out.println("Iguales ignore case: " + igualesIgnoreMayusculas);
		
		//Extraer un substring del string original:
		String cadena ="Hala Celta";
		String subCadena = cadena.substring(5);
		System.out.println("Cadena " + cadena);
		System.out.println("Subcadena: " + cadena.substring(5));
		String subCadena2 = cadena.substring(5, 7);
		System.out.println("Subcadena2: " + subCadena2);
		
	}

}
