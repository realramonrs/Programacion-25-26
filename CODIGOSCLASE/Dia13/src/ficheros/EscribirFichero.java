package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = System.getProperty("user.dir") + "\\Series.txt";
		
		try {
			FileWriter escritor = new FileWriter(ruta,true);
			BufferedWriter bf = new BufferedWriter(escritor);
			bf.newLine();
			bf.write("Expediente X*Netflix");
			bf.close();
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
