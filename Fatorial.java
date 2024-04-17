package For;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, fatorial;

		System.out.print("Informe um número: ");
		n = ler.nextInt();
		
		fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}

		System.out.println(n + "! = " + fatorial);
		ler.close();

	}

}
