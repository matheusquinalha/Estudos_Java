package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Armazem implements ControleEstoque {
	private int id;
	private String nome;
	private String endereco;
	private String num_endereco;
	private int capacidade;
	private List<Produto> listaProdutos;

	// Construtor
	public Armazem(int id, String nome, String endereco, String num_endereco, int capacidade,
			List<Produto> listaProdutos) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.num_endereco = num_endereco;
		this.capacidade = capacidade;
		this.listaProdutos = listaProdutos;
	}

	public Armazem() {

	}

	public Armazem(Armazem temp) {
		this.id = temp.id;
		this.nome = temp.nome;
		this.endereco = temp.endereco;
		this.num_endereco = temp.num_endereco;
		this.capacidade = temp.capacidade;
		this.listaProdutos = temp.listaProdutos;
	}

	// Gets e Sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	// Metodos
	public static void imprimirArmazem(ArrayList<Armazem> listaArmazem, int armazemEscolhido) {
		listaArmazem.get(armazemEscolhido).imprimirDados();
	}
	
	public static void imprimirArmazem(ArrayList<Armazem> listaArmazem) {
		for (Armazem armazemLista : listaArmazem)
			armazemLista.imprimirDados();
	}
	
	public void imprimirDados() {
		System.out.format("+-----------------------------------------------------+%n");
		System.out.format("+------------------------Armazem----------------------+%n");
		System.out.println("ID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco + " - Numero: " + this.num_endereco);
		System.out.println("Capacidade: " + this.capacidade);
		System.out.format("+-----------------------------------------------------+%n");
		System.out.format("+------------------------Produtos---------------------+%n");
		for (Produto produto : this.listaProdutos) {
			produto.exibirDados();
		}
		System.out.format("+-----------------------------------------------------+%n");
	}

	public static List<Produto> adicionarProduto() {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		int opcao = 0;
		String nome;
		Float preco;
		int qtdEstoque;
		String validade;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		while (opcao != 9) {
			System.out.println("[1] - Inserir nova Bebida");
			System.out.println("[2] - Inserir nova Fruta");
			System.out.println("[3] - Inserir novo Produto Industrializado");
			if (!lista.isEmpty())
				System.out.println("[9] - Sair");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				String marcaBebida;
				Float volume;
				System.out.println("Digite o nome do produto: ");
				nome = scanner.nextLine();
				System.out.println("Digite o preço: ");
				preco = scan.nextFloat();
				System.out.println("Digita a quantidade de estoque: ");
				qtdEstoque = scan.nextInt();
				System.out.println("Digite a data de validade: ");
				validade = scan.next();
				System.out.println("Digite a marca da bebida: ");
				marcaBebida = scanner.nextLine();
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
				nome = scanner.nextLine();
				System.out.println("Digite o preço: ");
				preco = scan.nextFloat();
				System.out.println("Digita a quantidade de estoque: ");
				qtdEstoque = scan.nextInt();
				System.out.println("Digite a data de validade: ");
				validade = scan.next();
				System.out.println("Digite o tipo da fruta: ");
				tipo =  scanner.nextLine();
				System.out.println("A fruta é orgânica? (Sim ou Não) ");
				respostaFruta = scan.next();
				organico = (respostaFruta.toUpperCase().equals("SIM")) ? true : false;
				Fruta fruta = new Fruta(nome, preco, qtdEstoque, validade, tipo, organico);
				lista.add(fruta);
				break;

			case 3:
				String marcaIndustrializado;
				String respostaIndustrializado;
				Boolean integral;
				System.out.println("Digite o nome do produto: ");
				nome = scanner.nextLine();
				System.out.println("Digite o preço: ");
				preco = scan.nextFloat();
				System.out.println("Digita a quantidade de estoque: ");
				qtdEstoque = scan.nextInt();
				System.out.println("Digite a data de validade: ");
				validade = scan.next();
				System.out.println("Digite a marca: ");
				marcaIndustrializado = scanner.nextLine();
				System.out.println("O industrializado é integral? (Sim ou Não) ");
				respostaIndustrializado = scan.next();
				integral = (respostaIndustrializado.toUpperCase().equals("SIM")) ? true : false;
				Industrializado industrializado = new Industrializado(nome, preco, qtdEstoque, validade,
						marcaIndustrializado, integral);
				lista.add(industrializado);
				break;
				
			case 9:
				break;
				
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		}
		return lista;
	}

	public void removerProduto(List<Produto> list) {
		String escolha = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Você gostaria de excluir algum item?(Sim ou Não)");
		escolha = scan.next();
		while (escolha.toUpperCase().equals("SIM")) {			
			if (list.isEmpty()) {
				System.out.println("A lista de produtos se encontra vazia, voltando para o Menu...");
				try { Thread.sleep(1000); } catch (InterruptedException ex) {}
				break;
			}			
			int cd_barras_escolhido;
			System.out.println("Digite o código de barras para a exclusão: ");
			cd_barras_escolhido = scan.nextInt();
			List<Produto> resultado = list.stream().filter(item -> item.getCodigo_barras() == cd_barras_escolhido)
										.collect(Collectors.toList());
			if (resultado.isEmpty()) {
				System.out.println("Código de Barras não encontrado!");
				continue;
			}
			int posicao = list.indexOf(resultado.get(0));
			list.remove(posicao);
			System.out.println(resultado.get(0).getNome() + " removido(a) com sucesso!");
			try { Thread.sleep(1000); } catch (InterruptedException ex) {}
			System.out.println("Deseja excluir mais um item? (Sim ou Não)");
			escolha = scan.next();
		}
	}
}
