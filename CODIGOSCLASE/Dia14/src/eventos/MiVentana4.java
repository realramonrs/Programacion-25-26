package eventos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MiVentana4 extends JFrame {

	private JButton btnUno,btnDos,btnTres,btnBorrar,btnCambiarColor;
	private JTextField txtResultado;
	
	public MiVentana4() {
		
		//Editamos propiedades básicas de la ventana
		setTitle("Mini Calculadora");
		//Situar la ventana en el centro de la pantalla del usuario
		 Toolkit tl = Toolkit.getDefaultToolkit();
	     Dimension tam = tl.getScreenSize();
	     int alturaPantalla = tam.height;
	     int anchoPantalla = tam.width;
	     setSize(anchoPantalla/2 , alturaPantalla/2);
	     setLocation(anchoPantalla/4,alturaPantalla/4);		
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 inicializarComponentes();
		 
		 //Distribuir los componentes en el JFrame
		 setLayout(new FlowLayout());
		 add(btnUno);
		 add(btnDos);
		 add(btnTres);
		 add(txtResultado);
		 add(btnBorrar);
		 add(btnCambiarColor);
		 
		 //Gestionar Eventos
		 btnUno.addActionListener(new EscuchadorClick());
		 btnDos.addActionListener(new EscuchadorClick());
		 btnTres.addActionListener(new EscuchadorClick());
		 btnBorrar.addActionListener(new EscuchadorBorrado());
		 txtResultado.addMouseListener(new EscuchadorMouse());
		 
		 btnCambiarColor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtResultado.setForeground(Color.BLUE);
			}
			 
		 });	 
		 
		 
		 this.setVisible(true);
		 
	}

	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		btnDos = new JButton("2");
		btnUno = new JButton("1");
		btnTres = new JButton("3");
		btnBorrar = new JButton("CE");
		btnCambiarColor = new JButton("Cambiar color");
		txtResultado = new JTextField(10);
				
	}
	
	//Clase interna que gestiona el Evento Click de los botones
	
	private class EscuchadorClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Obtener el botón que fue clicado -> que generó el eventoç
			JButton btnPulsado = (JButton)e.getSource();
			
			if(btnPulsado.getText().equals("CE")) {
				txtResultado.setText("");
			}
			else {
			
			txtResultado.setText(txtResultado.getText()+ btnPulsado.getText());
			}
		}
	
	}
	
	private class EscuchadorBorrado implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txtResultado.setText("");
			
		}
		
	}
	
	private class EscuchadorMouse extends MouseAdapter{

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
			JTextField caja = (JTextField) e.getSource();
			caja.setBackground(Color.red);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			JTextField caja = (JTextField) e.getSource();
			caja.setBackground(Color.white);
		}
		
	}
	
	
	
}
