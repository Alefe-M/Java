package vetores;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] temperatura = { 20.2f, 31.5f, 18.5f };
		// Vetor de float

		float soma = 0;
		for (float t : temperatura) {
			soma += t;

		}

		float media = soma / temperatura.length;

		System.out.printf("Media %.2f%n", media);

		// Calculando a diferença
		float[] diferencas = new float[temperatura.length];
		for (int i = 0; i < temperatura.length; i++) {
			diferencas[i] = temperatura[i] - media;
			System.out.printf("Temperatura %d com diferenca" + " de %.2f da media", i, diferencas[i]);
		}

	}

}
