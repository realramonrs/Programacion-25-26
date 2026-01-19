package appGraficaconWB;

public class Serie {

	private String codigo;
	private String titulo;
	private String plataforma;
	public Serie(String codigo, String titulo, String plataforma) {
		super();
		this.codigo = codigo;
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
	public String getCodigo() {
		return codigo;
	}
	@Override
	public String toString() {
		return "Serie : " + codigo + ", titulo=" + titulo + ", plataforma=" + plataforma + "]";
	}
	
	
}
