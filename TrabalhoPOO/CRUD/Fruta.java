package CRUD;

import java.util.Random;

public class Fruta extends Produto {
	private final String tipo;
	private boolean organico;

	// Contrutor
	public Fruta(String nome, Float preco, int qtdEstoque, String validade, String tipo, Boolean organico) {
		super(nome, preco, qtdEstoque, validade);
		this.tipo = tipo;
		this.organico = organico;
		adicionaCodigoBarras();
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
		System.out.println("Organico: " + this.organico);
	}

	public void adicionaCodigoBarras() {
		Random r = new Random();
		int codigo_barras = r.nextInt(999999);
		super.setCodigo_barras(codigo_barras);
	}
}
