package composicionObjetos;

public class TestGestorVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestorVehiculos gv = new GestorVehiculos(10);
		
		//Guardar un vehiculo
		gv.guardarVehiculo(new Vehiculo(new Motor("Motor1",200,TipoMotor.diesel),240,90000));
		
		
		
		
		
		
		
	}

}
