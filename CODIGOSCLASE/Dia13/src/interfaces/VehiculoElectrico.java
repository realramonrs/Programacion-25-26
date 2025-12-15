package interfaces;

public class VehiculoElectrico extends Vehiculo implements Electrico {

	private int nivelBateria;
       
    public VehiculoElectrico(String marca) {
        super(marca);
        nivelBateria = 50;
    }

    // --- Contrato 1: Implementación de Conducible ---
    @Override
    public void acelerar(int velocidad) {
        if (nivelBateria > 0) {
            setVelocidadActual(velocidad);
            System.out.println(getMarca() + " acelerando a " + velocidad + " km/h.");
        } else {
            System.out.println("Batería agotada. No se puede acelerar.");
        }
    }

    @Override
    public void frenar() {
        setVelocidadActual(0);
        System.out.println(getMarca() + " deteniéndose.");
    }

    // --- Contrato 2: Implementación de Electrico ---
    @Override
    public void cargarBateria() {
        this.nivelBateria = 100;
        System.out.println(getMarca()  + " conectado. Batería cargada al 100%.");
    }

    @Override
    public int verificarNivelBateria() {
        return nivelBateria;
    }
}
