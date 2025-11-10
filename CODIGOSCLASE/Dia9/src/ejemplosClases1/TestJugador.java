package ejemplosClases1;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar una variable de tipo jugador
		Jugador j1,j2,j3; //j1,j2,j3 vale null
		//Inicializar j1 -> Asignarle un objeto de tipo Jugador (Instanciar)
		j1 = new Jugador();
		j2 = new Jugador("Iago Aspas",34);
		j3 = new Jugador();
		//Acceder a los atributos del objeto jugador
		//Modificar los valores de J1
				j1.nombre = "Vinicius";
				j1.goles = 50;
				j1.setEdad(2600);
				j1.valorMercado = 90000000;
		System.out.println("Nombre: " + j1.nombre);
		System.out.println("Edad: " + j1.getEdad());
		System.out.println("Goles: " + j1.goles);
		System.out.println("Valor de mercado: " + j1.valorMercado);
		System.out.println();
		System.out.println("Datos J2");
		System.out.println("Nombre: " + j2.nombre);
		System.out.println("Edad: " + j2.getEdad());
		System.out.println("Goles: " + j2.goles);
		System.out.println("Valor de mercado: " + j2.valorMercado);
		
		System.out.println("Datos J3");
		System.out.println("Nombre: " + j3.nombre);
		System.out.println("Edad: " + j3.getEdad());
		System.out.println("Goles: " + j3.goles);
		System.out.println("Valor de mercado: " + j3.valorMercado);
		
		//Explicación método toString
		//Mostrar toda la info de j1
		System.out.println(j1); // -> ejemplosClases1.Jugador@5d099f62
		System.out.println(j1.toString()); //-> ejemplosClases1.Jugador@5d099f62

		
		
				
		
		
		
	}

}
