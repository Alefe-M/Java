package lista2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double salarioMinimo = 788.00, valorHoraExtra = 10;
		double descontoINSS = 0, descontoIR = 0;

		System.out.println("Digite a matricula deste funcionário:");
		int matricula = sc.nextInt();
		System.out.println("Digite a quantidade de horas extras trabalhadas:");
		double horaExtra = sc.nextDouble();

		horaExtra = horaExtra * valorHoraExtra;

		double salarioBruto = 3 * salarioMinimo + horaExtra;
		if (salarioBruto > 1500) {
			descontoINSS = salarioBruto * 0.12;

		}
		if (salarioBruto > 2000) {
			descontoIR = salarioBruto * 0.20;

		}
		double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

		System.out.println("O Salario Bruto do trabalhador " + matricula + " é de R$ " + salarioBruto);
		System.out.println("O salario Liquido do trabalhador " + matricula + " é de R$ " + salarioLiquido);

		sc.close();
	}

}
