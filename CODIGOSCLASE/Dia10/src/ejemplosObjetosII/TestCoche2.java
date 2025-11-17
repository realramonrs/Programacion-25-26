package ejemplosObjetosII;

public class TestCoche2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche2 miCoche = null;
		try {
			miCoche = new Coche2("1434-RTY","MERCEDES",35000);
			System.out.println(miCoche.getMarca());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		
		}
		
		
		
		System.out.println("CONTINUACIÓN PROGRAMA...");
		
	}

}
