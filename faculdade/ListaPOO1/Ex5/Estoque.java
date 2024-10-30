package Ex5;

public class Estoque {

	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque() {
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		setQtdAtual(qtdAtual);
		setQtdMinima(qtdMinima);
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public void mudarQtdMinima(int qtdMinima) {
		if (qtdMinima >= 0) {
			this.qtdMinima = qtdMinima;
		}
	}

	public void setQtdAtual(int qtdAtual) {
		if (qtdAtual >= 0) {
			this.qtdAtual = qtdAtual;
		}
	}

	public void setQtdMinima(int qtdMinima) {
		if (qtdMinima >= 0) {
			this.qtdMinima = qtdMinima;
		}
	}

	public void repor(int qtd) {
		if (qtd > 0) {
			this.qtdAtual += qtd;
		}
	}

	public void darBaixa(int qtd) {
		if (qtd > 0 && qtd <= qtdAtual) {
			this.qtdAtual -= qtd;
		}
	}

	public String mostra() {
		return "Nome: " + nome + ", Quantidade Atual: " + qtdAtual + ", Quantidade Mínima: " + qtdMinima;
	}

	public boolean precisaRepor() {
		return qtdAtual <= qtdMinima;
	}
}
