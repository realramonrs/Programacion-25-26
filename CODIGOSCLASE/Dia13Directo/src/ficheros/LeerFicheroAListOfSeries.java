package ficheros;

import java.util.ArrayList;
import java.io.*;

public class LeerFicheroAListOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Serie> series = new ArrayList<Serie>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(Utilidades.ruta))){
			String registro = "";
			while(registro!=null) {
				registro = bf.readLine();
				if(registro!=null) {
					String[] trozos = registro.split(",");
					Serie s = new Serie(trozos[0],trozos[1]);
					series.add(s);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Serie serie : series) {
			if(serie.getPlataforma().equals("Netflix"))
			System.out.println(serie);
		}
		
	}

}
