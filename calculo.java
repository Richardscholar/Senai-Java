package testes;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1,n2,resultado;
		System.out.println("Informe um numero: ");
		n1 = scanner.nextInt();
		System.out.println("Informe um outro numero: ");
		n2 = scanner.nextInt();
		resultado = n1 + n2;
		System.out.printf("O resultado da soma é: %s", resultado);
	}

}
