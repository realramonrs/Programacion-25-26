package ficheros;
import java.io.*;
public class EscribirFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileWriter escritor = new FileWriter(Utilidades.ruta,true);
			BufferedWriter bf = new BufferedWriter(escritor);
			bf.newLine();
			bf.write("Ozark,Netflix");
			
			bf.close();
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
