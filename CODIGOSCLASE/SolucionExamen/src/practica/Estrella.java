package practica;

public class Estrella extends ObjetoEspacial implements Comparable<Estrella> {

	private double luminosidad;
	private double temperatura;
	private char tipo;
	public Estrella(String nombre, double masa, double velocidad, double distancia, double luminosidad,
			double temperatura) {
		super(nombre, masa, velocidad, distancia);
		setLuminosidad(luminosidad);
		setTemperatura(temperatura);
		//calcularTipo();
	}
	public double getLuminosidad() {
		return luminosidad;
	}
	public void setLuminosidad(double luminosidad) {
		if(luminosidad>=0 && luminosidad <= 1) {
			this.luminosidad = luminosidad;
			calcularTipo();
		}
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		if(temperatura>=1 && temperatura<=10) {
			this.temperatura = temperatura;
			calcularTipo();		
		}
	}
	public char getTipo() {
		return tipo;
	}
	
	public void calcularTipo() {
		if(this.luminosidad > 0.5 && this.temperatura >= 5) {
			tipo = 'K';
		}
		else if(this.luminosidad > 0.5 && this.temperatura < 5) {
			tipo = 'F';
		}
		else if(this.luminosidad <= 0.5 && this.temperatura > 5) {
			tipo = 'G';
		}
		else {
			tipo = 'M';
		}
	}
	@Override
	public String toString() {
		return "Estrella [luminosidad=" + luminosidad + ", temperatura=" + temperatura + ", tipo=" + tipo
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Estrella o) {
		// TODO Auto-generated method stub
		return Double.valueOf(o.getMasa()).compareTo(this.getMasa());
	}
	@Override
	public void desintegrar() {
		// TODO Auto-generated method stub
		setLuminosidad(0);
		setTemperatura(0);
	}
	
	
}
