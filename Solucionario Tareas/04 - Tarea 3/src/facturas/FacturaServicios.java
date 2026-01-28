package facturas;

import java.time.LocalDate;

public class FacturaServicios extends Factura {

	private static double IVA = 0.21;
	private static double IRPF = 0.15;
	
	
	public FacturaServicios(String id, String concepto, double base, double precioFinal, LocalDate fechaEmision,
			LocalDate fechaPago, LocalDate fechaVencimiento, Estado estado) {
		super(id, concepto, base, precioFinal, fechaEmision, fechaPago, fechaVencimiento, estado);
	}

	public FacturaServicios(double base, String concepto, LocalDate fechaEmision, LocalDate fechaVencimiento) {
		super(base, concepto, fechaEmision, fechaVencimiento);
		// TODO Auto-generated constructor stub
		//Modificamos el id para identificarla como Servicios
				super.id+="-Ser";
	}

	public static double getIVA() {
		return IVA;
	}

	public static void setIVA(double iVA) {
		IVA = iVA;
	}

	public static double getIRPF() {
		return IRPF;
	}

	public static void setIRPF(double iRPF) {
		IRPF = iRPF;
	}

	@Override
	public void calcularPrecioFinal() {
		// TODO Auto-generated method stub
		super.setPrecioFinal(super.getPrecioFinal() + super.getPrecioFinal()*IVA + super.getPrecioFinal()*IRPF);

	}

}
