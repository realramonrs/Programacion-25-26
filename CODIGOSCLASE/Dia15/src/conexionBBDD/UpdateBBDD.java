package conexionBBDD;

import java.sql.*;


public class UpdateBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/videoclub","root","");
			Statement sentencia = con.createStatement();
			String insert = "INSERT into series (Codigo, Titulo,Plataforma,Valoracion) VALUES ('AA34','Mr Robot','NETFLIX',3) ";
			String update = "UPDATE series SET Valoracion = 4 where Codigo = 'WE45'";
			String delete = "DELETE FROM series Where Codigo = 'R56T' ";
			sentencia.executeUpdate(insert);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
