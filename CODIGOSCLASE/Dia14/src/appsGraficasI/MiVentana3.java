package appsGraficasI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana3 extends JFrame {

	private JLabel lblIdFactura,lblPrecioBase,lblTitulo;
	private JTextField txtIdFactura, txtPrecioBase;	
	private JButton btnGuardarFactura,btnBorrarDatos;
	
	
	public MiVentana3() {
		
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
		
		add(lblTitulo,BorderLayout.NORTH);
		//Vamos a utilizar un FlowLayOut en la zona Center
		
		JPanel central = new JPanel(new FlowLayout());
		central.add(lblIdFactura);
		central.add(txtIdFactura);
		central.add(lblPrecioBase);
		central.add(txtPrecioBase);
		
		add(central,BorderLayout.CENTER);
		
		
		JPanel sur = new JPanel();
		sur.setLayout(new BoxLayout(sur,BoxLayout.LINE_AXIS));
		
		sur.add(btnGuardarFactura);
		sur.add(Box.createRigidArea(new Dimension(10,0)));
		sur.add(btnBorrarDatos);
		
		add(sur,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}
	
	
	private void inicializarComponentes() {
		lblIdFactura = new JLabel("Id Factura: ");
		lblPrecioBase = new JLabel("Precio base: ");
		lblTitulo = new JLabel("DATOS NUEVA FACTURA");
		lblTitulo.setFont(new Font("ARIAL",2,25));
		txtIdFactura = new JTextField(10);
		txtPrecioBase = new JTextField(10);
		btnGuardarFactura = new JButton("Guardar Factura.");
		btnBorrarDatos = new JButton("Borrar formulario.");
	}
	
	
}
