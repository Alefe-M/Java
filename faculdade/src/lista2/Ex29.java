package lista2;

import java.util.Random;
import java.util.HashSet;
import java.util.Scanner;

public class Ex29 {

	public static int sorteio(int limiteInf, int limiteSup, HashSet<Integer> numerosGerados) {
		Random random = new Random();

		int numero;

		do {
			numero = random.nextInt((limiteSup - limiteInf) + 1) + limiteInf;

		} while (numerosGerados.contains(numero));

		return numero;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o limite inferior:");
		int limiteInf = sc.nextInt();

		System.out.println("Digite o limite superior:");
		int limiteSup = sc.nextInt();

		if (limiteSup - limiteInf + 1 < 1000) {
			System.out.println("O intervalo deve ter pelo menos 1000 numeros distintos.");

		}

		int[] vetor = new int[1000];
		HashSet<Integer> numerosGerados = new HashSet<>();

		for (int i = 0; i < 1000; i++) {
			vetor[i] = sorteio(limiteInf, limiteSup, numerosGerados);
			numerosGerados.add(vetor[i]);
		}

		System.out.println("Numeros sorteados:");
		for (int i = 0; i < 1000; i++) {
			System.out.println(vetor[i]);
		}

		sc.close();
	}

}
