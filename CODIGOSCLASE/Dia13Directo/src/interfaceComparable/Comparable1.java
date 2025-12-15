package interfaceComparable;

import java.util.ArrayList;
import java.util.Arrays;

public class Comparable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = "Zamora";
		String cadena2 = "Zamora";
		
		System.out.println("cadena1.compareTo(cadena2): " + cadena2.compareTo(cadena1));
		
		Integer i1 = 3;
		Integer i2 = 3;
		System.out.println("i1.compareTo(i2)" + i2.compareTo(i1));
		
		ArrayList<String> ciudades = new ArrayList<String>();
		
		ciudades.add("Zamora");
		ciudades.add("Vigo");
		ciudades.add("Almería");
		
		ciudades.sort(null);
		
		for(String s : ciudades) {
			System.out.println(s);
		}
		
		String[] ciudades2 = new String[3];
		ciudades2[0] = "Zamora";
		ciudades2[1] = "Vigo";
		ciudades2[2] = "Almería";
		
		Arrays.sort(ciudades2);
		
		for(String s : ciudades2) {
			System.out.println(s);
		}
		
		//Ordenar Jugadores
		
		Jugador[] jugadores = new Jugador[4];
		
		jugadores[0] = new Jugador("Pepe",60);
		jugadores[1] = new Jugador("Juan",25);
		jugadores[2] = new Jugador("Sofia",45);
		jugadores[3] = new Jugador("Julio",50);
		
		Jugador j1 = new Jugador("J1",90);
		Jugador j2 = new Jugador("J2",50);
		
		Arrays.sort(jugadores, new ComparadorJugadores());
		System.out.println();
		System.out.println("Jugadodres ordenados por puntos: ");
		for(Jugador j : jugadores) {
			System.out.println(j);
		}
	}

}
