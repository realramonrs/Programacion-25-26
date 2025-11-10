package ejemplosClases1;

public class Jugador {

	//Atributos: Datos (Variables) que contiene la clase
	String nombre;
	private int edad;
	float valorMercado;
	int goles;
	
	//Métodos: Que trabajan con los atributos Como mínimo una clase suele tener 3 tipos de métodos
	//1) Constructores: Se diferencian del resto de métodos en dos características
	// 		1ª ) Se llaman exactamente igual que la clase
	//		2ª ) No tienen tipo de retorno (ni void, ni int ...)
	// Son los métodos que inicializan los objetos de la clase , y son llamados con el operador new
	
	//Si no especificamos ningún constructor se añade uno por defecto:
	
	public Jugador() {
		super(); //Llamada al constructor por defecto de la clase Object
		edad = 18;
		valorMercado = 100000;
		goles = 0;
		nombre = null;
	}
	public Jugador(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}	
	//2) Métodos de acceso
	//Método que permita modificar la edad
	public void setEdad(int edad) {
		if(edad <100 && edad > 16) {
			this.edad = edad;
		}
		
	}
	//Método que permita consultar la edad
	public int getEdad() {
		return edad;
	}
	//3) Métodos heredados de la clase Object: toString, equals, ...
	@Override
	public String toString() {
		return this.nombre + ", " + this.edad +", " + this.goles + ", " + this.valorMercado;
	}
	
}
