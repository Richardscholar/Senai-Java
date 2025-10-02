package testes;

import java.util.Scanner;

public class venda_produto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float total, pagamento, troco, preco;
		int quantidade;
		System.out.println("Informe o preco do produto: ");
		preco = scanner.nextFloat();
		System.out.println("Informe a quantidade do produto: ");
		quantidade = scanner.nextInt();
		total = quantidade * preco;
		System.out.println("Informe quanto vai pagar: ");
		pagamento = scanner.nextFloat();
		troco = pagamento - total;
		System.out.printf("O total é: %s", total);
		System.out.printf("O troco é: %s", troco);
		
	}

}