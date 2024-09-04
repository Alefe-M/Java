package lista2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i, valor = 1;
		System.out.println("Digite o valor de X:");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y:");
		int y = sc.nextInt();

		for (i = 1; i <= y; i++) {
			valor = valor * x;
		}
		System.out.println(valor);

		sc.close();
	}

}
