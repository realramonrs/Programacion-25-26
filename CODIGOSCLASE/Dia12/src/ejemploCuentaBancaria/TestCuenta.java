package ejemploCuentaBancaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta[] misCuentas = new Cuenta[10];
		
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		//Añadir dos cuentas
		cuentas.add(new CuentaCorriente("ES45",LocalDate.now(),30000));
		cuentas.add(new CuentaAhorro("ES4343",LocalDate.now(),30000,1500));
		cuentas.add(new CuentaCorriente("ES9043",LocalDate.now(),30000));
		cuentas.add(new CuentaAhorro("ES4560",LocalDate.now(),30000,2500));
		cuentas.add(new CuentaCorriente("ES3839",LocalDate.now(),30000));
		
		
		//Ingresar dinero en una cuenta de ahorro que ocupa posición 1
		cuentas.get(1).ingresar(2800);
			
		//Ingresar dinero en una cuenta corriente , la que ocupa la posición 0
		cuentas.get(0).ingresar(1080);
		
		//Retirar dinero en una cuenta de ahorro, que ocupa posicón 3
		
		cuentas.get(3).retirarDinero(300);
		//Retirar dinero en una cuenta corriente
		cuentas.get(4).retirarDinero(300);
		
		//Visualizar el saldo de las 5 cuentas
		
		for(Cuenta c : cuentas) {
			System.out.println(c.toString());
		}
		
		//Retirar 1000 € a todas las cuentas de ahorro
		
		for(Cuenta c : cuentas) {
			if(c instanceof CuentaAhorro) {
				c.retirarDinero(1000);
			}
		}
		//Visualizar el saldo de las 5 cuentas
		System.out.println();
		System.out.println("Después de castigar el ahorro de los contribuyentes: ");
			for(Cuenta c : cuentas) {
					System.out.println(c.toString());
				}
		
		
		//Cobrar los intereses a todas las cuentas corrientes
		
		for(Cuenta c : cuentas) {
			//Cast -> c pasarlo a CuentaCorriente -< downcasting Danger!!!!
			if(c instanceof CuentaCorriente) {
			
				CuentaCorriente cc = (CuentaCorriente)c;
				cc.aplicarInteres();
			}			
		}
		
		System.out.println();
		//Mostrar la info de las cuentas corrientes
		System.out.println("Cuentas corrientes del banco : ");
		
		for(Cuenta c : cuentas) {
			if(c instanceof CuentaCorriente) {
				System.out.println(c);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
