package testes;

import java.util.Scanner;

public class reajuste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float preco, reajuste;
		System.out.println("Informe o preço do produto: ");
		preco = scanner.nextFloat();
		reajuste = preco + ((preco*12)/100);
		System.out.printf("O reajuste salarial é: %s", reajuste);
	}

}