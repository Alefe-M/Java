package lista2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do eleitor:");
		int idadeEleitor = sc.nextInt();

		if (idadeEleitor >= 16 && idadeEleitor <= 17) {
			System.out.println("O eleitor é facultativo.");

		} else if (idadeEleitor >= 18 && idadeEleitor <= 65) {
			System.out.println("O eleitor é obrigatório.");

		} else {
			System.out.println("O eleitor é dispensado.");
		}
		sc.close();
	}

}
