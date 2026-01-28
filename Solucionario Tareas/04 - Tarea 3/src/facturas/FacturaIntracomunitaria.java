package facturas;

import java.time.LocalDate;

public class FacturaIntracomunitaria extends FacturaNacional {
	private static double IVA = 0;
	
	
	public FacturaIntracomunitaria(String id, String concepto, double base, double precioFinal, LocalDate fechaEmision,
			LocalDate fechaPago, LocalDate fechaVencimiento, Estado estado) {
		super(id, concepto, base, precioFinal, fechaEmision, fechaPago, fechaVencimiento, estado);
	}

	public FacturaIntracomunitaria(double base, String concepto, LocalDate fechaEmision, LocalDate fechaVencimiento) {
		super(base, concepto, fechaEmision, fechaVencimiento);
		calcularPrecioFinal();
		// TODO Auto-generated constructor stub
		//Modificamos el id para identificarla como IntraComunitaria
				super.id+="-Int";
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
