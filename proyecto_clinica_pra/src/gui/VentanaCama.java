package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaCama extends JFrame {

	private JPanel contentPane;
	private JButton btnIngresar;
	private JButton btnListar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnGrabar;
	private JTextField txtNumeroCama;
	private JTextField txtPrecioDia;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTable tblTable;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCama frame = new VentanaCama();
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
	public VentanaCama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(497, 70, 89, 23);
		contentPane.add(btnIngresar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(497, 134, 89, 23);
		contentPane.add(btnListar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(497, 208, 89, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(497, 274, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(497, 325, 89, 23);
		contentPane.add(btnEliminar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(497, 11, 89, 23);
		contentPane.add(btnGrabar);
		
		txtNumeroCama = new JTextField();
		txtNumeroCama.setBounds(10, 14, 86, 20);
		contentPane.add(txtNumeroCama);
		txtNumeroCama.setColumns(10);
		
		txtPrecioDia = new JTextField();
		txtPrecioDia.setBounds(131, 12, 86, 20);
		contentPane.add(txtPrecioDia);
		txtPrecioDia.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Libre", "Ocupado"}));
		comboBox.setBounds(239, 12, 86, 20);
		contentPane.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 91, 472, 297);
		contentPane.add(scrollPane);
		
		tblTable = new JTable();
		scrollPane.setViewportView(tblTable);
		modelo =new DefaultTableModel();
		modelo.addColumn("Numero");
		modelo.addColumn("Precio");
		modelo.addColumn("tipo");
		modelo.addColumn(modelo);
	}
}
