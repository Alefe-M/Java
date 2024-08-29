package listas;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double tempF;

		System.out.println("Digite uma temperatura em graus celcius:");
		double tempC = sc.nextDouble();

		tempF = tempC * (9.0 / 5.0) + 32.0;

		System.out.println("A temperatura " + tempC + " Celcius é igual a " + tempF + " Fahrenheit");

		sc.close();
	}

}
