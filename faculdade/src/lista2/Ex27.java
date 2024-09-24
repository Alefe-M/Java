package lista2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex27 {

	public static int sorteia(int limitInf, int limitSup) {
		Random random = new Random();
		return random.nextInt((limitSup - limitInf) + 1) + limitInf;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int limitInf, limitSup;

		do {
			System.out.print("Digite o limite inferior: ");
			limitInf = sc.nextInt();
			System.out.print("Digite o limite superior: ");
			limitSup = sc.nextInt();

			if (limitInf >= limitSup) {
				System.out.println("O limite inferior deve ser menor que o limite superior! Tente novamente.");
			}
		} while (limitInf >= limitSup);

		int[] A = new int[10];
		int[] B = new int[10];

		for (int i = 0; i < 10; i++) {
			A[i] = sorteia(limitInf, limitSup);
			B[i] = sorteia(limitInf, limitSup);
		}

		System.out.println("Vetor A:");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();

		System.out.println("Vetor B:");
		for (int i = 0; i < 10; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();

		int[] Soma = new int[10];
		for (int i = 0; i < 10; i++) {
			Soma[i] = A[i] + B[i];
		}

		System.out.println("Vetor Soma (A + B):");
		for (int i = 0; i < 10; i++) {
			System.out.print(Soma[i] + " ");
		}
		System.out.println();

		ArrayList<Integer> Intersecao = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (A[i] == B[j] && !Intersecao.contains(A[i])) {
					Intersecao.add(A[i]);
				}
			}
		}

		System.out.println("Vetor Interseção (A ∩ B):");
		for (Integer value : Intersecao) {
			System.out.print(value + " ");
		}
		System.out.println();

		ArrayList<Integer> Diferenca = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			boolean found = false;
			for (int j = 0; j < 10; j++) {
				if (A[i] == B[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				Diferenca.add(A[i]);
			}
		}

		System.out.println("Vetor Diferença (A - B):");
		for (Integer value : Diferenca) {
			System.out.print(value + " ");
		}
		System.out.println();

		int[] Intercalacao = new int[20];
		for (int i = 0; i < 10; i++) {
			Intercalacao[2 * i] = A[i];
			Intercalacao[2 * i + 1] = B[i];
		}

		System.out.println("Vetor Intercalação (A e B intercalados):");
		for (int i = 0; i < 20; i++) {
			System.out.print(Intercalacao[i] + " ");
		}
		System.out.println();

		sc.close();

	}
}
