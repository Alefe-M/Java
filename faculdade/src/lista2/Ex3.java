package lista2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double valorFinal;

		System.out.println("Digite o valor da compra:");
		double valorCompra = sc.nextDouble();

		if (valorCompra < 10) {
			valorFinal = valorCompra * 1.70;

		} else if (valorCompra >= 10 && valorCompra < 30) {
			valorFinal = valorCompra * 1.50;
		} else if (valorCompra >= 30 && valorCompra < 50) {
			valorFinal = valorCompra * 1.40;
		} else {
			valorFinal = valorCompra * 1.30;
		}

		System.out.println("O valor da venda é de R$ " + valorFinal);

		sc.close();
	}

}
