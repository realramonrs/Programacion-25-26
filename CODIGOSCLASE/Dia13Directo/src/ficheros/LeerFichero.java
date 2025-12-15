package ficheros;

import java.io.*;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader lector = new FileReader(Utilidades.ruta);
			BufferedReader bf = new BufferedReader(lector);
			String registro = "";
			
			while(registro!=null) {
				registro = bf.readLine();
				if(registro!=null) {
					//if(registro.contains("Netflix")) {
						System.out.println(registro);
					//}
				}
				
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
