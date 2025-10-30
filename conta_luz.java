package correcao;

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

public class conta_luz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_instalar;
	private JTextField txt_consumo;
	private JTextField txt_valor;
	private JTextField txt_hora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conta_luz frame = new conta_luz();
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
	public conta_luz() {
		setTitle("conta de luz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 174, 174));
		panel.setBounds(78, 11, 328, 342);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Light");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 31, 86, 44);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Horas");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(20, 125, 129, 25);
		panel.add(lblNewLabel_1);
		
		txt_instalar = new JTextField();
		txt_instalar.setBounds(159, 89, 86, 20);
		panel.add(txt_instalar);
		txt_instalar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Consumo");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 161, 86, 20);
		panel.add(lblNewLabel_2);
		
		txt_consumo = new JTextField();
		txt_consumo.setBounds(159, 162, 86, 20);
		panel.add(txt_consumo);
		txt_consumo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Valor ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(20, 211, 57, 14);
		panel.add(lblNewLabel_3);
		
		txt_valor = new JTextField();
		txt_valor.setBounds(159, 209, 86, 20);
		panel.add(txt_valor);
		txt_valor.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hora, consumo,calc_hora;
				String instalar;
				float valor, calc_valor;
				
				consumo = Integer.parseInt(txt_consumo.getText());
				hora = Integer.parseInt(txt_hora.getText());
				instalar = txt_instalar.getText();
				valor = Float.parseFloat(txt_valor.getText());
				
				if (instalar.equals("R")) {
					if (valor <= 500) {
						calc_hora = consumo * hora;
						calc_valor = calc_hora * valor;
						JOptionPane.showMessageDialog(null,"O valor é: " + calc_valor);
					} else if (valor > 500) {
						calc_hora = consumo * hora;
						calc_valor = calc_hora * valor;
						JOptionPane.showMessageDialog(null,"O valor é: " + calc_valor);
					}
				}
				
				if (instalar.equals("C")) {
					if (valor <= 1000) {
						calc_hora = consumo * hora;
						calc_valor = calc_hora * valor;
						JOptionPane.showMessageDialog(null,"O valor é: " + calc_valor);
					} else if (valor > 1000) {
						calc_hora = consumo * hora;
						calc_valor = calc_hora * valor;
						JOptionPane.showMessageDialog(null,"O valor é: " + calc_valor);
					}
				}
				
				if (instalar.equals("I")) {
					if (valor <= 5000) {
						calc_hora = consumo * hora;
						calc_valor = calc_hora * valor;
						JOptionPane.showMessageDialog(null,"O valor é: " + calc_valor);
					} else if (valor > 5000) {
						calc_hora = consumo * hora;
						calc_valor = calc_hora * valor;
						JOptionPane.showMessageDialog(null,"O valor é: " + calc_valor);
					}
				}
				
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setBounds(28, 285, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_instalar.setText("");
				txt_hora.setText("");
				txt_consumo.setText("");
				txt_valor.setText("");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(170, 285, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Java\\Downloads\\idea.png"));
		lblNewLabel_4.setBounds(170, 31, 40, 44);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo de instalação");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_1.setBounds(10, 86, 139, 25);
		panel.add(lblNewLabel_1_1);
		
		txt_hora = new JTextField();
		txt_hora.setColumns(10);
		txt_hora.setBounds(159, 128, 86, 20);
		panel.add(txt_hora);
	}
}
