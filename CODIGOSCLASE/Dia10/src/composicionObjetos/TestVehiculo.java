package composicionObjetos;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Opción 1: Crear el motor fuera y pasarlo en el constructor
		Motor m1 = new Motor("MotorGuay",200,TipoMotor.diesel);
		Vehiculo v1 = new Vehiculo(m1,220,5000);
		
		//Cambiar el nivel de aceite del motor del vehiculo v1 al 80%
		v1.getMotor().setNivelAceite(80);
		m1.setNivelAceite(80);
		
		//Opción 2: Crear el motor en la llamada al constructor de vehiculo  
		Vehiculo v2 = new Vehiculo(new Motor("MotorPlus",190,TipoMotor.gasolina),230,45000);
		
		//Cambiar el nivel de aceite del motor del vehiculo v2 al 60%
		v2.getMotor().setNivelAceite(60);
		
		//Opción 3: Crear el vehiculo con los datos del motor :
		Vehiculo v3 = new Vehiculo("MOTOR XTREM",220,TipoMotor.electrico,300,75000);
		//Cambiar el nivel de aceite del motor del vehiculo v2 al 60%
		v3.getMotor().setNivelAceite(60);
				
	}

}
