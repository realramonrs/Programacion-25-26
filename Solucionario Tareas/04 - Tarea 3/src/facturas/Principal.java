package facturas;

import java.io.IO;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Principal {
	
	static int menu() {
		System.out.println("Escoja una de las siguientes opciones: ");
		System.out.println("0. Mostrar todas las facturas.");
		System.out.println("1. Introducir nueva factura");
		System.out.println("2. Pagar factura");
		System.out.println("3. Mostrar facturas por tipo");
		System.out.println("4. Mostrar facturas vencidas");
		System.out.println("5. Guardar cambios y salir.");
		System.out.println();
		int opcion = Integer.parseInt(IO.readln("Escoja una opción: "));
		return opcion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Utilidades.escribirFacturaEnFichero(new FacturaNacional(100,"Clases",LocalDate.now(),LocalDate.now().plusDays(7)),true);
		//Recuperar registros del fichero
		ArrayList<Factura> facturas = Utilidades.getFacturasFichero();

		System.out.println("Bienvenido al sistema de facturación: ");
		

		int opcion= 0;
		do{
			opcion = menu();

			switch(opcion) {
			case 0:
				System.out.println("  *******************  ");
				System.out.println("Le muestro las facturas actualmente guardadas en el sistema: \n");
			
				for(Factura f : facturas) {
					System.out.println(f);
					System.out.println();
				}
				System.out.println("  *******************  ");
				
				break;
				
			case 1:
				Factura nuevaFactura = null;
				System.out.println("1. Factura nacional");
				System.out.println("2. Factura de exportación");
				System.out.println("3. Factura de servicios.");
				System.out.println("4. Factura Intracomunitaria.");
				
				int tipoFactura = Integer.parseInt(IO.readln("Qué tipo de factura desea introducir: "));
				
				String concepto = IO.readln("Introduzca el concepto: ");
				double precio = Double.parseDouble(IO.readln("Introduzca el precio base: "));
				LocalDate fechaEmision = LocalDate.parse(IO.readln("Introduzca fecha emision (aaaa-mm-dd)"));
				LocalDate fechaVencimiento = LocalDate.parse(IO.readln("Intro fecha vencimiento (aaaa-mm-dd"));
							
						switch(tipoFactura) {
							case 1:
							nuevaFactura = new FacturaNacional(precio,concepto,fechaEmision,fechaVencimiento);
							facturas.add(nuevaFactura);
							
							break;
							case 2:
								String pais = IO.readln("Introduzca el pais : ");
								nuevaFactura = new FacturaExport(precio,concepto,fechaEmision,fechaVencimiento,pais);
								facturas.add(nuevaFactura);
								break;
							case 3:
								nuevaFactura = new FacturaServicios(precio,concepto,fechaEmision,fechaVencimiento);
								facturas.add(nuevaFactura);
								
								break;
							case 4: 
								nuevaFactura = new FacturaIntracomunitaria(precio,concepto,fechaEmision,fechaVencimiento);
								facturas.add(nuevaFactura);
								break;
						}

				break;
			case 2:

				// PAGAR FACTURA
				// Mostramos los códigos de las facturas
				for(Factura f : facturas) {
					System.out.println(f.getId());
				}
				String codigo = IO.readln("Introduzca el código de la factura que desea pagar: ");
				
				
				for(Factura f : facturas) {
					if(f.getId().equals(codigo)) {
						f.pagarFactura();
					}
				}













				break;
			case 3:
					// mostrar facturas por tipo
				
				System.out.println("1. Factura nacional");
				System.out.println("2. Factura de exportación");
				System.out.println("3. Factura de servicios.");
				System.out.println("4. Factura Intracomunitaria.");
				
				int tipoFactura3 = Integer.parseInt(IO.readln("Qué tipo de facturas desea ver: "));

					switch(tipoFactura3) {
							case 1:
								for(Factura f : facturas) {
									if(f!=null) {
										if(f instanceof FacturaNacional) {
											System.out.println(f);
										}
										
									}
								}
								break;
							case 2:
								for(Factura f : facturas) {
									if(f!=null) {
										if(f instanceof FacturaExport) {
											System.out.println(f);
										}
										
									}
								}
								break;
							case 3:
								for(Factura f : facturas) {
									if(f!=null) {
										if(f instanceof FacturaServicios) {
											System.out.println(f);
										}
										
									}
								}
								break;
							case 4:
								for(Factura f : facturas) {
									if(f!=null) {
										if(f instanceof FacturaIntracomunitaria) {
											System.out.println(f);
										}
										
									}
								}
								break;
				
							} // CIERR DEL SWITCH INTERNO DEL CASE 3
					
				break; // FIN DEL CASE 3
			case 4:
				// MOSTRAR FACTURAS VENCIDAS
				for(Factura f : facturas) {
					if(f != null) {
						if(f.diasHastaVencimiento()<0 && f.getFechaPago()==null) {
							System.out.println(f);
						}
					}
				}
				break;
				
			case 5:
				//Guardar y salir
				System.out.println("Guardando los cambios...");
				Utilidades.pasarListaFichero(facturas);	
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Cambios guardados con éxito");
				System.exit(0);
			} // FINAL DEL SWITCH
		} // FINAL DEL DO
		while(opcion<5);


	}

}
