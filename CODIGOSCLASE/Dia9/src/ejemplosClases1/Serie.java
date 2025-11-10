package ejemplosClases1;

public class Serie {
// Necesitamos una aplicación que gestione toda la información de las series de una plataforma
//De cada serie se necesita saber: Título, Capitulos, Valoración y Género
//Todas las series tienen que tener todos los datos desde que se crean.
	//Todos los atributos son privados
	//Se debe sobreescribir el método toString para que se printe correctamente toda la info de una serie
	private String titulo;
	private int capitulos;
	private float valoracion;
	private String genero;
	
	//Constructor:
	public Serie(String titulo, int capitulos, float valoracion, String genero) {
		this.titulo = titulo;
		this.capitulos = capitulos;
		this.valoracion = valoracion;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}	

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public float getValoracion() {
		return valoracion;
	}

	public void setValoracion(float valoracion) {
		if(valoracion>=1 && valoracion <= 5) {
			this.valoracion = valoracion;
		}
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", capitulos=" + capitulos + ", valoracion=" + valoracion + ", genero="
				+ genero + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
