package practica;

public class Ovni extends ObjetoEspacial {

	public Ovni(double masa, double velocidad, double distancia) {
		super("desconocido", masa, velocidad, distancia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void desintegrar() {
		// TODO Auto-generated method stub
		super.setMasa(0);
	}

	
}
