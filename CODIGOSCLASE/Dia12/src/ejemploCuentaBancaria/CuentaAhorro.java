package ejemploCuentaBancaria;

import java.time.LocalDate;

public class CuentaAhorro extends Cuenta {

	//Una cuentaAhorro es como una Cuenta.
	private double limite;
	
	//Constructor
	public CuentaAhorro(String numero,LocalDate fechaApertura,double saldo, double limite) {
		super(numero,fechaApertura,saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean retirarDinero(double cantidad) {
		//Comprobar que la cantidad es menor que el límite
		if(cantidad < limite) {
			//Comprobar que el saldo no queda en negativo
			if(getSaldo() - cantidad > 0) {				
				setSaldo(getSaldo()-cantidad);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "CuentaAhorro: "  + super.toString() + " limite=" + limite;
	}
	
	
	
}
