package facturas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Utilidades {

	public static String ruta = System.getProperty("user.dir")+"\\facturas.txt";
	
	
	public static void pasarListaFichero(ArrayList<Factura> lista) {
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta,false))){
			for(Factura f : lista) {
				escritor.write(f.escribirFichero());
				escritor.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static ArrayList<Factura> getFacturasFichero(){
		
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(ruta))){
					String registro = "";
						
						while(registro!=null) {
							registro = bf.readLine();
							if(registro!=null) {
								String[] trozos = registro.split(",");
								//Tenemos que averiguar de que tipo de Factura se trata:
								String tipo = trozos[0].substring(trozos[0].length()-3);
								Estado estado = null;
								  switch(trozos[7]) {
								  case "PAGADA":
									  estado = Estado.PAGADA;
									  break;
								  case "ENPLAZO":
									  estado = Estado.ENPLAZO;
									  break;
								  case "VENCIDA":
									  estado = Estado.VENCIDA;
									  break;
								  }
								switch(tipo) {
								case "Nac":
								  if(trozos[5].equals("Sin Pagar")) {
									  FacturaNacional fn = new FacturaNacional(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
												null, LocalDate.parse(trozos[6]), estado);
										facturas.add(fn);
								  }
								  else {
									FacturaNacional fn = new FacturaNacional(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
											LocalDate.parse(trozos[5]), LocalDate.parse(trozos[6]), estado);
									facturas.add(fn);
								  }
									break;
								case "Exp":
									if(trozos[5].equals("Sin Pagar")) {
									FacturaExport fe = new FacturaExport(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
											null, LocalDate.parse(trozos[6]), estado,trozos[8]);
									facturas.add(fe);
									}
									else {
										FacturaExport fe = new FacturaExport(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
												LocalDate.parse(trozos[5]), LocalDate.parse(trozos[6]), estado,trozos[8]);
										facturas.add(fe);
									}
									break;
								case "Int":
									if(trozos[5].equals("Sin Pagar")) {
									FacturaIntracomunitaria fi = new FacturaIntracomunitaria(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
											null, LocalDate.parse(trozos[6]), estado);
									facturas.add(fi);
									}
									else {
										FacturaIntracomunitaria fi = new FacturaIntracomunitaria(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
												LocalDate.parse(trozos[5]), LocalDate.parse(trozos[6]), estado);
										facturas.add(fi);
									}
									break;
								case "Ser":
									if(trozos[5].equals("Sin Pagar")) {
									FacturaServicios fs = new FacturaServicios(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
											null, LocalDate.parse(trozos[6]), estado);
									facturas.add(fs);
									}
									else {
										FacturaServicios fs = new FacturaServicios(trozos[0], trozos[1], Double.parseDouble(trozos[2]), Double.parseDouble(trozos[3]),LocalDate.parse(trozos[4]), 
												LocalDate.parse(trozos[5]), LocalDate.parse(trozos[6]), estado);
										facturas.add(fs);
									}
									break;
									
								}
							}
						}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return facturas;
	}



	public static void escribirFacturaEnFichero(Factura f,Boolean append) {
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(ruta,true))){
			bf.newLine();
			bf.append(f.escribirFichero());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
