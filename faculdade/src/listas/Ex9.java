package listas;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio:");
		double raio = sc.nextDouble();

		// Área
		double area = Math.PI * (raio * raio);

		// Perimetro
		double perimetro = 2 * (Math.PI * raio);

		System.out.println("O valor da area do circulo de raio: " + raio + " é igual a: " + area);
		System.out.println("O valor do perimetro do circulo de raio: " + raio + " é igual a: " + perimetro);

		sc.close();
	}

}
