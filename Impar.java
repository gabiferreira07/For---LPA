package For;

import java.util.Scanner;

public class Impar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int inicio, fim;

        System.out.println("Informe um número:");
        inicio = ler.nextInt();

        System.out.println("Informe um número:");
        fim = ler.nextInt();

        for (int i = inicio; i <= fim; i++) {
        	if (i % 2 != 0)
            System.out.println("Números ímpares de " + inicio + " a " + fim + ": " + i);
        ler.close();
    	}

	}
}