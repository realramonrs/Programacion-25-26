package ejemploHerencia;

public class Animal {
	
	private String nombre;
	
	
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}


	protected void hablar() {
		System.out.println("Hablo como un animal");
	}
	

}
