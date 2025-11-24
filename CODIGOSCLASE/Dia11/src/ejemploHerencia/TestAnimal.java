package ejemploHerencia;

import java.util.ArrayList;

public class TestAnimal {
	
	public static void hacerHablar(Animal a) {
		a.hablar();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Animal> lista = new ArrayList<Animal>();
		lista.add(new Delfin("Winter"));
		lista.add(new Mono("DDDD",true));
		
		
		
		Animal a1 = new Animal("Willy");
		a1.hablar();
		Mono m1 = new Mono("Cesar",true);
		Animal m2 = new Mono("Copito de nieve",false);
		Delfin d1 = new Delfin("Manoliño");
		//m1.hablar();
		//m2.hablar();
		
		hacerHablar(m1);
		hacerHablar(d1);
	}

}
