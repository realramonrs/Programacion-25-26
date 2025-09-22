package ejemplosDia2;

public class LibreriaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular la raiz de un número
		int numero = 7;
		float raiz = (float)Math.sqrt(numero);
		System.out.println("Raiz: " + raiz);
		
		//Calcular potencias
		int potencia = (int)Math.pow(numero, 5);
		
		//Calculo de mínimo o máximo
		int n1 = 4,n2 = 8;
		int menor = Math.min(n1, n2);
		int mayor = Math.max(n1, n2);
		
		int n3 = 4, n4 = 1, n5 = 6;
		
		//int menor2 = Math.min(n3, n4);		
		//int menor3 = Math.min(menor2, n5);
		
		//int menor2 = Math.min(n3, Math.min(n4, n5));
		
		int menor2 = Math.min(n3, n4);
		menor2 = Math.min(menor2, n5);
		
		//Redondear valores decimales
		float d1 = 5.7f;
		double inferior = Math.floor(d1);
		double superior = Math.ceil(d1);
		double cercano = Math.round(d1);
				
	}

}
