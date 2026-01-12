package appsGraficasI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana2 extends JFrame {

	private JLabel lblIdFactura,lblPrecioBase;
	private JTextField txtIdFactura, txtPrecioBase;
	
	private JButton btnGuardarFactura;
	
	
	public MiVentana2() {
		
		this.setTitle("Mi primera ventana.");
		//Situar la ventana en el centro de la pantalla del usuario
		 Toolkit tl = Toolkit.getDefaultToolkit();
	     Dimension tam = tl.getScreenSize();
	     int alturaPantalla = tam.height;
	     int anchoPantalla = tam.width;
	     setSize(anchoPantalla/2 , alturaPantalla/2);
	     setLocation(anchoPantalla/4,alturaPantalla/4);
		
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		 //Llamada a inicializarComponentes
		inicializarComponentes();
		
		
		//Agregar los componentes al JFrame
		
		setLayout(null);
		add(lblIdFactura);
		add(txtIdFactura);
		add(lblPrecioBase);
		add(txtPrecioBase);
		add(btnGuardarFactura);
		
		lblIdFactura.setBounds(20, 20,70,30);
		txtIdFactura.setBounds(100,25,150,25);
		
	/*	add(lblIdFactura,BorderLayout.NORTH);
		add(txtIdFactura,BorderLayout.EAST);
		getContentPane().add(lblPrecioBase,BorderLayout.WEST);
		add(txtPrecioBase,BorderLayout.SOUTH);
		add(btnGuardarFactura,BorderLayout.CENTER);*/
		
		this.setVisible(true);
		
		
	}
	
	
	private void inicializarComponentes() {
		lblIdFactura = new JLabel("Id Factura: ");
		lblPrecioBase = new JLabel("Precio base: ");
		txtIdFactura = new JTextField(10);
		txtPrecioBase = new JTextField(10);
		btnGuardarFactura = new JButton("Guardar Factura.");
		
	}
	
	
}
