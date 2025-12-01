package ejemploCuentaBancaria;

import java.time.LocalDate;

public abstract class Cuenta {
	//Habrá dos tipos de cuentas:
	//Ahorro
	//Corriente
	//En ambas es posible ingresar dinero
	//Para retirar dinero, las cuentas corrientes permiten retirar cualquier cantidad aunque el saldo quede negativo
	//hasta 10000 euros
	//Las cuentas de ahorro no permiten retirar cantidad que supongan saldo negativo

	private String numero;
	private LocalDate fechaApertura;
	private double saldo;
	
	
	public Cuenta(String numero, LocalDate fechaApertura, double saldo) {
		super();
		this.numero = numero;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	//Ingresar Dinero
	public void ingresar(double cantidad) {
		this.saldo+= cantidad;
	}
	
	//Retirar Dinero: Depende del tipo de cuenta 
	
	public abstract boolean retirarDinero(double cantidad);
	
	//Consultar saldo
	public double getSaldo() {
		return saldo;
	}
		
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Número de cuenta: " + this.numero + " Fecha Apertura : " + this.fechaApertura + " saldo : " + this.saldo;
	}
}
