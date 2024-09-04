package invocation;

import java.util.Scanner;

public class ExercicioEmSala1 {

	public static void multi25(int x) {
		x = (50 + (25 * x));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas Jeff trabalhou?");
		int horasTrabalho = sc.nextInt();

		multi25(horasTrabalho);
		System.out.println("Jeff cobrou " + x + "por " + horasTrabalho + " horas de trabalho.");
	}

}
