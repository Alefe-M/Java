package lista2;

import java.util.Scanner;

public class Ex28 {

	public static long fatorial(int n) {
		long fat = 1;

		for (int i = 1; i <= n; i++) {
			fat *= i;
		}
		return fat;
	}

	public static long arranjo(int n, int p) {
		return fatorial(n) / fatorial(n - p);
	}

	public static long combinacao(int n, int p) {
		return fatorial(n) / (fatorial(p) * fatorial(n - p));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de n: ");
		int n = sc.nextInt();
		System.out.println("Digite o valor de p:");
		int p = sc.nextInt();

		if (p > n || p < 0) {
			System.out.println("O valor de p deve ser entre 0 e n.");
		} else {
			long arranjoResultado = arranjo(n, p);
			long combinacaoResultado = combinacao(n, p);

			System.out.println("Arranjo A(" + n + ", " + p + ") = " + arranjoResultado);
			System.out.println("Combinação C(" + n + ", " + p + ") = " + combinacaoResultado);
		}

		sc.close();
	}

}
