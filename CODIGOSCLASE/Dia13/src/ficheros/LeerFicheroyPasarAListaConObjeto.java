package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerFicheroyPasarAListaConObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = System.getProperty("user.dir") + "\\Series.txt";
		System.out.println(ruta);
		List<Serie> series = new ArrayList<Serie>();
		
		try {
			FileReader lector = new FileReader(ruta);
			BufferedReader bf = new BufferedReader(lector);
			String linea = "";
			while(linea!=null) {
				linea = bf.readLine();
				if(linea!=null) {
				Serie s = new Serie(linea.split(",")[0],linea.split(",")[1]);
				series.add(s);
					
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
		
		for(Serie s : series) {
			System.out.println(s);
		}
	}

}
