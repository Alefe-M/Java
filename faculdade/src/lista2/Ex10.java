package lista2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro para saber o seu fatorial:");
		int numero = sc.nextInt();
		int result = 1;
		if (numero != 0) {
			for (int i = 1; i <= numero; i++) {
				
				result = result *i;
			}
		} else {
			System.out.println("Valor invalido.");
		}
		System.out.println("O fatorial de " + numero + " é " + result);

		sc.close();
	}

}
