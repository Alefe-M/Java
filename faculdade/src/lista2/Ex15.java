package lista2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double saldo = 0, saque = 0, deposito = 0;
		String opcao;

		do {
			System.out.println("Digite a letra correspondente a opção desejada:");
			System.out.println("(a) consulta saldo");
			System.out.println("(b) saque");
			System.out.println("(c) depósito");
			System.out.println("(d) sair");
			opcao = sc.nextLine();

			switch (opcao) {
			case "a":
				System.out.println("O saldo é igual a " + saldo);
				break;
			case "b":
				System.out.println("Digite o valor do saque:");
				saque = sc.nextDouble();
				if (saldo < saque) {
					System.out.println("saldo insuficiente. Seu saldo é de " + saldo);
				} else {

					saldo = saldo - saque;
				}
				sc.nextLine();

				break;
			case "c":
				System.out.println("Digite o valor do deposito:");
				deposito = sc.nextDouble();
				saldo = saldo + deposito;
				sc.nextLine();
				break;
			case "d":
				System.out.println("Voce escolheu sair.");
				break;
			default:
				System.out.println("Opção invalida. Digite novamente.");
				break;

			}

		} while (!opcao.equals("d"));

		sc.close();

	}
}
