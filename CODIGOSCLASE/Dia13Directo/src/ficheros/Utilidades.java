package ficheros;
import java.io.*;
import java.util.ArrayList;
public class Utilidades {

	public static String ruta = System.getProperty("user.dir") + "\\Series.txt";
	
	
	public static void addRegistro(String titulo,String plataforma) {
		try {
			FileWriter escritor = new FileWriter(Utilidades.ruta,true);
			BufferedWriter bf = new BufferedWriter(escritor);
			bf.newLine();
			bf.write(titulo +","+plataforma);
			
			bf.close();
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Serie> getDatosFicheroSeries(){
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
		
		return series;
	}
}
