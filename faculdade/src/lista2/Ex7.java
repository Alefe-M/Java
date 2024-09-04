package lista2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário:");
		double salario = sc.nextDouble();
		System.out.println("Digite o código do funcionário:");
		int codigoFunc = sc.nextInt();

		String cargo;
		double percentual = 0;

		switch (codigoFunc) {
		case 1:
			cargo = "Escriturario";
			percentual = 0.50;
			break;
		case 2:
			cargo = "Secretario";
			percentual = 0.35;
			break;
		case 3:
			cargo = "Caixa";
			percentual = 0.20;
			break;
		case 4:
			cargo = "Gerente";
			percentual = 0.10;
			break;
		case 5:
			cargo = "Diretor";
			percentual = 0;
		default:
			System.out.println("Código inválido. Digite um codigo de 1 a 5.");
			break;
		}

		double salarioFinal = salario * (1 + percentual);
		System.out.println("O salario com o aumento: " + salarioFinal);

		sc.close();
	}

}
