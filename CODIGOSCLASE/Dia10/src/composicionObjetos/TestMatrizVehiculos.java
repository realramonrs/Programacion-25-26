package composicionObjetos;

public class TestMatrizVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matriz de Vehiculos
		Vehiculo[] vs = new Vehiculo[10];
		
		vs[0] = new Vehiculo("Motor1",200,TipoMotor.diesel,240,56000);
		vs[1] = new Vehiculo("Motor2",200,TipoMotor.electrico,240,56000);
		vs[2] = new Vehiculo("Motor3",200,TipoMotor.gasolina,240,56000);
		vs[3] = new Vehiculo("Motor4",200,TipoMotor.diesel,240,56000);
		vs[5] = new Vehiculo("Motor2",200,TipoMotor.diesel,340,56000);
		// Subir el precio de todos los vehiculos diesel en un 10%
		
		for(int i = 0;i<vs.length;i++) {
			//Ver si es diesel
		if(vs[i]!=null) {
			if(vs[i].getMotor().getTipo().equals(TipoMotor.diesel)) {
				//float nuevoPrecio = vs[i].getPrecio() + vs[i].getPrecio()*0.1f;
				float nuevoPrecio = vs[i].getPrecio()*1.1f;
				vs[i].setPrecio(nuevoPrecio);
			}
		}
		}
		
		for(Vehiculo v : vs) {
			if(v != null)
				System.out.println(v.getMotor() + " " + v.getPrecio());
		}
		
		//Eliminar un vehiculo de la matriz:
		//Vamos a eliminar a los vehiculos con motor Motor2
		
		for(int i = 0;i<vs.length;i++) {
			if(vs[i]!=null) {
				if(vs[i].getMotor().getMarca().equals("Motor2")) {
				vs[i] = null;
				}
			}
		}
		
		//Pasar posiciones null para el final
		Vehiculo[] vsCopia = new Vehiculo[vs.length];
		int posicion = 0;
		for(int i = 0;i<vs.length;i++) {
			if(vs[i]!=null) {
				vsCopia[posicion] = vs[i];
				posicion++;
			}
		}
		
		vs = vsCopia;
		System.out.println("Matriz de vehiculos sin Motor2");
		
		for(Vehiculo v : vs) {
			System.out.println(v);
		}
		
		//Insertar un nuevo vehiculo en la primera posición vacía del array
		
		for(int i = 0;i<vs.length;i++) {
			if(vs[i]==null) {
				vs[i] = new Vehiculo(new Motor("Motor7",190,TipoMotor.gasolina),220,25000);
				break;
			}
		}
		
		for(Vehiculo v : vs) {
			if(v!=null) {
				System.out.println(v);
			}
			else {
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
