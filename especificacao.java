package testes;

import java.util.Scanner;

public class especificacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Informe a sua idade: ");
		n = scanner.nextInt();
		
		if (n <= 12) {
			System.out.printf("A sua idade e: %s", n);
			System.out.println("\nCategoria: Infantil");
		} else if (n >= 13 && n <= 18) {
			System.out.printf("A sua idade e: %s", n);
			System.out.println("\nCategoria: Juvenil");
		} else if (n >= 19 && n <= 60) {
			System.out.printf("A sua idade e: %s", n);
			System.out.println("\nCategoria: Adulto");
		} else if (n > 60) {
			System.out.printf("A sua idade e: %s", n);
			System.out.println("\nCategoria: Idoso");
		}

	}

}
