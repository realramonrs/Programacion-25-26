package ejemplosObjetosII;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche c1 = new Coche();
		Coche c2 = new Coche("1234-TYR","FORD",20000);
		String matricula = c2.getMatricula();
		
		c1.setMatricula("3456-WERADSAF");
		//c2.setMatricula("5555-FGR");
		
		System.out.println("Matrícula c1: " + c1.getMatricula());
		System.out.println("Matricula c2: " + c2.getMatricula());
		
		//NullPointerException
		//Comprobar si la matrícula de c1 acaba en A
		boolean letraFinalA = c1.getMatricula().endsWith("A");
		
		//ACCESO A ATRIBUTOS STATIC CONCESIONARIO
		Coche.setConcesionario("MOTOR CAR");
		Coche c3 = new Coche("1234-WER","RENAULT", 45000);
		System.out.println(Coche.getConcesionario());
		System.out.println(c2.getConcesionario());
		System.out.println(c1.getConcesionario());
		
		//ACCESO A CONTADOR COCHES
		System.out.println(Coche.getContador());
		
		
	}

}
