package listas;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String x;
		String y;
		int z;
		int a;

		System.out.println("Digite o nome e sobrenome do Marido:");
		x = sc.nextLine();
		System.out.println("Digite o nome e sobrenome da esposa:");
		y = sc.nextLine();
		System.out.println("Digite o ano do casamento:");
		z = sc.nextInt();

		a = 2018 - z;

		System.out.printf("%s é casado com %s há %d anos.", x, y, a);
		sc.close();
	}

}
