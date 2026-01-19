package conexionBBDD;

import java.sql.*;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/videoclub","root","");
			PreparedStatement sentencia = con.prepareStatement("SELECT * FROM series Where Plataforma = ? AND Valoracion < ?");
			sentencia.setString(1, "NETFLIX");
			sentencia.setInt(2, 5);
			ResultSet registros = sentencia.executeQuery();
			
			while(registros.next()) {
				System.out.println(registros.getString(1) + " " + registros.getString(2) + " " + registros.getString(3) + 
						" " + registros.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
