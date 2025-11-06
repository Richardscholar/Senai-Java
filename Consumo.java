package aula_01;

import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Consumo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_instalar;
	private JTextField txt_consumo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consumo frame = new Consumo();
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
	public Consumo() {
		setTitle("conta de luz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(187, 94, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 174, 174));
		panel.setBounds(29, 11, 376, 424);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Light");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 26, 209, 44);
		panel.add(lblNewLabel);
		
		txt_instalar = new JTextField();
		txt_instalar.setBounds(78, 179, 166, 20);
		panel.add(txt_instalar);
		txt_instalar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Informe a quantidade consumo:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(35, 233, 282, 20);
		panel.add(lblNewLabel_2);
		
		txt_consumo = new JTextField();
		txt_consumo.setBounds(82, 278, 166, 20);
		panel.add(txt_consumo);
		txt_consumo.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double consumo, total;
				String instalar;
				
				consumo =Double.parseDouble(txt_consumo.getText());
				instalar = txt_instalar.getText();
				
				
				
				if (instalar.equals("R")) {
					if (consumo <= 500) {
						total=consumo*0.40;
						JOptionPane.showMessageDialog(null,"O valor é: " + total);
					} else if (consumo > 500) {
						total=consumo*0.65;
						JOptionPane.showMessageDialog(null,"O valor é: " + total);
					}
				}
				
				if (instalar.equals("C")) {
					if (consumo<= 1000) {
					total=consumo*0.55;
						JOptionPane.showMessageDialog(null,"O valor é: " + total);
					} else if (consumo > 1000) {
						total=consumo*0.60;
						JOptionPane.showMessageDialog(null,"O valor é: " + total);
					}
				}
				
				if (instalar.equals("I")) {
					if (consumo<= 5000) {
						total=consumo*0.55;
						JOptionPane.showMessageDialog(null,"O valor é: " + total);
					} else if (consumo > 5000) {
						total=consumo*0.60;
						JOptionPane.showMessageDialog(null,"O valor é: " +total);
					}
				}
				
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(223, 112, 0));
		btnNewButton.setBounds(52, 344, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt_instalar.setText("");
			    txt_consumo.setText("");
				
			}
		});
		btnNewButton_1.setBackground(new Color(223, 112, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(212, 344, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Informe o tipo de instalação:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_1.setBounds(22, 125, 297, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Java\\Downloads\\idea1.png"));
		lblNewLabel_5.setBounds(170, 21, 24, 49);
		panel.add(lblNewLabel_5);
	}
}
