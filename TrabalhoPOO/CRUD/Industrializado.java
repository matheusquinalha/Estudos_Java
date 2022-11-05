package CRUD;

import java.util.Random;

public class Industrializado extends Produto {
	private final String marca;
	private final Boolean integral;

	// Contrutor
	public Industrializado(String nome, Float preco, int qtdEstoque, String validade, String marca, Boolean integral) {
		super(nome, preco, qtdEstoque, validade);
		this.marca = marca;
		this.integral = integral;
		adicionaCodigoBarras();
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
		System.out.println("Integral: " + this.integral);
	}

	public void adicionaCodigoBarras() {
		Random r = new Random();
		int codigo_barras = r.nextInt(999999);
		super.setCodigo_barras(codigo_barras);
	}
}
