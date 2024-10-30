package Ex5;

public class PrincipalEstoque {

	public static void main(String[] args) {

		Estoque estoque1 = new Estoque("Teclado", 10, 5);
		Estoque estoque2 = new Estoque("Mouse", 15, 8);
		Estoque estoque3 = new Estoque("Monitor", 4, 2);

		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);

		System.out.println("Precisa repor estoque1? " + estoque1.precisaRepor());
		System.out.println("Precisa repor estoque2? " + estoque2.precisaRepor());
		System.out.println("Precisa repor estoque3? " + estoque3.precisaRepor());

		System.out.println("\nInformações do Estoque:");
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
	}
}
