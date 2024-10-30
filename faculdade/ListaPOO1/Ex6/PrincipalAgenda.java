package Ex6;

public class PrincipalAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		agenda.armazenaPessoa("Alice", 25, 1.65f);
		agenda.armazenaPessoa("Bob", 30, 1.80f);
		agenda.armazenaPessoa("Carol", 22, 1.55f);

		int pos = agenda.buscaPessoa("Bob");
		System.out.println("Bob está na posição: " + pos);

		System.out.println("\nAgenda completa:");
		agenda.imprimeAgenda();

		agenda.imprimePessoa(1);

		agenda.removePessoa("Alice");

		System.out.println("\nAgenda após remoção:");
		agenda.imprimeAgenda();
	}
}
