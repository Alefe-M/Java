package lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dividendo:");
		int dividendo = sc.nextInt();

		System.out.println("Digite o divisor:");
		int divisor = sc.nextInt();

		int numero = dividendo % divisor;
		if (numero == 0) {
			System.out.println("O numero " + dividendo + " é divisivel por " + divisor);
		} else {
			System.out.println("O numero " + dividendo + " não é divisivel por " + divisor);
		}

		sc.close();
	}

}
