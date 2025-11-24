package listasEjemplos;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> jugadoresCroatas = new ArrayList<String>(10);
		
		jugadoresCroatas.add("Vlado Gudelj");
		//Añadir elementos a la lista
		System.out.println("size: " + jugadoresCroatas.size());
		jugadoresCroatas.add(0,"Luka Modric");
		jugadoresCroatas.add("Ivan Rakitic");
		
		//Añadir elementos en una posicion concreta
		jugadoresCroatas.add(2, "Mateo Kovacic");
		jugadoresCroatas.add(1,"Gvardiol");
		
		
		//Obtener el número de elmentos del arraylist
		int elementos = jugadoresCroatas.size();
		
		//Recorrer un arraylist
		
		for(int i = 0;i<jugadoresCroatas.size();i++) {
			System.out.println(jugadoresCroatas.get(i));
		}
		
		/*for(String j : jugadoresCroatas) {
			System.out.println(j);
		}*/
		
		//Eliminar a Vlado Gudelj
		
		jugadoresCroatas.remove("Vlado Gudelj");
		
		System.out.println("Lista después de eliminar a Gudelj");
		for(String s : jugadoresCroatas) {
			System.out.println(s);
		}
		
		//Crear un ArrayList con objetos de la clase Jugador
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(new Jugador("Luka Modric",10));
		jugadores.add(new Jugador("Iago Aspas",10));
		
		//Obtener un jugador por índice
		Jugador j1 = jugadores.get(0);
		
		
		
		
		
		
		
	}

}
