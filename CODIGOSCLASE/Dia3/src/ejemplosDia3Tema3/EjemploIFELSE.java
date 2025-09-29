package ejemplosDia3Tema3;

public class EjemploIFELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que indica si un String empieza por A
		
		String cadena = "Polonia";
		
		if(cadena.startsWith("A")) {
			System.out.println("Empiezar por A");
		}
		else {
			System.out.println("No empieza por A");
		}
		
		System.out.println("FIN");
		
		//Programa que indica si un número es par
		int numero = 13;
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número impar");
		}
	}

}
