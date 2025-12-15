package ficheros;

public class Serie {

	private String titulo;
	private String plataforma;
	public Serie(String titulo, String plataforma) {
		super();
		this.titulo = titulo;
		this.plataforma = plataforma;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", plataforma=" + plataforma + "]";
	}
	
	
	
}
