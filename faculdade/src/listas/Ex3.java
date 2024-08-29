package listas;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anosVida;

		System.out.println("Digite o nome do indivíduo:");
		String nome = sc.nextLine();

		System.out.println("Digite quantos anos ele tem:");
		int idade = sc.nextInt();

		anosVida = idade * 365;

		System.out.println("O " + nome + " tem " + anosVida + " dias de vida.");
		
		sc.close();

	}

}
