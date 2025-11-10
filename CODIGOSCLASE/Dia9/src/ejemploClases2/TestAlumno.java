package ejemploClases2;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno("51635749J","Peter Griffin",CURSO.DAM);
		
		//Evaluar a a1
		a1.addNota(7);
		System.out.println("Media actual:" + a1.getMedia());
		a1.addNota(4);
		System.out.println("Media actual:" + a1.getMedia());
		a1.addNota(9);
		System.out.println("Media actual:" + a1.getMedia());
		a1.addNota(6);
		a1.setDni("51635749E");
		System.out.println(a1);
	}

}
