package clasesDia11;

import java.time.LocalDate;
import java.util.Arrays;

public class Reunion {

	private String id;
	private LocalDate fecha;
	private String asunto;
	private String[] anotaciones;
	
	public Reunion(String id, LocalDate fecha, String asunto) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.asunto = asunto;
		anotaciones = new String[10];
	}
	
	public Reunion(String id,  String asunto) {
		super();
		this.id = id;
		this.fecha = LocalDate.now();
		this.asunto = asunto;
		anotaciones = new String[10];
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getId() {
		return id;
	}
		
	//Añadir método que permita añadir una anotacion a la Reunion
	
	public boolean addAnotacion(String nota) {
		
		for(int i = 0;i<anotaciones.length;i++) {
			if(anotaciones[i] == null) {
				anotaciones[i] = nota;
				
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Reunion [id=" + id + ", fecha=" + fecha + ", asunto=" + asunto + ", anotaciones="
				+ Arrays.toString(anotaciones) + "]";
	}
	
	
	
	
}
