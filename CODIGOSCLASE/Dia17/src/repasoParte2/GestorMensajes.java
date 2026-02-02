package repasoParte2;

import java.util.ArrayList;

public class GestorMensajes {

	private ArrayList<Mensaje> lista;
	
	public GestorMensajes() {
		lista = new ArrayList<Mensaje>();
	}
	
	public GestorMensajes(int capacidad) {
		lista = new ArrayList<Mensaje>(capacidad);
	}

	public GestorMensajes(ArrayList<Mensaje> lista) {
		super();
		this.lista = lista;
	}
	
	public Mensaje getMensaje(int posicion) {
		return lista.get(posicion);
	}
	
	public Mensaje getMensaje(String origen,String destino) {
		for(Mensaje m : lista) {
			if(m.getOrigen().equals(origen) && m.getDestino().equals(destino)){
				return m;
			}
		}
		return null;
	}
	
	//Método que añade un Mensaje a la lista
	public void addMensaje(Mensaje m) {
		lista.add(m);
	}
	
	//Eliminar mensaje
	public void eliminarMensaje(int posicion) {
		this.lista.remove(posicion);
	}
	
	//Eliminar todos los mails de un mismo origen
	
	public void eliminarMailsUsuario(String origen) {
		
		for(int i = lista.size()-1;i>=0;i--) {
			if(lista.get(i)!=null) {
				if(lista.get(i) instanceof Mail) {
					if(lista.get(i).getOrigen().equals(origen)) {
						lista.remove(i);						
					}
				}
		   }
		}
	}
	
	public void mostrarMensaje() {
		for(Mensaje m : lista) {
			System.out.println(m);
		}
	}
	
	// Obtener el primer mensaje que en su asunto contenga una determinada palabra
	
	public Mensaje getMensajeByPalabra(String palabra) {
		for(Mensaje m : lista) {
			
			if(m instanceof Mail) {
				Mail mail = (Mail)m;
				if(mail.getAsunto().contains(palabra)) {
					return mail;
				}
			}
		}
		return null;
	}
	
}
