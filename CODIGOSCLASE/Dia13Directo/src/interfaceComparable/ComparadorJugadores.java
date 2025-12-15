package interfaceComparable;

import java.util.Comparator;

public class ComparadorJugadores implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		// TODO Auto-generated method stub
		return Integer.valueOf(o1.getPuntos()).compareTo(Integer.valueOf(o2.getPuntos()));
	}

}
