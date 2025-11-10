package ejemploClases2;

import java.util.Arrays;

public class Alumno {
	//De cada alumno necesitamos guardar:
	//DNI , Nombre, Curso , Notas, Media
	//Curso es un enumerado : DAW , DAM, ASIR, ROBÓTICA , ACFISICO , EDINFANTIL
	
	private String dni;
	private String nombre;
	private CURSO curso;
	private int[] notas;
	private float media;
	
	//Constructor que permita crear un alumno con un dni, nombre, curso, y
	//que le de tamaño a la matriz de notas, por defecto 10 notas.
	public Alumno(String dni, String nombre, CURSO curso) {
		super();
		this.setDni(dni);
		this.nombre = nombre;
		this.curso = curso;
		this.notas = new int[10];
		//Inicializar todas las notas a -1
		for(int i = 0;i<notas.length;i++) {
			notas[i] = -1;
		}
	}
	//Métodos de acceso para dni, nombre y curso
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(validarDNI(dni))
		this.dni = dni;
	}
	
	private boolean validarDNI(String dni) {
		//Primero hay que comprobar que el string tiene 8 dígitos y una letra
		//Yo como soy el profesor eso me lo salto
		
		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
				'J','Z','S','Q','V','H','L','C','K','E'};
		//Lo pasamos a entero para poder dividir entre 23
				int dniNumero = Integer.parseInt(dni.substring(0, 8));
				int resto = dniNumero%23;
				char letra = letras[resto];
				
		//Comprobamos que la letra es la correcta
				if(dni.charAt(8) == letra) {
					return true;
				}
				return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CURSO getCurso() {
		return curso;
	}

	public void setCurso(CURSO curso) {
		this.curso = curso;
	}

	public int[] getNotas() {
		int[] notasReales = new int[contarNotas()];
		//Pasar a notasReales las notas
		for(int i = 0;i<notasReales.length;i++) {
			notasReales[i] = notas[i];
		}
		return notasReales;
	}
	
	//Método que me devuelva el número de calificaciones o notas
	private int contarNotas() {
		int contador = 0;
		for(int nota : notas) {
			if(nota != -1) {
				contador++;
			}
		}
		return contador;
	}

	public float getMedia() {
		return media;
	}
	
	
	//Método que permite añadir una nota a un alumno
	public boolean addNota(int nota) {
		//Almacena la nota en la primera pos vacía
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]==-1) {
				notas[i] = nota;
				setMedia(); //Actualizar la media
				return true;
			}
		}
		return false;
	}
	
	//Método que actualiza la media de un alumno
	public void setMedia() {
		int suma = 0;
		int contadorNotas = 0;
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]!=-1) {
				suma+= notas[i];
				contadorNotas++;
			}
		}
		
		media = (float)suma / contadorNotas;
		
	}
	@Override
	public String toString() {
		
		String notas1 = "";
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]!=-1) {
				notas1+= notas[i] + " ";
			}
		}		
		
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", curso=" + curso + ", notas= " + Arrays.toString(getNotas())
				+ ",media=" + media + "]";
	}
	
	
	

}
