package ficheros;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerFicheroAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> series = new ArrayList<String>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(Utilidades.ruta))){
			String registro = "";
			
			while(registro!=null) {
				registro = bf.readLine();
				if(registro!=null) {
					series.add(registro);
				}
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(String s : series) {
			System.out.println(s);
		}
		
		
		
	/*	try {
			FileReader lector = new FileReader(Utilidades.ruta);
			BufferedReader bf = new BufferedReader(lector);
			String registro = "";
			
			while(registro!=null) {
				registro = bf.readLine();
				if(registro!=null) {
					series.add(registro);
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
		}*/
		
	}

}
