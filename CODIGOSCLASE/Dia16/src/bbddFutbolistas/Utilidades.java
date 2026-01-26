package bbddFutbolistas;

import java.sql.*;
import java.util.ArrayList;

public class Utilidades {
	
	static Connection conexion;
	static ArrayList<Jugador> jugadores = new ArrayList<Jugador>(); 
	
	public static void abrirConexion() throws SQLException {
		conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/futbol","root","");
	}
	
	public static void cerrarConexion() throws SQLException {
		conexion.close();
	}

	public static void llenarArrayList() throws SQLException {
		abrirConexion();
		
		PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM jugadores");
		ResultSet registros = consulta.executeQuery();
		//Volcar los registros al arraylist
		
		while(registros.next()) {
			jugadores.add(new Jugador(registros.getString("Codigo"),registros.getString("Nombre"),registros.getString("Posicion"),
					registros.getString("Equipo"),registros.getDouble("Valoracion"),registros.getInt("Goles"),registros.getInt("Minutos")));
		}
		
		
		cerrarConexion();
	}
	
	public static void insertarJugador(String codigo, String nombre, String posicion, String equipo, double valoracion, int goles, int minutos) throws SQLException {
		abrirConexion();
		PreparedStatement consulta = conexion.prepareStatement("INSERT INTO jugadores(Codigo,Nombre,Posicion,Equipo,Valoracion, Goles, Minutos) VALUES (?,?,?,?,?,?,?)");
		consulta.setString(1, codigo);
		consulta.setString(2, nombre);
		consulta.setString(3, posicion);
		consulta.setString(4, equipo);
		consulta.setDouble(5, valoracion);
		consulta.setInt(6, goles);
		consulta.setInt(7, minutos);
				
		consulta.executeUpdate();
		
		cerrarConexion();
	}
	
	
}
