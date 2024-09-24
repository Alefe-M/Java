package lista2;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[10];
		int x = 1000, y = 0, px = 0, py = 0;

		System.out.println("Não digite numeros iguais!");
		for (int i = 0; i < 10; i++) {
			vet[i] = sc.nextInt();
			if (x > vet[i]) {
				x = vet[i];
				px = i;
			}
			if (y < vet[i]) {
				y = vet[i];
				py = i;
			}
		}

		System.out.println("O menor elemento do vetor é: " + x + " e sua posição dentro o vetor é: " + px);
		System.out.println("O maior elemento do vetor é: " + y + " e sua posição dentro o vetor é: " + py);

		sc.close();
	}

}
