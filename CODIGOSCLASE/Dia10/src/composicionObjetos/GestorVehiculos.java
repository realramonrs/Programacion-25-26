package composicionObjetos;

public class GestorVehiculos {

	Vehiculo[] vs;
	
	public GestorVehiculos(int capacidad) {
		vs = new Vehiculo[capacidad];
	}
	
	public void guardarVehiculo(Vehiculo v) {
		for(int i = 0;i<vs.length;i++) {
			if(vs[i]!=null) {
				vs[i] = v;
				break;
			}
		}
	}
	
}
