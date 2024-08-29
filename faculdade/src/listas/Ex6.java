package listas;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tempo gasto na viagem (em horas):");
		double tempoGasto = sc.nextDouble();

		System.out.println("Digite a velocidade media durante a viagem (Km/h):");
		double velocidadeMedia = sc.nextDouble();

		double distancia, litrosUsados;

		distancia = tempoGasto * velocidadeMedia;

		litrosUsados = distancia / 12;

		System.out.println("**DADOS**");
		System.out.println("A velocidade media foi de " + velocidadeMedia + "Km/h");
		System.out.println("O tempo gasto na viagem foi de " + tempoGasto + "h");
		System.out.println("A distância percorrida foi de " + distancia + "Km");
		System.out.printf("O veículo gastou %.1f L", litrosUsados);
		sc.close();
	}

}
