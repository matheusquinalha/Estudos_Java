package CRUD;

public class Bebida extends Produto {
	private final String marca;
	private Float volume;

	// Contrutor
	public Bebida(String nome, Float preco, int qtdEstoque, String validade, String marca, Float volume) {
		super(nome, preco, qtdEstoque, validade);
		this.marca = marca;
		this.volume = volume;
	}

	// Gets
	public String getMarca() {
		return marca;
	}

	public Float getVolume() {
		return volume;
	}

	// Metodo
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Marca: " + this.marca);
		System.out.println("Volume: " + this.volume);
	}

	@Override
	public String getDadosProduto() {
		String dadosjson;
		dadosjson = "{Nome: " + super.getNome() + ",Preço: " + super.getPreco() + ",QuantidadeEstoque: "
				+ super.getQtdEstoque() + ",Validade: " + super.getValidade() + ",Marca: " + this.getMarca()
				+ ",Volume: " + this.getVolume();
		return dadosjson;
	}
}