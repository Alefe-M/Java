package lista2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int resposta;

		System.out.println("Digite uma senha:");
		int senha = sc.nextInt();

		do {
			System.out.println("Digite a senha para entrar:");
			resposta = sc.nextInt();

			if (resposta != senha) {
				System.out.println("Senha incorreta. Tente novamente:");
				resposta = sc.nextInt();
			}

		} while (resposta != senha);

		System.out.println("Bem vindo ao Sistema.");

		sc.close();
	}

}
