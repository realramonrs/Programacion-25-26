package repasoParte2;

public class TestMensajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestorMensajes gm = new GestorMensajes();
		gm.addMensaje(new Mail("ramon@fpfomento.com","pepe@gmail.com","Suspenso examen progrmación"));
		gm.addMensaje(new Mail("ramon@fpfomento.com","juan@gmail.com","Entradas RC Celta"));
		gm.addMensaje(new SMS("678343456","689787878"));
		
		
		
		gm.eliminarMailsUsuario("ramon@fpfomento.com");
		gm.mostrarMensaje();
		
		//Enviar mensaje de ramon a pepe
		//gm.getMensaje("ramon@fpfomento.com","pepe@gmail.com").enviarMensaje("Si quieres aprobar comprame un jamón");
		
		//gm.getMensaje("678343456", "689787878").enviarMensaje("Hay que ir a ver la Europa League a Balaidos");
	
		//Obtener primer mensaje que contenga examen
	
		Mail m = (Mail) gm.getMensajeByPalabra("examen");
		//System.out.println("Primer mensaje con palabra examen:");
		//System.out.println(m);
	}

}
