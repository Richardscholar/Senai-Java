package testes;

import java.util.Scanner;
import java.lang.Math;

public class potencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n, calculo;
		System.out.println("Informe um numero: ");
		n = scanner.nextInt();
		calculo = Math.pow(n,2);
		System.out.printf("O resultado é: %s", calculo);
	}

}