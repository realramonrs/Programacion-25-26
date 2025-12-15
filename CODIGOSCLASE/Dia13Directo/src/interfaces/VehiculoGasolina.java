package interfaces;

public class VehiculoGasolina extends Vehiculo {

	int nivelDeposito;

	public VehiculoGasolina(int velocidadActual, String marca, int nivelDeposito) {
		super(velocidadActual, marca);
		this.nivelDeposito = nivelDeposito;
	}

	public int getNivelDeposito() {
		return nivelDeposito;
	}

	public void setNivelDeposito(int nivelDeposito) {
		this.nivelDeposito = nivelDeposito;
	}

	@Override
	public void acelerar(int velocidad) {
		// TODO Auto-generated method stub
		if(nivelDeposito>0) {
			super.velocidadActual = velocidad;
		}
	}
	
	
}
