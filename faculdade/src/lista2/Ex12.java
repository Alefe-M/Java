package lista2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double nota1 = 0, nota2 = 0;
		boolean notaValida;
		String resposta;

		do {
			System.out.println("Digite o nome do Aluno:");
			String nomeAluno = sc.nextLine();

			do {
				System.out.println("Digite a nota 1: (0.0 a 10)");
				nota1 = sc.nextDouble();
				notaValida = (nota1 >= 0.0 && nota1 <= 10.0);
				if (!notaValida) {
					System.out.println("Nota invalida Digite novamente.");
				}

			} while (!notaValida);

			do {
				System.out.println("Digite a nota 2: (0.0 a 10)");
				nota2 = sc.nextDouble();
				notaValida = (nota2 >= 0.0 && nota2 <= 10.0);
				if (!notaValida) {
					System.out.println("Nota invalida Digite novamente.");
				}

			} while (!notaValida);

			double media = (nota1 + nota2) / 2;

			System.out.println("A media do aluno " + nomeAluno + " foi " + media);
			sc.nextLine();

			System.out.println("Deseja continuar (sim/nao)?");
			resposta = sc.nextLine();

		} while (resposta.equals("sim"));

		sc.close();
	}

}
