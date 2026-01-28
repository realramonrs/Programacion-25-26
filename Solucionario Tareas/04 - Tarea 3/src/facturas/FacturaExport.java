package facturas;

import java.time.LocalDate;

public class FacturaExport extends Factura {

	private final static int TASA_ADUANA = 50;
	private String pais;
	
	
	public FacturaExport(String id, String concepto, double base, double precioFinal, LocalDate fechaEmision,
			LocalDate fechaPago, LocalDate fechaVencimiento, Estado estado, String pais) {
		super(id, concepto, base, precioFinal, fechaEmision, fechaPago, fechaVencimiento, estado);
		this.pais = pais;
	}

	public FacturaExport(double base, String concepto, LocalDate fechaEmision, LocalDate fechaVencimiento,String pais) {
		super(base, concepto, fechaEmision, fechaVencimiento);
		//Modificamos el id para identificarla como Exportación
				super.id+="-Exp";
		this.pais = pais;
		
	}
		
	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public static int getTasaAduana() {
		return TASA_ADUANA;
	}

	@Override
	public void calcularPrecioFinal() {
		// TODO Auto-generated method stub
		super.setPrecioFinal(super.getPrecioFinal() + this.TASA_ADUANA);
	}

	@Override
	public String escribirFichero() {
		// TODO Auto-generated method stub
		return super.escribirFichero() + "," + this.TASA_ADUANA + "," + this.pais;
	}
}
