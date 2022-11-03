package CRUD;

public abstract class Produto {
	private String nome;
	private Float preco;
	private int qtdEstoque;
	private String validade;

	// Contrutor
	public Produto(String nome, Float preco, int qtdEstoque, String validade) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.validade = validade;
	}

	public Produto() {

	}

	// Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	// Metodo
	public void exibirDados() {
		System.out.println("Dados:");
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
		System.out.println("Quantidade Estoque: " + this.qtdEstoque);
		System.out.println("Validade: " + this.validade);
	}

	public abstract String getDadosProduto();
}
