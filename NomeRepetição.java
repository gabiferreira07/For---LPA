package For;

import java.util.Scanner;

public class NomeRepetição {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String n;
		
		for (int i=0; i <= 6; i++) {
			System.out.print("Informe seu nome: ");
			n = ler.next();
			System.out.println("O seu nome é: " + n);
		}
		ler.close();

	}

}
