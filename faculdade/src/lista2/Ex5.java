package lista2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de identificação do aluno:");
		int idAluno = sc.nextInt();
		System.out.println("Digite a nota 1:");
		double n1 = sc.nextDouble();
		System.out.println("Digite a nota 2:");
		double n2 = sc.nextDouble();
		System.out.println("Digite a nota 3:");
		double n3 = sc.nextDouble();

		if (0 <= n1 && n1 <= 10 && 0 <= n2 && n2 <= 10 && 0 <= n3 && n3 <= 10) {
			System.out.println("Digite a media das atividades:");
			double mediaAtividades = sc.nextDouble();

			double media = (n1 + (n2 * 2) + (n3 * 3) + mediaAtividades) / 7;

			String conceito;
			if (media >= 9.0 && media <= 10) {
				conceito = "A";
			} else if (media < 9.0 && media >= 7.5) {
				conceito = "B";
			} else if (media < 7.5 && media >= 6.0) {
				conceito = "C";
			} else if (media < 6.0 && media >= 4.0) {
				conceito = "D";
			} else {
				conceito = "E";
			}

			String mensagem;

			if (conceito == "A" || conceito == "B" || conceito == "C") {
				mensagem = "APROVADO";
			} else {
				mensagem = "REPROVADO";
			}

			System.out.println("*Notas do aluno " + idAluno + "*");
			System.out.println("Nota 1: " + n1);
			System.out.println("Nota 2: " + n2);
			System.out.println("Nota 3: " + n3);
			System.out.println("Media dos execicios: " + mediaAtividades);
			System.out.println("Media de aproveitamento: " + media);
			System.out.println("O conceito é: " + conceito);
			System.out.println(mensagem);

		} else {
			System.out.println("As notas devem ser 0 <= nota <=10");
		}

		sc.close();
	}

}
