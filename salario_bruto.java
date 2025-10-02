package testes;

import java.util.Scanner;

public class salario_bruto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float sl,d,sb;
		System.out.println("Informe o seu salario: ");
		sb = scanner.nextFloat();
		d = (sb*6)/100;
		sl = sb - d;
		System.out.printf("O novo salario com desconto é: %s", sl);
	}

}