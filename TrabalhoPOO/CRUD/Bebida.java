package CRUD;

import java.util.Random;

public class Bebida extends Produto {
	private final String marca;
	private Float volume;

	// Contrutor
	public Bebida(String nome, Float preco, int qtdEstoque, String validade, String marca, Float volume) {
		super(nome, preco, qtdEstoque, validade);
		this.marca = marca;
		this.volume = volume;
		adicionaCodigoBarras();
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

	public void adicionaCodigoBarras() {
		Random r = new Random();
		int codigo_barras = r.nextInt(999999);
		super.setCodigo_barras(codigo_barras);
	}
}