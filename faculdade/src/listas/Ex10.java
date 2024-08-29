package listas;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor e X:");
		double x = sc.nextDouble();

		System.out.println("Digite o valor de Y:");
		double y = sc.nextDouble();

		double raiz = Math.sqrt((3 * x) + 30);
		double potencia = Math.pow((y - 32), 4);
		double eq = 2 * (raiz / 3) + potencia;

		System.out.println("Do valor da equação é:" + eq);
		sc.close();
	}

}
