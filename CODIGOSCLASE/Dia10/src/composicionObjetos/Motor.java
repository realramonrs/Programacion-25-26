package composicionObjetos;

public class Motor {

	private String marca;
	private float nivelAceite;
	private int potencia;
	private TipoMotor tipo;
	
	//Contructores
	public Motor(String marca, int potencia, TipoMotor tipo) {
		super();
		this.nivelAceite = 100;
		this.marca = marca;
		this.potencia = potencia;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getNivelAceite() {
		return nivelAceite;
	}

	public void setNivelAceite(float nivelAceite) {
		this.nivelAceite = nivelAceite;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public TipoMotor getTipo() {
		return tipo;
	}

	public void setTipo(TipoMotor tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", nivelAceite=" + nivelAceite + ", potencia=" + potencia + ", tipo=" + tipo
				+ "]";
	}
	
	
	
}
