package lista2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int[] divis = new int[5];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite numeros: ");
			num[i] = sc.nextInt();

		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite numeros para os divisores: ");
			divis[i] = sc.nextInt();

		}

		for (int i = 0; i < 10; i++) {

			int divisivel = 0;

			System.out.println("Número " + num[i] + ":");

			for (int j = 0; j < 5; j++) {
				if (num[i] % divis[j] == 0) {
					System.out.println("Divisível por " + divis[j] + " na posição " + j);
					divisivel = 1;

				}
			}
			if (divisivel != 1) {
				System.out.println("Nenhum divisor encontrado.");
			}

		}

		sc.close();
	}

}
