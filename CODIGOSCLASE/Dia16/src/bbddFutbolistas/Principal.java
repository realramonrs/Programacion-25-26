package bbddFutbolistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtEquipo;
	private JTextField txtPosicion;
	private JTextField txtGoles;
	private JTextField txtMinutos;
	private JLabel lblValoracion;
	private JTextField txtValoracion;
	private JButton btnLimpiarEntrada;
	private JComboBox<String> comboBox;
	private JLabel lblNombre_1;
	private JTextField txtNombreConsulta;
	private JLabel lblPosicion_1;
	private JTextField txtPosicionConsulta;
	private JLabel lblEquipo_1;
	private JTextField txtEquipoConsulta;
	private JLabel lblValoracion_1;
	private JTextField txtValoracionConsulta;
	private JLabel lblGoles_1;
	private JTextField txtGolesConsulta;
	private JLabel lblMinutos_1;
	private JTextField txtMinutosConsulta;
	private JButton btnAbrirVentana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				//Volcar los futbolistas a un ArrayList
				try {
					Utilidades.llenarArrayList();
					//LLENAR EL COMBOBOX CON LOS CÓDIGOS DE LOS JUGADORES
					for(Jugador j : Utilidades.jugadores) {
						comboBox.addItem(j.getCodigo());
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Arial", Font.ITALIC, 20));
		txtCodigo.setBounds(157, 73, 183, 30);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.ITALIC, 20));
		txtNombre.setColumns(10);
		txtNombre.setBounds(157, 132, 183, 30);
		contentPane.add(txtNombre);
		
		txtEquipo = new JTextField();
		txtEquipo.setFont(new Font("Arial", Font.ITALIC, 20));
		txtEquipo.setColumns(10);
		txtEquipo.setBounds(157, 247, 183, 30);
		contentPane.add(txtEquipo);
		
		txtPosicion = new JTextField();
		txtPosicion.setFont(new Font("Arial", Font.ITALIC, 20));
		txtPosicion.setColumns(10);
		txtPosicion.setBounds(157, 190, 183, 30);
		contentPane.add(txtPosicion);
		
		txtGoles = new JTextField();
		txtGoles.setFont(new Font("Arial", Font.ITALIC, 20));
		txtGoles.setColumns(10);
		txtGoles.setBounds(157, 379, 183, 30);
		contentPane.add(txtGoles);
		
		txtMinutos = new JTextField();
		txtMinutos.setFont(new Font("Arial", Font.ITALIC, 20));
		txtMinutos.setColumns(10);
		txtMinutos.setBounds(157, 442, 183, 30);
		contentPane.add(txtMinutos);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(42, 73, 116, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 20));
		lblNombre.setBounds(42, 137, 116, 21);
		contentPane.add(lblNombre);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setFont(new Font("Arial", Font.BOLD, 20));
		lblEquipo.setBounds(42, 252, 116, 21);
		contentPane.add(lblEquipo);
		
		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setFont(new Font("Arial", Font.BOLD, 20));
		lblPosicion.setBounds(42, 195, 116, 21);
		contentPane.add(lblPosicion);
		
		JLabel lblGoles = new JLabel("Goles");
		lblGoles.setFont(new Font("Arial", Font.BOLD, 20));
		lblGoles.setBounds(42, 384, 116, 21);
		contentPane.add(lblGoles);
		
		JLabel lblMinutos = new JLabel("Minutos");
		lblMinutos.setFont(new Font("Arial", Font.BOLD, 20));
		lblMinutos.setBounds(42, 442, 116, 21);
		contentPane.add(lblMinutos);
		
		JButton btnNewButton = new JButton("GUARDAR JUGADOR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Utilidades.insertarJugador(txtCodigo.getText(),txtNombre.getText(),txtPosicion.getText(),txtEquipo.getText(),
						Double.parseDouble(txtValoracion.getText()),Integer.parseInt(txtGoles.getText()), Integer.parseInt(txtMinutos.getText()));
				
					//btnLimpiarEntrada.doClick();
					limpiarEntradaJugadores();
				
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(46, 482, 294, 50);
		contentPane.add(btnNewButton);
		
		lblValoracion = new JLabel("Valoracion");
		lblValoracion.setFont(new Font("Arial", Font.BOLD, 20));
		lblValoracion.setBounds(42, 318, 116, 21);
		contentPane.add(lblValoracion);
		
		txtValoracion = new JTextField();
		txtValoracion.setFont(new Font("Arial", Font.ITALIC, 20));
		txtValoracion.setColumns(10);
		txtValoracion.setBounds(157, 313, 183, 30);
		contentPane.add(txtValoracion);
		
		btnLimpiarEntrada = new JButton("Limpiar Cajas de Texto");
		btnLimpiarEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarEntradaJugadores();
			}
			
		});
		btnLimpiarEntrada.setFont(new Font("Arial", Font.PLAIN, 20));
		btnLimpiarEntrada.setBounds(46, 553, 294, 50);
		contentPane.add(btnLimpiarEntrada);
		
		comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					String codigo = e.getItem().toString();
					
					for(Jugador j : Utilidades.jugadores) {
						if(j.getCodigo().equals(codigo)) {
							txtNombreConsulta.setText(j.getNombre());
							txtEquipoConsulta.setText(j.getEquipo());
							txtPosicionConsulta.setText(j.getPosicion());
							txtValoracionConsulta.setText(Double.toString(j.getValoracion()));
							txtGolesConsulta.setText(Integer.toString(j.getGoles()));
							txtMinutosConsulta.setText(Integer.toString(j.getMinutos()));
							
						}
					}
				}
			}
		});
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setBounds(531, 73, 172, 21);
		
		contentPane.add(comboBox);
		
		lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNombre_1.setBounds(492, 137, 116, 21);
		contentPane.add(lblNombre_1);
		
		txtNombreConsulta = new JTextField();
		txtNombreConsulta.setFont(new Font("Arial", Font.ITALIC, 20));
		txtNombreConsulta.setColumns(10);
		txtNombreConsulta.setBounds(607, 132, 183, 30);
		contentPane.add(txtNombreConsulta);
		
		lblPosicion_1 = new JLabel("Posicion");
		lblPosicion_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblPosicion_1.setBounds(492, 195, 116, 21);
		contentPane.add(lblPosicion_1);
		
		txtPosicionConsulta = new JTextField();
		txtPosicionConsulta.setFont(new Font("Arial", Font.ITALIC, 20));
		txtPosicionConsulta.setColumns(10);
		txtPosicionConsulta.setBounds(607, 190, 183, 30);
		contentPane.add(txtPosicionConsulta);
		
		lblEquipo_1 = new JLabel("Equipo");
		lblEquipo_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblEquipo_1.setBounds(492, 252, 116, 21);
		contentPane.add(lblEquipo_1);
		
		txtEquipoConsulta = new JTextField();
		txtEquipoConsulta.setFont(new Font("Arial", Font.ITALIC, 20));
		txtEquipoConsulta.setColumns(10);
		txtEquipoConsulta.setBounds(607, 247, 183, 30);
		contentPane.add(txtEquipoConsulta);
		
		lblValoracion_1 = new JLabel("Valoracion");
		lblValoracion_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblValoracion_1.setBounds(492, 318, 116, 21);
		contentPane.add(lblValoracion_1);
		
		txtValoracionConsulta = new JTextField();
		txtValoracionConsulta.setFont(new Font("Arial", Font.ITALIC, 20));
		txtValoracionConsulta.setColumns(10);
		txtValoracionConsulta.setBounds(607, 313, 183, 30);
		contentPane.add(txtValoracionConsulta);
		
		lblGoles_1 = new JLabel("Goles");
		lblGoles_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblGoles_1.setBounds(492, 384, 116, 21);
		contentPane.add(lblGoles_1);
		
		txtGolesConsulta = new JTextField();
		txtGolesConsulta.setFont(new Font("Arial", Font.ITALIC, 20));
		txtGolesConsulta.setColumns(10);
		txtGolesConsulta.setBounds(607, 379, 183, 30);
		contentPane.add(txtGolesConsulta);
		
		lblMinutos_1 = new JLabel("Minutos");
		lblMinutos_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblMinutos_1.setBounds(492, 442, 116, 21);
		contentPane.add(lblMinutos_1);
		
		txtMinutosConsulta = new JTextField();
		txtMinutosConsulta.setFont(new Font("Arial", Font.ITALIC, 20));
		txtMinutosConsulta.setColumns(10);
		txtMinutosConsulta.setBounds(607, 442, 183, 30);
		contentPane.add(txtMinutosConsulta);
		
		btnAbrirVentana = new JButton("Ver todos los jugadores");
		btnAbrirVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TablaJugadores();
			}
		});
		btnAbrirVentana.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAbrirVentana.setBounds(454, 522, 294, 50);
		contentPane.add(btnAbrirVentana);
	}
	
	private void limpiarEntradaJugadores() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtEquipo.setText("");
		txtPosicion.setText("");
		txtValoracion.setText("");
		txtGoles.setText("");
		txtMinutos.setText("");
	}
}
