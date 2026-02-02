package repasoParte2;

public class Mail extends Mensaje {

	private String asunto;
	
	public Mail() {
		super();
	}
	
	public Mail(String origen,String destino,String asunto) {
		super(origen,destino);
		this.asunto = asunto;
			
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Override
	public void enviarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("From : " + super.getOrigen());
		System.out.println("To :" +  super.getDestino());
		System.out.println("Asunto: " + this.asunto);
		System.out.println(mensaje);
	}

	@Override
	public String toString() {
		return "Mail [asunto=" + asunto + " " + super.toString() + "]";
	}
	
	
	
	
}
