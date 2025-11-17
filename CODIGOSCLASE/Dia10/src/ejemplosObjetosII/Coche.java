package ejemplosObjetosII;

public class Coche {
 
	//Todos los coches pertenecen al mismo concesionario.
	
	private String matricula; // Cada coche tiene su propia matrícula
	private static String concesionario; //Compartido por todos los coches que hay en memoria
	private String marca;
	private float precio; // Cada coche tiene su propio precio
	private static int contador;
	
	public Coche() {
		super(); 
		this.matricula = "0000-AAA";
		contador++;
	}
	
	public Coche(String matricula, String marca, float precio) {
		boolean ok = setMatricula(matricula);
		if(!ok) {
			this.matricula = "0000-AAA";
		}
		this.marca = marca;
		this.precio = precio;
		contador++;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	public boolean setMatricula(String matricula) {
		//Una matrícula es correcta si tiene 8 caracteres : dddd-lll
		if(matricula.length()==8) {
			this.matricula = matricula;
			return true;
		}
		return false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	//MÉTODOS ACCESO ATRIBUTO STATIC CONCESIONARIO
	
	public static void setConcesionario(String concesionario) {
		Coche.concesionario = concesionario;
	}
	public static String getConcesionario() {
		return Coche.concesionario;
	}

	public static int getContador() {
		return contador;
	}
	
	
	
	
}
