package testes;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		System.out.println("Informe a idade");
		idade = scanner.nextInt();
		
		//Estrutura de Decisão 
		if (idade > 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}

	}

}
