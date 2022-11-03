package CRUD;

public class Fruta extends Produto {
	private final String tipo;
	private boolean organico;

	// Contrutor
	public Fruta(String nome, Float preco, int qtdEstoque, String validade, String tipo, Boolean organico) {
		super(nome, preco, qtdEstoque, validade);
		this.tipo = tipo;
		this.organico = organico;
	}

	// Gets
	public String getTipo() {
		return tipo;
	}

	public boolean getOrganico() {
		return organico;
	}

	// Metodo
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Marca: " + this.tipo);
		System.out.println("Marca: " + this.organico);
	}

	@Override
	public String getDadosProduto() {
		String dadosjson;
		dadosjson = "{Nome: " + super.getNome() + ",Preço: " + super.getPreco() + ",QuantidadeEstoque: "
				+ super.getQtdEstoque() + ",Validade: " + super.getValidade() + ",Tipo: " + this.getTipo()
				+ ",Organico: " + this.getOrganico();
		return dadosjson;
	}
}
