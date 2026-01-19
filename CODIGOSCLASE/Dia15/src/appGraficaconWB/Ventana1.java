package appGraficaconWB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private static String ruta;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtTitulo;
	private ArrayList<Serie> serie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	
	private void actualizarArrayList() {
		//Limpiar la lista
		serie.clear();
		//Código que vuelca los registros del fichero al ArrayList
				try(BufferedReader bfLector = new BufferedReader(new FileReader(ruta))){
					
					String registro ="";
					
					while(registro!=null) {{
						registro = bfLector.readLine();
						
						if(registro!=null) {
						String[] trozos = registro.split(",");
						serie.add(new Serie(trozos[0],trozos[1],trozos[2]));
						}
									
					}
						
					}
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
	}
	public Ventana1() {
		
		ruta = System.getProperty("user.dir");
		ruta += "\\series.txt";
		//Instancio el ArrayList
		serie = new ArrayList<Serie>();
		
		actualizarArrayList();	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Intro código");
		lblCodigo.setFont(new Font("Arial", Font.BOLD, 14));
		lblCodigo.setBounds(31, 35, 110, 21);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Arial", Font.ITALIC, 12));
		txtCodigo.setBounds(178, 36, 96, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblIntroTitulo = new JLabel("Intro Titulo");
		lblIntroTitulo.setFont(new Font("Arial", Font.BOLD, 14));
		lblIntroTitulo.setBounds(31, 88, 110, 21);
		contentPane.add(lblIntroTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Arial", Font.ITALIC, 12));
		txtTitulo.setColumns(10);
		txtTitulo.setBounds(178, 90, 96, 19);
		contentPane.add(txtTitulo);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Arial", Font.BOLD, 14));
		lblPlataforma.setBounds(31, 144, 110, 21);
		contentPane.add(lblPlataforma);
		
		JComboBox cmbPlataforma = new JComboBox();
		cmbPlataforma.setBounds(178, 145, 118, 21);
		cmbPlataforma.addItem("NETFLIX");
		cmbPlataforma.addItem("HBO");
		cmbPlataforma.addItem("AMAZON PRIME");
		contentPane.add(cmbPlataforma);
		
		JButton btnAddSerie = new JButton("Añadir Serie");
		btnAddSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Recoger datos del usuario y volcarlos a un fichero de texto
				String codigo = txtCodigo.getText();
				String titulo = txtTitulo.getText();
				String plataforma = cmbPlataforma.getSelectedItem().toString();
				
				try(BufferedWriter bf = new BufferedWriter(new FileWriter(ruta,true))){
					bf.write(codigo + "," + titulo + "," + plataforma);
					bf.newLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnAddSerie.setFont(new Font("Arial", Font.BOLD, 14));
		btnAddSerie.setBounds(67, 207, 160, 37);
		contentPane.add(btnAddSerie);
		
		JTextArea txtAreaSeriesGuardadas = new JTextArea();
		txtAreaSeriesGuardadas.setBounds(447, 70, 160, 190);
		contentPane.add(txtAreaSeriesGuardadas);
		
		JLabel lblSeriesGuardadas = new JLabel("Series en fichero:");
		lblSeriesGuardadas.setFont(new Font("Arial", Font.BOLD, 14));
		lblSeriesGuardadas.setBounds(447, 35, 160, 21);
		contentPane.add(lblSeriesGuardadas);
		
		JButton btnVolcarSeries = new JButton("Ver Series Guardadas");
		btnVolcarSeries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAreaSeriesGuardadas.setText("");
				actualizarArrayList();
				//Recorrer la lista y volcar las series al TextArea
				for(Serie s : serie) {
					txtAreaSeriesGuardadas.setText(txtAreaSeriesGuardadas.getText()+s.getTitulo()+" " + s.getPlataforma() +"\n");
				}
			}
		});
		btnVolcarSeries.setFont(new Font("Arial", Font.BOLD, 14));
		btnVolcarSeries.setBounds(447, 302, 185, 70);
		contentPane.add(btnVolcarSeries);
		
		ButtonGroup grup = new ButtonGroup();
		
		JRadioButton rdbNetflix = new JRadioButton("NetFlix");
		rdbNetflix.setBounds(635, 90, 103, 21);
		contentPane.add(rdbNetflix);
		
		JRadioButton rdbHBO = new JRadioButton("HBO");
		rdbHBO.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//Comprobar que ha sido seleccionado
				if(rdbHBO.isSelected()) {
					txtAreaSeriesGuardadas.setText("");
					//Buscar Series de HBO
					for(Serie s : serie) {
						if(s.getPlataforma().equals("HBO")) {
							txtAreaSeriesGuardadas.setText(txtAreaSeriesGuardadas.getText()+ s.getTitulo()+" " + s.getPlataforma()+"\n");
						}
					}
				}
			}
		});
		rdbHBO.setBounds(635, 126, 103, 21);
		contentPane.add(rdbHBO);
		
		JRadioButton rdbAmazon = new JRadioButton("AMAZON");
		rdbAmazon.setBounds(635, 159, 103, 21);
		contentPane.add(rdbAmazon);
		
		grup.add(rdbNetflix);
		grup.add(rdbHBO);
		grup.add(rdbAmazon);
		
		
	}
}
