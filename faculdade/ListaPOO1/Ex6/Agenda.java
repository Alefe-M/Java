package Ex6;

public class Agenda {

	private Pessoa[] pessoas;
	private int count;

	public Agenda() {
		this.pessoas = new Pessoa[10];
		this.count = 0;
	}

	public void armazenaPessoa(String nome, int idade, float altura) {
		if (count < pessoas.length) {
			pessoas[count] = new Pessoa(nome, idade, altura);
			count++;
			System.out.println(nome + " foi armazenado(a) na agenda.");
		} else {
			System.out.println("Agenda cheia. Não é possível armazenar mais pessoas.");
		}
	}

	public void removePessoa(String nome) {
		for (int i = 0; i < count; i++) {
			if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
				for (int j = i; j < count - 1; j++) {
					pessoas[j] = pessoas[j + 1];
				}
				pessoas[count - 1] = null;
				count--;
				System.out.println(nome + " foi removido(a) da agenda.");
				return;
			}
		}
		System.out.println("Pessoa com o nome " + nome + " não encontrada.");
	}

	public int buscaPessoa(String nome) {
		for (int i = 0; i < count; i++) {
			if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		System.out.println("Pessoa com o nome " + nome + " não encontrada.");
		return -1;
	}

	public void imprimeAgenda() {
		if (count == 0) {
			System.out.println("Agenda vazia.");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println("Posição " + i + ": " + pessoas[i]);
		}
	}

	public void imprimePessoa(int index) {
		if (index >= 0 && index < count) {
			System.out.println("Posição " + index + ": " + pessoas[index]);
		} else {
			System.out.println("Posição inválida.");
		}
	}
}
