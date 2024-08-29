package listas;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro termo(a1):");
		int primeiroTermo = sc.nextInt();

		System.out.println("Digite a razão:");
		int razao = sc.nextInt();

		System.out.println("Digite o valor de N");
		int n = sc.nextInt();

		int an = primeiroTermo + (n - 1) * razao;

		System.out.printf("O valor da PA de %d (%d):", n, an);

		sc.close();
	}

}
