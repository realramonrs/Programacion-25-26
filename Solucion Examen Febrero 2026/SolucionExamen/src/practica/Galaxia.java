package practica;

import java.util.ArrayList;
import java.util.Random;

public class Galaxia extends ObjetoEspacial {

	private ArrayList<Estrella> estrellas;
	private double luminosidad;
	private double temperatura;
	public Galaxia(String nombre, double velocidad, double distancia,int numEstrellas) {
		super(nombre, 0, velocidad, distancia);
		estrellas = new ArrayList<Estrella>(numEstrellas);
		
	}
	
		
	public double getLuminosidad() {
		return luminosidad;
	}

	public double getTemperatura() {
		return temperatura;
	}
	public void addEstrella(Estrella es) { //0,5 pto
		estrellas.add(es);
		//Actualizar masa
		actualizarMasa();
		//Actualizar la temperatura
		actualizarTemperatura();
		//Actualizar la luminosidad
		actualizarLuminosidad();
	}
	
	private void actualizarMasa() {
		double masa= 0;
		
		for(Estrella e : estrellas) {
			masa+=e.getMasa();
		}
		
		super.setMasa(masa);
	}
	
	private void actualizarTemperatura() {
		double temp = 0;
		
		for(Estrella es : estrellas) {
			temp+=es.getTemperatura();
		}
		
		this.temperatura = temp/estrellas.size();
	}
	
	private void actualizarLuminosidad() {
		double lum = 0;
		
		for(Estrella es : estrellas) {
			lum += es.getLuminosidad();
		}
		this.luminosidad = lum/estrellas.size();
	}
	
	//Apartado B -> 0,5 ptos
	
	public int getNumeroEstrellas() {
		return estrellas.size();
	}
	
	//Apartado C -> 0,5 ptos
	
	public Estrella getMasiva() {
		Estrella es = estrellas.get(0);
		
		for(int i = 1;i<estrellas.size();i++) {
			if(es.getMasa()<estrellas.get(i).getMasa()) {
				es = estrellas.get(i);
			}
		}
		
		return es;
		
	}
	
	//Apartado D: -> 0,5 ptos
	public ArrayList<Estrella> getEstrellas(){
		return this.estrellas;
	}
	
	//Apartado E: -> 0,5 ptos
	
	public ArrayList<Estrella> getEstrellasporMasa(){
		ArrayList<Estrella> ordenada = new ArrayList<Estrella>(estrellas);
		ordenada.sort(null);
		return ordenada;
	}

	@Override
	public void desintegrar() {
		// TODO Auto-generated method stub
		Random generador = new Random();
		int max = estrellas.size();
		
		//Obtener cuantas estrellas se desintegran
		int numero = generador.nextInt(max);
		
		for(int i = 0;i<numero;i++) {
			estrellas.get(generador.nextInt(max)).desintegrar();
		}
	}
	
	
	
	
}
