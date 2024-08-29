package listas;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valorFinal, desc;

		System.out.println("Digite o valor original do produto");
		double valorIni = sc.nextDouble();

		System.out.println("Digite a porcentagem do desconto");
		double porcentDesc = sc.nextDouble();

		desc = porcentDesc / 100;

		valorFinal = valorIni - (valorIni * desc);

		System.out.println("Valor do produto com " + porcentDesc + "% de desconto é de R$" + valorFinal);

		sc.close();
	}

}
