package lista2;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
		boolean distinto;

		System.out.println("Digite 10 números inteiros distintos:");

		for (int i = 0; i < 10; i++) {
			do {
				distinto = true;
				System.out.print("Digite o número para a posição " + (i + 1) + ": ");
				vetor[i] = sc.nextInt();

				for (int j = 0; j < i; j++) {
					if (vetor[i] == vetor[j]) {
						distinto = false;
						System.out.println("Número repetido! Por favor, insira um número diferente.");
						break;
					}
				}

			} while (!distinto);
		}

		System.out.println("Vetor com números distintos:");
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}

		sc.close();
	}

}
