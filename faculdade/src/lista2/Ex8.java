package lista2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo de 1 a 4:");
		int codigo = sc.nextInt();

		System.out.println("Digite o valor de X:");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y:");
		int y = sc.nextInt();

		double f = 0;

		switch (codigo) {
		case 1:
			f = Math.sqrt((2 * y - x)) / Math.pow(y, 2) + Math.pow(x, 3);
			break;
		case 2:
			f = Math.sqrt((Math.pow(x, 3)) + (Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3)) / (x * y));
			break;
		case 3:
			f = 2 * x + Math.sqrt((x * y));
			break;
		case 4:
			f = Math.sin(x) + Math.cos(y);
			break;
		default:
			System.out.println("Digite apenas o codigo de 1 a 4");
			break;

		}
		System.out.printf("f(%d , %d) = %f", x, y, f);

		sc.close();
	}

}
