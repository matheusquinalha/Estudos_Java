package CRUD;

public class Industrializado extends Produto {
	private final String marca;
	private final Boolean integral;

	// Contrutor
	public Industrializado(String nome, Float preco, int qtdEstoque, String validade, String marca, Boolean integral) {
		super(nome, preco, qtdEstoque, validade);
		this.marca = marca;
		this.integral = integral;
	}

	// Gets
	public String getMarca() {
		return marca;
	}

	public boolean getIntegral() {
		return integral;
	}

	// Metodo
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Marca: " + this.marca);
		System.out.println("Marca: " + this.integral);
	}

	@Override
	public String getDadosProduto() {
		String dadosjson;
		dadosjson = "{Nome: " + super.getNome() + ",Preço: " + super.getPreco() + ",QuantidadeEstoque: "
				+ super.getQtdEstoque() + ",Validade: " + super.getValidade() + ",Marca: " + this.getMarca()
				+ ",Integral: " + this.getIntegral();
		return dadosjson;
	}
}
