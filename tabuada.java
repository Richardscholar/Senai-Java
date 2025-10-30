package correcao;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		int n,i;
		Scanner entrada = new Scanner (System.in);
		System.out.println("informe um número");
		n = entrada.nextInt();
		for (i=1; i<=10; i++) {
			System.out.println(n + "X" + i + "=" + (n*i));
		}

	}

}
