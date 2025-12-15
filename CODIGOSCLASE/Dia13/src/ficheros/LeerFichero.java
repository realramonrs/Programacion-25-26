package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = System.getProperty("user.dir") + "\\Series.txt";
		System.out.println(ruta);
		
		
		try {
			//Creamos clase que define flujo acceso fichero
			FileReader lector;
			lector = new FileReader(ruta);
			BufferedReader bf = new BufferedReader(lector);
			String linea = "";
			
			while(linea!=null) {
				linea = bf.readLine();
				System.out.println(linea);
			}
			bf.close();
			lector.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
