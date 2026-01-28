package facturas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public abstract class Factura implements Archivable {

	protected String id;
	private String concepto;
	private double base;
	private double precioFinal;
	private LocalDate fechaEmision;
	private LocalDate fechaPago;
	private LocalDate fechaVencimiento;
	private Estado estado;
	
	
	
	public Factura(String id, String concepto, double base, double precioFinal, LocalDate fechaEmision,
			LocalDate fechaPago, LocalDate fechaVencimiento, Estado estado) {
		super();
		this.id = id;
		this.concepto = concepto;
		this.base = base;
		this.precioFinal = precioFinal;
		this.fechaEmision = fechaEmision;
		this.fechaPago = fechaPago;
		this.fechaVencimiento = fechaVencimiento;
		this.estado = estado;
	}

	public Factura(double base, String concepto, LocalDate fechaEmision, LocalDate fechaVencimiento) {
		super();
		generarId();
		this.concepto = concepto;
		this.base = base;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.estado = Estado.ENPLAZO;
		this.precioFinal = base;
	}
	
	//Método que genera el ID de la Factura
	private void generarId() {
		String id = "";
		String anho = Integer.toString(LocalDate.now().getYear());
		id = anho + "-";
		char[] letras = {'A' ,'B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] digitos = { '1','2','3','4','5','6','7','8','9','0'};
		Random aleat = new Random();
		String letra1 = Character.toString(letras[aleat.nextInt(0, letras.length)]);
		String letra2 = Character.toString(letras[aleat.nextInt(0, letras.length)]);
		String dig1 = Character.toString(digitos[aleat.nextInt(0, digitos.length)]);
		String dig2 = Character.toString(digitos[aleat.nextInt(0, digitos.length)]);
		
		id += letra1 + letra2 + dig1 + dig2;
		this.id = id;
	}

	//setters y getters
	
	public double getBase() {
		return base;
	}
	
	

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getId() {
		return id;
	}
	
	// Métodos comunes a todas las facturas
	
	public int diasHastaVencimiento() {
	
		
		return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
	}
	
	public abstract void calcularPrecioFinal();
	
	public void pagarFactura() {
		calcularPrecioFinal();
		this.estado = Estado.PAGADA;
		this.fechaPago = LocalDate.now();
	}
	
	public void pagarFactura(int dia,int mes, int anyo) {
		calcularPrecioFinal();
		this.estado = Estado.PAGADA;
		this.fechaPago = LocalDate.of(anyo,mes,dia);
	}
	
	@Override
	public String escribirFichero() {
		String fact=null;
		if(fechaPago!=null && !fechaPago.equals("Sin Pagar")) {
		 fact = this.id + "," + this.concepto + "," + Double.toString(this.base) + "," + this.precioFinal + "," + this.fechaEmision.toString() + "," +
		this.fechaPago + "," + this.fechaVencimiento.toString() + "," + this.estado.toString();
		}
		else {
		 fact = this.id + "," + this.concepto + "," + Double.toString(this.base) + "," + this.precioFinal + "," + this.fechaEmision.toString() + ","
				+ "Sin Pagar," + this.fechaVencimiento.toString() + "," + this.estado.toString();
		}
		return fact;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		if(this.fechaPago!=null) {
		return " ****** DATOS FACTURA CON ID =" + id + " ******: \n Concepto=" + concepto + "\n Base=" + base + "\n Precio Final=" + precioFinal
				+ "\n Fecha Emisión =" + fechaEmision + "\n Fecha Pago=" + fechaPago + "\n Fecha Vencimiento="
				+ fechaVencimiento + "\n estado=" + estado + "\n";
		}
		else {
			return " ****** DATOS FACTURA CON ID =" + id + " ******: \n Concepto=" + concepto + "\n Base=" + base + "\n Precio Final=" + precioFinal
					+ "\n Fecha Emisión =" + fechaEmision + "\n Fecha Pago= Sin Pagar" + "\n Fecha Vencimiento="
					+ fechaVencimiento + "\n estado=" + estado + "\n";
		}
	}
	
	
	
}
