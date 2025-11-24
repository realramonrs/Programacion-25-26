package ejemploHerencia;

public class Delfin extends Animal{

	public Delfin(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hablo como un delfin");
	}
	
}
