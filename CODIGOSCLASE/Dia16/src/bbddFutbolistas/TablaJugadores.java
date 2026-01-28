package bbddFutbolistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

public class TablaJugadores extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public TablaJugadores() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1108, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		Object[] columnas = {"Código","Nombre","Posicion","Equipo","Valoracion","Goles","Minutos"};
		DefaultTableModel modelo = new DefaultTableModel(columnas,0);
		
		
		for(Jugador j : Utilidades.jugadores) {
			Object[] fila = {j.getCodigo(),j.getNombre(),j.getPosicion(),j.getEquipo(),j.getValoracion(),j.getGoles(),j.getMinutos()};
			modelo.addRow(fila);
			}
		table = new JTable(modelo);
		//contentPane.add(table, BorderLayout.CENTER);
		
		// 1. Creamos el ScrollPane pasando la tabla en el constructor
				JScrollPane scrollPane = new JScrollPane(table);
				// 2. IMPORTANTE: El tamaño y posición se le dan al SCROLLPANE
				scrollPane.setBounds(0, 0, 445, 179);
				contentPane.add(scrollPane,BorderLayout.CENTER);
				
				JPanel panel_1 = new JPanel();
				scrollPane.setRowHeaderView(panel_1);
				panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		this.setModal(true);
		setVisible(true);
	}

}
