package ejemplosDia3;

public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primitivas => int, short, float , double, char ...
		//Complejas => String, StringBuilder, Math...
		
		//Wrappers -> Uno por cada variable primitiva
		// int -> Integer , float -> Float , char -> Character
		int numero = 765;
		String numeroString = Integer.toString(numero);
		
		String numero2 = "234567";
		int numero2a = Integer.parseInt(numero2);
		
		String numero3 = "23,56";
		numero3 = numero3.replace(",", ".");
		float numeroFloat = Float.parseFloat(numero3);
		
		System.out.println(numeroFloat);
		
		//Envoltorio Character
		
		boolean letra = Character.isLetter('e');
		boolean digito = Character.isDigit('0');
		boolean mayuscula = Character.isUpperCase('T');
		boolean letraOdigito = Character.isLetterOrDigit('7');
		
		MES m1 = MES.ABRIL;
		
		
		
		
	}

}
