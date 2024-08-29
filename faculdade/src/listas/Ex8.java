package listas;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro A:");
		int numeroA = sc.nextInt();

		System.out.println("Digite outro numero inteiro B:");
		int numeroB = sc.nextInt();

		int x = numeroA;
		numeroA = numeroB;
		numeroB = x;

		System.out.println("O numero A e o B trocaram de valor. A: " + numeroA + " B: " + numeroB);

		sc.close();
	}

}
