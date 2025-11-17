package composicionObjetos;

import java.io.IO;

public class TestMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor m1 = new Motor("Kia",150,TipoMotor.gasolina);
		
		System.out.println(m1);
		
		//Crear un Coche con datos introducidos por el usuario;
		String marca = IO.readln("Introduzca la marca del motor");
		int potencia = Integer.parseInt(IO.readln("Introduce la potencia: "));
		
		int tipoMotor = Integer.parseInt(IO.readln("Introduzca el tipo de motor: 1 - Electrico . 2 Diesel - 3 Gasolina"));
		TipoMotor tpm = null ;
		switch(tipoMotor) {
		case 1:
			tpm = TipoMotor.electrico;
			break;
		case 2:
			tpm = TipoMotor.diesel;
			break;
		case 3: 
			tpm = TipoMotor.gasolina;
			break;
			default:
				tpm = null;
				break;
		}
		
		Motor m2 = new Motor(marca,potencia,tpm);
		
		System.out.println("Datos motor usuario: ");
		System.out.println(m2);
		
	}

}
