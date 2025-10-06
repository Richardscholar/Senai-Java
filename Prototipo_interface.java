package teste;

import javax.swing.JOptionPane;

public class Prototipo_interface {

	public static void main(String[] args) {
		float salario,reajuste;
		String cargo, texto_salario;
		
		cargo = JOptionPane.showInputDialog(null,"Informe o seu cargo");
		texto_salario = JOptionPane.showInputDialog(null,"Informe o seu salario");
		salario = Float.parseFloat(texto_salario);
		
		if (cargo.equals("Caixa")) {
			reajuste =(salario*10)/100;
		JOptionPane.showMessageDialog(null,"O valor do reajuste sera: " + reajuste);
		} else if (cargo.equals("Vendedor")) {
			reajuste =(salario*13)/100;
		JOptionPane.showMessageDialog(null,"O valor do reajuste sera: " + reajuste);
		} else if (cargo.equals("Estoquista")) {
			reajuste =(salario*15)/100;
		JOptionPane.showMessageDialog(null,"O valor do reajuste sera: " + reajuste);
		} else if (cargo.equals("Gerente")) {
			reajuste =(salario*20)/100;
		JOptionPane.showMessageDialog(null,"O valor do reajuste sera: " + reajuste);
		}
	}

}
