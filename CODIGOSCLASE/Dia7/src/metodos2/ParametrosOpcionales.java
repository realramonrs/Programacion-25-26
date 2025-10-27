package metodos2;

public class ParametrosOpcionales {

	//Método que suma 0 o más valores de tipo int
	static int sumarNValores(int...n) {
		//n lo puedo tratar como si fuera un array
		int suma = 0;
		for(int i = 0;i<n.length;i++) {
			suma += n[i];
		}
		return suma;
		
	}
	
	//Método que multiplica 1 o más valores
	static int multiplicarNValores(int n1,int...n) {
		int multipliacion = n1 ;
		
		
	/*	for(int i = 0;i<n.length;i++) {
			multipliacion = multipliacion*n[i];
		}
		
		return multipliacion;*/
		//Comprobar si hay parámetros opcionales
		if(n.length == 0) {
			return n1;
		}
		else {
			for(int i = 0;i<n.length;i++) {
				multipliacion = multipliacion*n[i];
			}
			return multipliacion;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sumar 2 valores
		int suma = sumarNValores(4,5);
		//sumar 4 valores
		int suma4 = sumarNValores(4,6,7,8);
		//sumar 8 valores
		int suma8 = sumarNValores(1,2,3,4,5,6,7,8);
		int suma0 = sumarNValores();
		
		//Multiplicar n valores
		int resultado = multiplicarNValores(2);
		System.out.println(resultado);		
		int resultado2 = multiplicarNValores(2, 4);
		
		System.out.println(resultado2);	
		int resultado3 = multiplicarNValores(2, 4,6);
		System.out.println(resultado3);	
		
		
	}

}
