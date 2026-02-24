package practica;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estrella e1 = new Estrella("Orionis",300,20,50,0.5,5);
		Estrella e2 = new Estrella("Antares",700,20,50,0.5,5);
		Estrella e3 = new Estrella("Sol",1,20,50,0.5,5);
		Estrella e4 = new Estrella("Betelgeuse",1200,20,50,0.5,5);
		Estrella e5 = new Estrella("KFC45",20,20,50,0.5,5);
		Estrella e6 = new Estrella("HTY65",90,20,50,0.5,5);
		Estrella e7 = new Estrella("Estrella Polar",400,20,50,0.5,5);
		
		Galaxia g1 = new Galaxia("Andrómeda",90,50,10);
		Galaxia g2 = new Galaxia("Vial Láctea",1,50,6);
		
			
		g1.addEstrella(e1);
		g1.addEstrella(e2);
		g1.addEstrella(e3);
		g2.addEstrella(e4);
		g2.addEstrella(e5);
		g2.addEstrella(e6);
		g2.addEstrella(e7);
		
		
		Estrella e8 = new Estrella("QWH65",20,20,50,0.5,5);
		Estrella e9 = new Estrella("AAAU8",90,20,50,0.5,5);
		Estrella e10 = new Estrella("PYT765",400,20,50,0.5,5);
		
		Ovni o1 = new Ovni(60,900,87);
		Ovni o2 = new Ovni(90,900,87);
		
		ArrayList<ObjetoEspacial> universo = new ArrayList<ObjetoEspacial>();
		universo.add(g1);
		universo.add(g2);
		universo.add(e8);
		universo.add(e9);
		universo.add(e10);
		
		universo.add(o1);
		universo.add(o2);
		
		//Apartado B -> 0,5 ptos
		for(ObjetoEspacial oe : universo) {
			if(oe instanceof Galaxia) {
				Galaxia g = (Galaxia)oe;
				System.out.println(g.getNombre() + " " + g.getLuminosidad() + " " + g.getTemperatura() + " " + g.getNumeroEstrellas());
			}
		}
		
		//Apartado C -> 0,5 ptos
		int contadorOvnis = 0;
		for(ObjetoEspacial oe : universo) {
			if(oe instanceof Ovni) {
				contadorOvnis++;
			}
		}
		
		//Apartado D -> 0,5 ptos
		System.out.println();
		System.out.println("Estrellas más masivas: ");
		for(ObjetoEspacial oe : universo) {
			if(oe instanceof Galaxia) {
				Galaxia g = (Galaxia)oe;
				System.out.println("La estrella mas masiva de " + g.getNombre() + " es " + g.getMasiva().getNombre() );
			}
		}
		//Apartado E -> 0,5 ptos
		
		for(ObjetoEspacial oe : universo) {
			if(oe instanceof Ovni || oe instanceof Estrella) {
				oe.desintegrar();
			}
		}
	}

}
