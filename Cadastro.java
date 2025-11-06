package aula_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;
	private JTextField txt_data;
	private JTextField txt_cpf;
	private JTextField txt_senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBounds(83, 11, 384, 416);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(101, 39, 163, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(10, 112, 163, 32);
		panel.add(lblNome);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(139, 120, 183, 20);
		panel.add(txt_nome);
		txt_nome.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeNascimento.setForeground(Color.WHITE);
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataDeNascimento.setBounds(10, 176, 163, 32);
		panel.add(lblDataDeNascimento);
		
		txt_data = new JTextField();
		txt_data.setColumns(10);
		txt_data.setBounds(171, 184, 183, 20);
		panel.add(txt_data);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(10, 239, 163, 32);
		panel.add(lblCpf);
		
		txt_cpf = new JTextField();
		txt_cpf.setColumns(10);
		txt_cpf.setBounds(122, 247, 183, 20);
		panel.add(txt_cpf);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(10, 293, 163, 32);
		panel.add(lblSenha);
		
		txt_senha = new JTextField();
		txt_senha.setColumns(10);
		txt_senha.setBounds(139, 301, 183, 20);
		panel.add(txt_senha);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome,data_nascimento,cpf,senha;
				
				nome = txt_nome.getText();
				data_nascimento = txt_cpf.getText();
				cpf = txt_cpf.getText();
				senha = txt_senha.getText();
				
				if (nome.equals(nome) && data_nascimento.equals(data_nascimento) && cpf.equals(cpf) && senha.equals(senha)) {
					Menu_Principal menu_principal = new Menu_Principal();
					menu_principal.setVisible(true);
					dispose();
				}
				;
				
				
			}
		});
		btnNewButton.setBounds(23, 362, 117, 23);
		panel.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(171, 362, 89, 23);
		panel.add(btnVoltar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_nome.setText("");
				txt_data.setText("");
				txt_cpf.setText("");
				txt_senha.setText("");
			}
		});
		btnLimpar.setBounds(285, 362, 89, 23);
		panel.add(btnLimpar);
	}

}
