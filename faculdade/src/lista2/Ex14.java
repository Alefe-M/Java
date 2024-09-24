package lista2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean notaValida;
		int reprovado = 0, aprovado = 0, exame = 0, alunos = 0;
		double nota1 = 0, nota2 = 0, mediaClasse = 0, media = 0, maiorMedia = 0, menorMedia = 10;
		String resposta, nome, melhorAluno = "", piorAluno = "";

		do {
			alunos++;
			System.out.println("Digite o nome do aluno:");
			nome = sc.nextLine();

			do {
				System.out.println("Digite a primeira nota do aluno:");
				nota1 = sc.nextDouble();

				notaValida = (nota1 >= 0.0 && nota1 <= 10.0);
				if (!notaValida) {
					System.out.println("Nota invalida.");
				}

			} while (!notaValida);

			do {
				System.out.println("Digite a segunda nota do aluno:");
				nota2 = sc.nextDouble();

				notaValida = (nota2 >= 0.0 && nota2 <= 10.0);
				if (!notaValida) {
					System.out.println("Nota invalida.");
				}
			} while (!notaValida);

			media = (nota1 + nota2) / 2;

			if (media <= 3) {
				reprovado++;
			} else if (media > 3 && media < 7) {
				exame++;
			} else {
				aprovado++;
			}

			if (maiorMedia < media) {
				maiorMedia = media;
				melhorAluno = nome;
			} else if (menorMedia > media) {
				menorMedia = media;
				piorAluno = nome;
			}
			mediaClasse = (mediaClasse + media) / alunos;

			System.out.println("O total de alunos: " + alunos);
			System.out.println("Alunos Aprovados: " + aprovado);
			System.out.println("Alunos Exame: " + exame);
			System.out.println("Alunos Reprovados: " + reprovado);
			System.out.println("Media das notas da classe: " + mediaClasse);
			System.out.println("O melhor aluno foi " + melhorAluno + " com a media de " + maiorMedia);
			System.out.println("O pior aluno foi " + piorAluno + " com a media de " + menorMedia);
			System.out.println("Deseja continuar? (s/n)");
			sc.nextLine();
			resposta = sc.nextLine();

		} while (resposta.equals("s"));

		sc.close();
	}

}
