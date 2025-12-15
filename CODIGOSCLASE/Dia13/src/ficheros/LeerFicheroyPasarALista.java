package ficheros;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class LeerFicheroyPasarALista {

	public static void main(String[] args) {
		String ruta = System.getProperty("user.dir") + "\\Series.txt";
		System.out.println(ruta);
		List<String> series = new ArrayList<String>();
		
		try {
			FileReader lector = new FileReader(ruta);
			BufferedReader bf = new BufferedReader(lector);
			String linea = "";
			while(linea!=null) {
				linea = bf.readLine();
				series.add(linea);
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
		
		for(String s : series) {
			System.out.println(s);
		}
	}
}
