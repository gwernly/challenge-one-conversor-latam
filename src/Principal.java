import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

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
		txtpnConversorDeUnidades.setText("Conversor de Unidades");
		txtpnConversorDeUnidades.setBounds(41, 0, 112, 42);
		contentPane.add(txtpnConversorDeUnidades);
		
		JLabel lblAluraIcon = new JLabel("");
		lblAluraIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblAluraIcon.setIcon(new ImageIcon("C:\\Users\\Guillermo\\eclipse-workspace\\convertidor-alura\\img\\alura-icon-27x27.jpg"));
		lblAluraIcon.setBounds(10, 0, 32, 42);
		contentPane.add(lblAluraIcon);
		
		final ConvMoneda ConvMoneda = new ConvMoneda();
		JLabel lblConvMoneda = new JLabel("");
		lblConvMoneda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ConvMoneda.setVisible(true);
				dispose();
			}
		});
		lblConvMoneda.setIcon(new ImageIcon("C:\\Users\\Guillermo\\eclipse-workspace\\convertidor-alura\\img\\icons8-bribery-100.png"));
		lblConvMoneda.setBounds(92, 90, 112, 82);
		contentPane.add(lblConvMoneda);
		
		
		final ConvTemperatura ConvTemperatura = new ConvTemperatura();
		JLabel lblConvTemp = new JLabel("");
		lblConvTemp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConvTemperatura.setVisible(true);
				dispose();
			}
		});
		lblConvTemp.setIcon(new ImageIcon("C:\\Users\\Guillermo\\eclipse-workspace\\convertidor-alura\\img\\icons8-fire-100.png"));
		lblConvTemp.setBounds(241, 90, 100, 82);
		contentPane.add(lblConvTemp);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		btnSalir.setBounds(171, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JTextPane txtpnOneG = new JTextPane();
		txtpnOneG.setText("ONE G4");
		txtpnOneG.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		txtpnOneG.setEditable(false);
		txtpnOneG.setBackground(Color.WHITE);
		txtpnOneG.setBounds(359, 227, 65, 23);
		contentPane.add(txtpnOneG);
	}
}
