package testes;

import java.util.Scanner;

public class triplo_numero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,triplo;
		System.out.println("Informe um valor: ");
		n = scanner.nextInt();
		triplo = n*3;
		System.out.printf("O triplo desse numero é: %s", triplo);
	}

}