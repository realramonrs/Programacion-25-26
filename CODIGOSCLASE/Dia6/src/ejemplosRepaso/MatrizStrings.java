package ejemplosRepaso;

public class MatrizStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ciudades = new String[10];
		ciudades[0] = "Vigo";
		ciudades[1] = "Caceres";
		ciudades[4] = "Córdoba";
		//Indicar cuantas ciudades empiezan por C
		int contador = 0;
		for(String ciudad : ciudades) {
			if(ciudad!=null) {
				if(ciudad.charAt(0)=='C') {
					contador++;
				}
			}
			else {
				break;
			}
		}
		System.out.println("hay " + contador + " ciudades que empiezan por C");
	}

}
