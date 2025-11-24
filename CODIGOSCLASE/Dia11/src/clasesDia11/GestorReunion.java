package clasesDia11;

import java.time.LocalDate;

public class GestorReunion {

	private Reunion[] r;
	
	public GestorReunion(int capacidad) {
		r = new Reunion[capacidad];
	}
	
	//Método que permita añadir una reunión
	public boolean addReunion(String id,String asunto, int year,int month,int day) {
				
		for(int i = 0;i<r.length;i++) {
			if(r[i] == null) {
				r[i] = new Reunion(id,LocalDate.of(year, month, day),asunto);
				return true;
			}
		}
		return false;
		
	}
	
	//Método que me devuelva la reunión a partir del Id
		
	public Reunion getReunionById(String id) {
		for(Reunion reunion : r ) {
			if(reunion!=null) {
				if(reunion.getId().equals(id)) {
					return reunion;
				}
			}
		}
		return null;
	}
	
	//Método que permite añadir una anotación a una reunión a partir del Id
	
	public void addAnotacion(String id,String nota) {
		//Obtengo la reunión:
		Reunion r1 = getReunionById(id);
		if(r1!=null) {
			r1.addAnotacion(nota);
		}
	}
	
	public int getNumeroReuniones() {
		int counter = 0;
		for(Reunion reunion : r) {
			if(reunion!=null) {
				counter++;
			}
		}
		return counter;
	}
	
	//Método que devuelve las reuniones de hoy
	public Reunion[] getReunionesToday() {
		Reunion[] local = new Reunion[getNumeroReuniones()];
		int counter = 0;
		for(Reunion reunion : r) {
			if(reunion!=null) {
			if(reunion.getFecha().isEqual(LocalDate.now())) {
				local[counter] = reunion;
				counter++;
			}
			}
		}
		
		return local;
		
	}
	
	
	
	
	
	
	
}
