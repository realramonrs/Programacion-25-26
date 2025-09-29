package ejemplosDia3Tema3;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//&& AND 
		//|| OR
		// ! No
		
		int n1 = 5, n2 = 6;
		
		boolean condicion1 = n1 > 5 && n2 == 6;
		boolean condicion2 = n1 != 6 || n2 == 4;
		boolean condicion3 = !condicion2;
		
		boolean condicion4 = n1++ >= 5 || !(n2!=6);
		System.out.println(condicion4);
		System.out.println(n1);
		
		
		
		
	}

}
