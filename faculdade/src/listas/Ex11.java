package listas;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ponto A X1:");
		int x1 = sc.nextInt();
		System.out.println("Digite o ponto A Y1:");
		int y1 = sc.nextInt();

		System.out.println("Digite o ponto B X2:");
		int x2 = sc.nextInt();
		System.out.println("Digite o ponto B Y2:");
		int y2 = sc.nextInt();

		double valor = Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2);

		double distanciaEuclidiana = Math.sqrt(valor);

		System.out.println("O valor da Distancia Euclidiana é:" + distanciaEuclidiana);

		sc.close();
	}

}
