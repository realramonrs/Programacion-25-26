package ejemplosClases1;

public class TestSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie s1 = new Serie("Ozark",50,5,"Acción");
		Serie s2 = new Serie("Breaking Bad",70,5,"Acción");
		
		//Modificar la valoración de una serie
		s2.setValoracion(4);
		
		//Mostrar toda la información de una serie
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
