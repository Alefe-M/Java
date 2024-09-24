package lista2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String piramide = "";
		int linhas;

		do {
		System.out.println("Digite a quantidade de linhas da piramide:");
		linhas = sc.nextInt();

		

			for (int i = 0; i < linhas; i++) {

				String ast = "*";
				piramide = piramide + ast;
				System.out.println(piramide);
			}
			
		}while(linhas>0);
		 
		
		
		sc.close();
	}

}
