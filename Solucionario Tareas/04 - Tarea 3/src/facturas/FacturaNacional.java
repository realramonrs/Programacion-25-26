package facturas;

import java.time.LocalDate;

public class FacturaNacional extends Factura {

	private static double IVA = 0.21;
	
	
	public FacturaNacional(String id, String concepto, double base, double precioFinal, LocalDate fechaEmision,
			LocalDate fechaPago, LocalDate fechaVencimiento, Estado estado) {
		super(id, concepto, base, precioFinal, fechaEmision, fechaPago, fechaVencimiento, estado);
	}

	public FacturaNacional(double base, String concepto, LocalDate fechaEmision, LocalDate fechaVencimiento) {
		super(base, concepto, fechaEmision, fechaVencimiento);
		//Modificamos el id para identificarla como nacional
		super.id+="-Nac";
		calcularPrecioFinal();
		// TODO Auto-generated constructor stub
	}

	public static double getIVA() {
		return IVA;
	}

	public static void setIVA(double iVA) {
		IVA = iVA;
	}

	@Override
	public void calcularPrecioFinal() {
		// TODO Auto-generated method stub
		super.setPrecioFinal(super.getPrecioFinal() + super.getPrecioFinal()*IVA);
	}
	

}
