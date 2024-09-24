package lista2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("Digite o tamanho dos vetores (N <= 10): ");
			n = sc.nextInt();
		} while (n <= 0 || n > 10);
		double[] V1 = new double[n];
		double[] V2 = new double[n];
		char[] Op = new char[n];
		double[] Resul = new double[n];

		System.out.println("Digite os valores do vetor V1:");
		for (int i = 0; i < n; i++) {
			V1[i] = sc.nextDouble();
		}

		System.out.println("Digite os valores do vetor V2:");
		for (int i = 0; i < n; i++) {
			V2[i] = sc.nextDouble();
		}

		System.out.println("Digite os operadores (+, -, *, /) no vetor Op:");
		for (int i = 0; i < n; i++) {
			Op[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < n; i++) {
			switch (Op[i]) {
			case '+':
				Resul[i] = V1[i] + V2[i];
				break;
			case '-':
				Resul[i] = V1[i] - V2[i];
				break;
			case '*':
				Resul[i] = V1[i] * V2[i];
				break;
			case '/':
				if (V2[i] != 0) {
					Resul[i] = V1[i] / V2[i];
				} else {
					System.out.println("Erro: divisão por zero na posição " + i);
					Resul[i] = Double.NaN;
				}
				break;
			default:
				System.out.println("Operador inválido na posição " + i);
				Resul[i] = Double.NaN;
			}
		}

		System.out.println("Resultado (Resul):");
		for (int i = 0; i < n; i++) {
			System.out.print(Resul[i] + " ");
		}

		sc.close();
	}

}
