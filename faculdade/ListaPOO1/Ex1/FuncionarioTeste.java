package Ex1;

import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario() ;
		
		
		System.out.println("Digite o valor das vendas do funcionário: ");
		funcionario.setVendasBrutas(sc.nextDouble());
		
		System.out.printf("O valor do salário é de: R$%.2f\n", funcionario.calculaSalario());
		
		
		
		sc.close();
	}

}
