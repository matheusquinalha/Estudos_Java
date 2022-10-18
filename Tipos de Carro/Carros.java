package Exercicio03;

public class Carros {
	private String tipo;
	private String cor;
	private String modelo;
	private int qtd_portas;
	private Boolean tracao = false;
	private Boolean banco_couro = false;
	private Boolean ar_condicionado = false;
	
	//Casual
	public Carros(String tipo, String cor, String modelo, int qtd_portas) {
		this.tipo = "Casual";
		this.cor = cor;
		this.modelo = modelo;
		this.qtd_portas = qtd_portas;
	}
	
	//Esporte
	public Carros(String tipo, String cor, String modelo, int qtd_portas, Boolean tracao) {
		this.tipo = "Esporte";
		this.cor = cor;
		this.modelo = modelo;
		this.qtd_portas = qtd_portas;
		this.tracao = tracao;
	}
	
	
	//Luxo
	public Carros(String tipo, String cor, String modelo, int qtd_portas, Boolean tracao, Boolean banco_couro, Boolean ar_condicionado) {
		this.tipo = "Luxo";
		this.cor = cor;
		this.modelo = modelo;
		this.qtd_portas = qtd_portas;
		this.tracao = tracao;
		this.banco_couro = banco_couro;
		this.ar_condicionado = ar_condicionado;
	}
	
	public void exibirDados() {
		System.out.println("Tipo do Carro: " + this.tipo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Quantidade de Portas: " + this.qtd_portas);
		if (this.tracao) 
			System.out.println("Tração: Sim");
		if (this.banco_couro)
			System.out.println("Banco de Couro: Sim");
		if (this.ar_condicionado)
			System.out.println("Ar Condicionado: Sim");			
	}
	
}
