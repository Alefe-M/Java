package lista2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];
		int[] vet25 = new int[10];
		int cont = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			vet[i] = sc.nextInt();

			if (vet[i] > 25) {
				vet25[i] = vet[i];
				cont++;
			}

		}

		System.out.println("Valores maiores que 25: ");

		if (cont == 0) {
			System.out.println("No vetor não há nenhum numero maior que 25.");
		} else {

			for (int i = 0; i < 10; i++) {

				if (vet25[i] != 0) {
					System.out.println("Posição " + i + " tem o valor: " + vet25[i]);

				}
			}

			sc.close();
		}
	}
}
