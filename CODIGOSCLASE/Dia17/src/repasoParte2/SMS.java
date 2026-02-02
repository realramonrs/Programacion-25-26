package repasoParte2;

public class SMS extends Mensaje {

	private final int limiteCaracteres = 140;

	public SMS() {
		//this.limiteCaracteres = 140;
	}

	public SMS(String destino, String origen) {
		super(destino, origen);
		//this.limiteCaracteres = limiteCaracteres;
	}

	public int getLimiteCaracteres() {
		return limiteCaracteres;
	}

	@Override
	public void enviarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		if(mensaje.length()<this.limiteCaracteres) {
			System.out.println("De : " + super.getOrigen());
			System.out.println(mensaje);
		}
		else {
			System.out.println("Exceso de caracteres, no se puede enviar.");
		}
	}

	@Override
	public String toString() {
		return "SMS limiteCaracteres=" + limiteCaracteres + " " + super.toString();
	}

	
	
	
}
