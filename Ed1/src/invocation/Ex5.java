package invocation;

public class Ex5 {

	public static void soma10(Integer x) {
		x = x + 10;
		System.out.println("Valor de x apos a soma = " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer numero = 3;
		// INT para INTEGER
		System.out.println("O numero é: " + numero);
		soma10(numero);
		System.out.println("Agora o numero vale: " + numero);
	}

}
