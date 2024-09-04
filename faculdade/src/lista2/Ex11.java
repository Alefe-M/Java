package lista2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do divisor:");
		int divisor = sc.nextInt();
		System.out.println("Digite o inicio do intervalo:");
		int inicioIntervalo = sc.nextInt();
		System.out.println("Digite o fim do intervalo:");
		int fimIntervalo = sc.nextInt();

		System.out.printf("Numeros divisiveis por %d no intervalo de %d a %d:", divisor, inicioIntervalo, fimIntervalo);
		for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
			if (i % divisor == 0) {
				System.out.print(" " + i);
			}

		}

		sc.close();
	}

}
