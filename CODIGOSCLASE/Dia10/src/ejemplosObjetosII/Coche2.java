package ejemplosObjetosII;

public class Coche2 {
 
	//Todos los coches pertenecen al mismo concesionario.
	
	private String matricula; // Cada coche tiene su propia matrícula
	private static String concesionario; //Compartido por todos los coches que hay en memoria
	private String marca;
	private float precio; // Cada coche tiene su propio precio
	private static int contador;
	
	
	
	public Coche2(String matricula, String marca, float precio) throws Exception {
		setMatricula(matricula);
		
		this.marca = marca;
		this.precio = precio;
		contador++;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) throws Exception {
		//Una matrícula es correcta si tiene 8 caracteres : dddd-lll
		if(matricula.length()==8) {
			this.matricula = matricula;
		}
		else {
			throw new Exception("Error en formato matrícula");
		}
		
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
		Coche2.concesionario = concesionario;
	}
	public static String getConcesionario() {
		return Coche2.concesionario;
	}

	public static int getContador() {
		return contador;
	}
	
	
	
	
}
