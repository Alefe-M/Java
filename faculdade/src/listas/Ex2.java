package listas;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int a;
		int b;

		System.out.println("Digite o Dividendo:");
		x = sc.nextInt();
		System.out.println("Digite o Divisor:");
		y = sc.nextInt();

		a = x/y;
		
		
		
		
		
		System.out.println("Dividendo:" + x);
		System.out.println("Divisor:" + y);
		System.out.println("Quociente:" + a);
		System.out.println("Resto:" );

		sc.close();
	}

}
