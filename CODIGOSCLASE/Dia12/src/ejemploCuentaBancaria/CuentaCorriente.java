package ejemploCuentaBancaria;

import java.time.LocalDate;

public class CuentaCorriente extends Cuenta {
	
	//Una cuentacorriente es una cuenta
	public CuentaCorriente(String numero, LocalDate fechaApertura, double saldo) {
		super(numero, fechaApertura, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cuenta Corriente " + super.toString();
	}

	@Override
	public boolean retirarDinero(double cantidad) {
		// TODO Auto-generated method stub
		if(getSaldo() - cantidad > -10000) {
			setSaldo(getSaldo()-cantidad);
			return true;
		}
		return false;
	}
	
	//aplicarInteres: es retirar un % del saldo 
	
	public void aplicarInteres() {
		
		if(getSaldo()<1000) {
			//Le quitamos un 5% del saldo
			setSaldo(getSaldo()-0.05*getSaldo());
		}
		else if(getSaldo()<20000) {
			setSaldo(getSaldo()-0.1*getSaldo());
		}
		else {
			setSaldo(getSaldo()-0.2*getSaldo());
		}
	}

	
	
}
