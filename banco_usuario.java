package teste;

import javax.swing.JOptionPane;

public class banco_usuario {

	public static void main(String[] args) {
		String nome,perfil,texto_valor;
		float valor,calculo;
		
		nome = JOptionPane.showInputDialog(null,"Informe o seu nome: ");
		perfil = JOptionPane.showInputDialog(null,"Informe o seu perfil: ");
		texto_valor = JOptionPane.showInputDialog(null, "Informe o valor do salario");
		valor = Float.parseFloat(texto_valor);
		
		if (perfil.equals("Comum")) {
			calculo = 3*valor;
		JOptionPane.showMessageDialog(null,"O usuario " + nome + " com o perfil " + perfil + " com o salario 3 X vai receber " + calculo);
		} else if (perfil.equals("Vip")) {
			calculo = 6*valor;
		JOptionPane.showMessageDialog(null,"O usuario " + nome + " com o perfil " + perfil + " com o salario 6 X vai receber " + calculo);
		}
		

	}

}
