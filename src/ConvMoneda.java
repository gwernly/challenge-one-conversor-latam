import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ConvMoneda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private double valorP = 0.00d;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvMoneda frame = new ConvMoneda();
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
	public ConvMoneda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnConversorDeUnidades = new JTextPane();
		txtpnConversorDeUnidades.setEditable(false);
		txtpnConversorDeUnidades.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		txtpnConversorDeUnidades.setBackground(new Color(255, 255, 255));
		txtpnConversorDeUnidades.setText("Conversor de Moneda");
		txtpnConversorDeUnidades.setBounds(41, 0, 112, 42);
		contentPane.add(txtpnConversorDeUnidades);
		
		JLabel lblAluraIcon = new JLabel("");
		lblAluraIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Principal ventanaPrinipal = new Principal();
				ventanaPrinipal.setVisible(true);
				dispose();
			}
		});
		lblAluraIcon.setIcon(new ImageIcon("C:\\Users\\Guillermo\\eclipse-workspace\\convertidor-alura\\img\\alura-icon-27x27.jpg"));
		lblAluraIcon.setBounds(10, 0, 32, 42);
		contentPane.add(lblAluraIcon);
		
		
		
		JLabel lblConvMoneda = new JLabel("");
		lblConvMoneda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		lblConvMoneda.setIcon(new ImageIcon("C:\\Users\\Guillermo\\eclipse-workspace\\convertidor-alura\\img\\icons8-bribery-100.png"));
		lblConvMoneda.setBounds(332, 0, 102, 82);
		contentPane.add(lblConvMoneda);
		
		
		
		textField = new JTextField();
		textField.setText("0");
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				int key = arg0.getKeyChar();
			    boolean numeros = key >= 48 && key <= 57 || key == '.' ;
			    if (!numeros)
			    {
			    	arg0.consume();
			    }
			}
		});
		textField.setBounds(73, 124, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
	
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("0");
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
			    boolean numeros = key >= 48 && key <= 57 || key == '.' ;
			    if (!numeros)
			    {
			        e.consume();
			    }

			}
		});
		
		textField_1.setBounds(283, 124, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	

		JTextPane txtpnC = new JTextPane();
		txtpnC.setText("ARS $");
		txtpnC.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		txtpnC.setEditable(false);
		txtpnC.setBackground(Color.WHITE);
		txtpnC.setBounds(31, 121, 32, 23);
		contentPane.add(txtpnC);
		
		JTextPane txtpnOneG = new JTextPane();
		txtpnOneG.setText("ONE G4");
		txtpnOneG.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		txtpnOneG.setEditable(false);
		txtpnOneG.setBackground(Color.WHITE);
		txtpnOneG.setBounds(359, 227, 65, 23);
		contentPane.add(txtpnOneG);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USD BLUE", "USD OFICIAL", "USD BOLSA", "USD CRIPTO", "USD SOLIDARIO"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(172, 123, 101, 22);
		contentPane.add(comboBox);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        
				
				valorP = Double.parseDouble(textField.getText());
				
				double cotizacion;
				String cotizacionString;
				String opcion = comboBox.getSelectedItem().toString();
				
				switch (opcion) {
			     case "USD BLUE":
			    	 cotizacion = (valorP / 395);
			    	 cotizacionString = String.valueOf(cotizacion);
					 textField_1.setText(cotizacionString.substring(0,10));
					 cotizacion = 0;

			         break;
			     case "USD OFICIAL":
			    	 cotizacion = (valorP / 215.5);
			    	 cotizacionString = String.valueOf(cotizacion);
					 textField_1.setText(cotizacionString.substring(0,10));
					 cotizacion = 0;

			         break;

			     case "USD BOLSA":
			    	 cotizacion = (valorP / 396.5);
			    	 cotizacionString = String.valueOf(cotizacion);
					 textField_1.setText(cotizacionString.substring(0,10));
					 cotizacion = 0;

			         break;

			     case "USD CRIPTO":
			    	 cotizacion = (valorP / 391);
			    	 cotizacionString = String.valueOf(cotizacion);
					 textField_1.setText(cotizacionString.substring(0,10));
					 cotizacion = 0;
			         break;
				 
			     case "USD SOLIDARIO":
			    	 cotizacion = (valorP / 355.50);
			    	 cotizacionString = String.valueOf(cotizacion);
					 textField_1.setText(cotizacionString.substring(0,10));
					 cotizacion = 0;

					 break;
			 }				

			}
		});
		btnConvertir.setBackground(new Color(255, 255, 255));
		btnConvertir.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		btnConvertir.setBounds(127, 160, 89, 23);
		contentPane.add(btnConvertir);
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		btnSalir.setBounds(164, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText("0");
				textField_1.setText("0");

			}
		});
		btnLimpiar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(240, 161, 89, 23);
		contentPane.add(btnLimpiar);
		
	
		
		
		
	}
}
