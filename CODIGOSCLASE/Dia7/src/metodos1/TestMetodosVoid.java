package metodos1;

public class TestMetodosVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Llenar un array :
		int[] array = new int[10];
		float[] farray = new float[10];
		MetodosVoid.llenarArray(array);
		
		//Llenarlo con valores positivos hasta 50
		MetodosVoid.llenarArray(array, 50);
		
		//Llenarlo con valores entre -50 y 50
		MetodosVoid.llenarArray(array, -50, 50);
		MetodosVoid.llenarArray(farray, -10.5f, 10.5f);
		
		//Mostrar por pantalla
		MetodosVoid.mostrarArray(array);
		MetodosVoid.mostrarArray(farray);
	}

}
