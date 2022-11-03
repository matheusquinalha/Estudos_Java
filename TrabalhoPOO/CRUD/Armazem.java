package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armazem implements ControleEstoque {
	private String nome;
	private String endereco;
	private String num_endereco;
	private int capacidade;
	private List<Produto> listaProdutos;

	// Construtor
	public Armazem(String nome, String endereco, String num_endereco, int capacidade, List<Produto> listaProdutos) {
		this.nome = nome;
		this.endereco = endereco;
		this.num_endereco = num_endereco;
		this.capacidade = capacidade;
		this.listaProdutos = listaProdutos;
	}

	public Armazem() {

	}

	// Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNum_endereco() {
		return num_endereco;
	}

	public void setNum_endereco(String num_endereco) {
		this.num_endereco = num_endereco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	// Metodo
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco + " - Numero: " + this.num_endereco);
		System.out.println("Capacidade: " + this.capacidade);
		for (Produto produto : this.listaProdutos) {
			produto.exibirDados();
		}
	}

	public static List<Produto> listaDeProdutos() {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		int opcao = 0;
		String nome;
		Float preco;
		int qtdEstoque;
		String validade;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (opcao != 9) {
			System.out.println("1 - Inserir nova Bebida");
			System.out.println("2 - Inserir nova Fruta");
			System.out.println("3 - Inserir novo Produto Industrializado");
			System.out.println("9 - Sair");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				String marcaBebida;
				Float volume;
				System.out.println("Digite o nome do produto: ");
				nome = scan.next();
				System.out.println("Digite o preço: ");
				preco = scan.nextFloat();
				System.out.println("Digita a quantidade de estoque: ");
				qtdEstoque = scan.nextInt();
				System.out.println("Digite a data de validade: ");
				validade = scan.next();
				System.out.println("Digite a marca da bebida: ");
				marcaBebida = scan.next();
				System.out.println("Digite o volume da bebida: ");
				volume = scan.nextFloat();
				Bebida bebida = new Bebida(nome, preco, qtdEstoque, validade, marcaBebida, volume);
				lista.add(bebida);
				break;

			case 2:
				String tipo;
				String respostaFruta;
				Boolean organico;
				System.out.println("Digite o nome do produto: ");
				nome = scan.next();
				System.out.println("Digite o preço: ");
				preco = scan.nextFloat();
				System.out.println("Digita a quantidade de estoque: ");
				qtdEstoque = scan.nextInt();
				System.out.println("Digite a data de validade: ");
				validade = scan.next();
				System.out.println("Digite o tipo da Fruta: ");
				tipo = scan.next();
				System.out.println("Digite se a Fruta é organica ou não(Sim ou Não): ");
				respostaFruta = scan.next();
				organico = respostaFruta == "Sim" ? true : false;
				Fruta fruta = new Fruta(nome, preco, qtdEstoque, validade, tipo, organico);
				lista.add(fruta);
				break;

			case 3:
				String marcaIndustrializado;
				String respostaIndustrializado;
				Boolean integral;
				System.out.println("Digite o nome do produto: ");
				nome = scan.next();
				System.out.println("Digite o preço: ");
				preco = scan.nextFloat();
				System.out.println("Digita a quantidade de estoque: ");
				qtdEstoque = scan.nextInt();
				System.out.println("Digite a data de validade: ");
				validade = scan.next();
				System.out.println("Digite a marca: ");
				marcaIndustrializado = scan.next();
				System.out.println("Digite se o produto é integral ou não(Sim ou Não): ");
				respostaIndustrializado = scan.next();
				integral = respostaIndustrializado == "Sim" ? true : false;
				Industrializado industrializado = new Industrializado(nome, preco, qtdEstoque, validade,
						marcaIndustrializado, integral);
				lista.add(industrializado);
				break;
			case 9:
				break;
			default:
				System.out.println("Digite uma opção valida");
			}
		}
		return lista;
	}

	/*
	 * public void adicionaProdutoEstoque(Produto produto) {
	 * listaProdutos.add(produto); System.out.println("O produto " +
	 * produto.getNome() + " foi adicionado com sucesso no armazem"); }
	 */

	public int tamanhoEstoque() {
		int quantidadeTotal = 0;
		for (Produto produto : listaProdutos) {
			quantidadeTotal += produto.getQtdEstoque();
		}
		return quantidadeTotal;
	}

	public void decrementaEstoque(String nomeProduto, int quantidade) {
		int quantidadeReduzida;
		for (Produto produto : listaProdutos) {
			if (produto.getNome().toUpperCase() == nomeProduto.toUpperCase()) {
				quantidadeReduzida = produto.getQtdEstoque() - quantidade;
				if (quantidadeReduzida < 0) {
					System.out.println("A quantidade do produto não pode ser menor que 0(zero)");
					return;
				}
				produto.setQtdEstoque(quantidadeReduzida);
			}
		}
	}

	public void decrementaEstoque(String nomeProduto) {
		decrementaEstoque(nomeProduto, 1);
	}

	public void incrementaEstoque(String nomeProduto, int quantidade) {
		int quantidadeAumentada;
		int estoqueAtual;
		for (Produto produto : listaProdutos) {
			if (produto.getNome().toUpperCase() == nomeProduto.toUpperCase()) {
				quantidadeAumentada = produto.getQtdEstoque() + quantidade;
				estoqueAtual = tamanhoEstoque() + quantidadeAumentada;
				if (estoqueAtual > this.getCapacidade()) {
					System.out.println("A capacidade do armazem foi atingido");
					return;
				}
				produto.setQtdEstoque(quantidadeAumentada);
			}
		}
	}

	public void incrementaEstoque(String nomeProduto) {
		incrementaEstoque(nomeProduto, 1);
	}
}
