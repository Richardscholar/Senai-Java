package teste;

import javax.swing.JOptionPane;

public class Bem_vindo {

	public static void main(String[] args) {
		String nome;
		
		nome = JOptionPane.showInputDialog(null,"Informe o seu nome: ");
		JOptionPane.showMessageDialog(null,"Bem vindo, " + nome);

	}

}
