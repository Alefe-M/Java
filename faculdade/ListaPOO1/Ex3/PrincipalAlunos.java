package Ex3;

import java.util.Scanner;

public class PrincipalAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de alunos matriculados:");
        int nAlunos = sc.nextInt();
        sc.nextLine(); 

        Aluno[] alunos = new Aluno[nAlunos];

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            int matricula = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = sc.nextLine();

            System.out.println("Digite a N1:");
            double n1 = sc.nextDouble();

            System.out.println("Digite a N2:");
            double n2 = sc.nextDouble();

            System.out.println("Digite a nota do trabalho:");
            double trabalho = sc.nextDouble();

            alunos[i] = new Aluno(matricula, nome, n1, n2, trabalho);

            
            double media = alunos[i].calculaMedia();
            System.out.println("A média do aluno " + alunos[i].getNome() + " é: " + media);

            if (media < 6.0) {
                double notaNecessaria = alunos[i].calculaNotaFinalNecessaria();
                System.out.println("Nota necessária no exame final para média 5.0: " + notaNecessaria);
            }
        }
        
        sc.close();
    }
}
