package interfaces;

public class Ovni implements Conducible {

	private String galaxia;
	private int velocidad;
	
	
	
	public Ovni(String galaxia, int velocidad) {
		super();
		this.galaxia = galaxia;
		this.velocidad = velocidad;
	}
	
	
	public String getGalaxia() {
		return galaxia;
	}


	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}


	public int getVelocidad() {
		return velocidad;
	}


	@Override
	public void acelerar(int velocidad) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
