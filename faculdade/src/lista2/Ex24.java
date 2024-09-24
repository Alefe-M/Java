package lista2;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int codigo;

		System.out.println("Digite um vetor de 10 posições: ");

		double[] vet = new double[10];

		for (int i = 0; i < 10; i++) {
			vet[i] = sc.nextDouble();
		}

		do {

			System.out.println("0=terminar / 1=mostrar vetor ordem normal / 2=vetor na ordem inversa");
			System.out.println("Digite o codigo ");
			codigo = sc.nextInt();

			if (codigo == 1) {
				for (int i = 0; i < 10; i++) {
					System.out.print(vet[i] + " ");

				}
				System.out.println();

			} else if (codigo == 2) {
				for (int i = 9; i >= 0; i--) {
					System.out.print(vet[i] + " ");
				}
				System.out.println();

			} else if (codigo != 0) {
				System.out.println("Código inválido, tente novamente.");
			}

		} while (codigo != 0);

		sc.close();
	}

}
