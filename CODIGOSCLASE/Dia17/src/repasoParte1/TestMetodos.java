package repasoParte1;

public class TestMetodos {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {4,7,1,3,-4,9};
		
		int a1 = Metodos.calcMinimo(array);
		
		System.out.println("El mínimo es : " + a1);
		
		int[][] matriz2d = new int[4][5];
		
		Metodos.llenarArray2D(matriz2d, 0, 10);
		System.out.println();
		Metodos.mostrarMatriz(matriz2d);
		System.out.println();
		Metodos.buscarPrimerCero(matriz2d);
		
		short x = 10;
		short resultado = (short) (x + 1);
		
		int z = 3;
		
		float resultado2 = (float) x / z;
		
		System.out.println(resultado2);
		
		String n1 = "Hola";
		String n2 = new String("Hola");
		
		
		Metodos m = new Metodos();
		System.out.println(" x = " + m.x);
		
		
	}

}
