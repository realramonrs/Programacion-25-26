package ejemploHerencia;

public class Mono extends Animal {

	private boolean alergiaCacahuete;
	
	//Constructor Clase Mono
	public Mono(String nombre,boolean alergiaCacahuete) {
		super(nombre);
		this.alergiaCacahuete = alergiaCacahuete;
	}
	
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hablo como un mono");
	}
}
