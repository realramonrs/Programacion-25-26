package interfaces;

public  class VehiculoElectrico extends Vehiculo implements Electrico {

	int nivelBateria;

	public VehiculoElectrico(int velocidadActual, String marca, int nivelBateria) {
		super(velocidadActual, marca);
		this.nivelBateria = nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	@Override
	public void acelerar(int velocidad) {
		// TODO Auto-generated method stub
		if(nivelBateria>0) {
			super.velocidadActual = velocidad;
		}
	}

	@Override
	public void cargarBateria() {
		// TODO Auto-generated method stub
		this.nivelBateria = 100;
	}

	@Override
	public int checkNivelBateria() {
		// TODO Auto-generated method stub
		return this.nivelBateria;
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [nivelBateria=" + nivelBateria + ", Marca=" + getMarca()
				+ ", Velocidad Actual =" + getVelocidadActual() + "]";
	}
	
	
	
	
	
}
