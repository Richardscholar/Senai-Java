package testes;

import java.util.Scanner;

public class diferenciacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1,n2;
		System.out.println("Informe um valor: ");
		n1 = scanner.nextInt();
		System.out.println("Informe um valor: ");
		n2 = scanner.nextInt();
		
		if (n1 == n2) {
			System.out.printf("Os valores %s e %s são iguais", n1, n2);
		} else {
			System.out.printf("Os valores %s e %s são diferentes", n1, n2);
		}
		

	}

}
