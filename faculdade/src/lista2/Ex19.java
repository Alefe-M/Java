package lista2;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Digite a quantidade de linhas da piramide:");
			n = sc.nextInt();

			if (n % 2 != 0) {

				int cont = (n - 1) / 2;
				
				for (int i = 1; i < cont; i++) {
					for (int j = 1; j < i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				for (int i = cont - 1; i > 1; i--) {
					for (int j = 1; j < i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

			} else {
				System.out.println("Digite apenas numeros impares.");
			}

		} while (n > 0);

		sc.close();
	}

}
