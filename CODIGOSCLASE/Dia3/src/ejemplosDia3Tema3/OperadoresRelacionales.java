package ejemplosDia3Tema3;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores Relacionales ==, != , < , <= , > , >= 
		//Devuelven True o False
		int n1 = 5 , n2 = 7;
		
		boolean condicion1 = n1 == n2;
		boolean condicion2 = n1 != n2;
		boolean condicion3 = n1 <= n2;
		
		//Strings nunca se comparar utilizando el == , siempre debemos utilizar el método equals
		
		String s1 = "java";
		String s2 = "java";
		
		boolean condicion4 = s1 == s2;
		
		System.out.println(condicion4);
		System.out.println(s1.equals(s2));
		
		String s3 = "Montecastelo";
		String s4 = new String("Montecastelo");
		
		boolean condicion5 = s3 == s4;
		
		System.out.println(condicion5);
		System.out.println(s3.equals(s4));
	}

}
