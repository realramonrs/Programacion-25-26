package interfaces;

import java.util.ArrayList;

public class MainVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v1 = new VehiculoElectrico(90,"OMODA",50);
		Vehiculo v2 = new VehiculoGasolina(120,"Porsche",90);
		
		Conducible v3 = new VehiculoElectrico(50,"SangYong",80);
		Conducible v4 = new VehiculoGasolina(80,"Mercedes",20);
		
		Electrico v5 = new VehiculoElectrico(45,"Ferrari",80);
		
		ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
		ArrayList<Conducible> conducibles = new ArrayList<Conducible>();
		
		conducibles.add(v1);
		conducibles.add(v2);
		conducibles.add(v3);
		conducibles.add(new Ovni("Andrómeda",9000000));
		conducibles.add(new Caballo());
		
		
	}

}
