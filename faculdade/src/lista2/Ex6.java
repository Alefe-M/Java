package lista2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo do produto:");
		int codigoProd = sc.nextInt();

		if (codigoProd == 1) {

			System.out.println("Alimento não-perecível");
		} else if (codigoProd == 2 || codigoProd == 3 || codigoProd == 4) {
			System.out.println("Alimento perecível");
		} else if (codigoProd == 5 || codigoProd == 6) {
			System.out.println("Vestuario");
		} else if (codigoProd == 7) {
			System.out.println("Higiene pessoal");
		} else if (codigoProd >= 8 && codigoProd <= 15) {
			System.out.println("Limpeza e utensílios domésticos");
		} else {
			System.out.println("Codigo invalido");
		}

		sc.close();
	}

}
