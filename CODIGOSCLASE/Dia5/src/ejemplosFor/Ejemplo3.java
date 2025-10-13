package ejemplosFor;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que muestra por pantalla 10 filas de 8 asteriscos
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * * *
		
	  for(int i = 1;i<=10;i++) {
		for(int j  = 1;j<=9;j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
	  
	//Programa que muestra por pantalla 
		//  * * * * * * * * * *
		//  * * * * * * * * *
		//  * * * * * * * *
		//  * * * * * * *
		//  * * * * * *
		//  * * * * * 
		//  * * * * 
		//  * * * 
	  //  * * 
	  //  * 

	  int limite = 10;
	  for(int i = 10;i>=1;i--) {
		  for(int j  = 1;j<=i;j++) {
			  System.out.print("* ");
		  }
		  limite--;
		  System.out.println();
	  }
	}	  

}
	
	
	
	
	

