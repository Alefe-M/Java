package lista2;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] vet = new double[15];

		for (int i = 0; i < 15; i++) {
			System.out.println("Digite um numero:");
			int valor = sc.nextInt();

			if (valor > 0) {
				vet[i] = Math.sqrt(valor);

			} else {

				vet[i] = -1;
			}
		}

		System.out.println("Valor do vetor:");
		for (int i = 0; i < 15; i++) {
			System.out.println(vet[i]);
		}

		sc.close();
	}

}
