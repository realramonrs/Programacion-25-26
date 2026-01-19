package conexionBBDD;

import java.sql.*;

public class EjemploSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valoracion = 4;
		String plataforma = "AMAZON";
		//1. Crear la conexión a la BBDD:
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/videoclub","root","");
			Statement sentencia = miConexion.createStatement();
			//ResultSet registros = sentencia.executeQuery("SELECT * from series where Valoracion > " + valoracion);
			ResultSet registros = sentencia.executeQuery("SELECT * FROM series Where Plataforma = '" + plataforma +  "'");
			while(registros.next()) {
				String registro = registros.getString("Codigo") +" " +  registros.getString("Titulo") + " " + registros.getString("Plataforma") + " " + 
			    registros.getInt("Valoracion");
				System.out.println(registro);
			}


		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
