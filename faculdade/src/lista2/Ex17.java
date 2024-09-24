package lista2;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int resposta, quantidade;
		double valor, valorTotal = 0;

		do {
			System.out.println("Digite o codigo correspondente a opção desejada:");
			System.out.println("(1)Cachorro quente - preço unitario R$1,50");
			System.out.println("(2)Hamburger - preço unitario R$2,00");
			System.out.println("(3)Cheeseburger - preço unitario R$2,50");
			System.out.println("(4)Eggcheeseburger - preço unitario R$3,00");
			System.out.println("(5)Refrigerante - preço unitario R$1,50");
			System.out.println("(6) Sair");
			resposta = sc.nextInt();

			valor = 0;

			if (resposta >= 1 && resposta <= 5) {
				System.out.println("Digite a quantidade");
				quantidade = sc.nextInt();

				switch (resposta) {
				case 1:
					valor = 1.50 * quantidade;

					break;
				case 2:
					valor = 2.00 * quantidade;

					break;
				case 3:
					valor = 2.50 * quantidade;

					break;
				case 4:
					valor = 3.00 * quantidade;

					break;
				case 5:
					valor = 1.50 * quantidade;

					break;

				}
				valorTotal += valor;
				System.out.println("Valor do pedido: R$ " + valor);
			} else if (resposta != 6) {

				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (resposta != 6);
		System.out.println("Valor total da compra R$ " + valorTotal);

		sc.close();
	}

}
