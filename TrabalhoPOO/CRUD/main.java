package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		ArrayList<Armazem> listaArmazem = new ArrayList<Armazem>();
		int escolha = 0;
		int contador = 0;

		System.out.format("+-------------------------------------------------------------+%n");
		System.out.format("| Bem-Vindo ao sistema de gerenciamento de armazens 'SeeHard' |%n");
		System.out.format("+-------------------------------------------------------------+%n");
		System.out.println("\nDigite a opção desejada:");
		while (escolha != 9) {
			System.out.format("+-----------------------------------------------------+%n");
			System.out.format("| [1] - Cadastrar Armazem                             |%n");
			System.out.format("| [2] - Cadastrar produto em um armazem existente     |%n");
			System.out.format("| [3] - Consultar apenas um armazem                   |%n");
			System.out.format("| [4] - Consultar todos os dados                      |%n");
			System.out.format("| [9] - Sair                                          |%n");
			System.out.format("+-----------------------------------------------------+%n");
			escolha = scanner.nextInt();

			switch (escolha) {

			// Cadastrar Armazem
			case 1:
				contador += 1;
				String nome, rua, numero;
				int capacidade;
				System.out.println("Digite o nome do Armazem: ");
				nome = scan.nextLine();
				System.out.println("Digite o endereço: ");
				rua = scan.nextLine();
				System.out.println("Digite o número: ");
				numero = scanner.next();
				System.out.println("Capacidade do seu estoque: ");
				capacidade = scanner.nextInt();
				List<Produto> produtos = Armazem.adicionarProduto();
				Armazem armazem = new Armazem(contador, nome, rua, numero, capacidade, produtos);
				listaArmazem.add(armazem);
				armazem.imprimirDados();
				break;

			// Cadastrar produto em um armazem existente
			case 2:
				System.out.println("Digite o ID do Armazem no qual você deseja cadastar o produto: ");
				int id_escolhido2 = scanner.nextInt();
				if (id_escolhido2 > listaArmazem.size()) {
					System.out.println("Não existe um armazem com esse ID");
					System.out.println("Voltando para o menu principal....");
					try {Thread.sleep(1000);} catch (InterruptedException ex) {}
					break;
				}
				Armazem armazemEscolhido2 = listaArmazem.get(id_escolhido2 - 1);
				List<Produto> produtos2 = Armazem.adicionarProduto();
				armazemEscolhido2.getListaProdutos().addAll(produtos2);
				break;
				
			// Consultar apenas um armazem
			case 3:
				System.out.println("Digite o ID do Armazem que você deseja consultar: ");
				int id_escolhido = scanner.nextInt();
				if (id_escolhido > listaArmazem.size()) {
					System.out.println("Não existe um armazem com esse ID");
					System.out.println("Voltando para o menu principal....");
					try {Thread.sleep(1000);} catch (InterruptedException ex) {}
					break;
				}
				Armazem armazemEscolhido = listaArmazem.get(id_escolhido - 1);
				armazemEscolhido.imprimirDados();
				armazemEscolhido.removerProduto(armazemEscolhido.getListaProdutos());
				break;
			// Consultar todos os dados
			case 4:
				for (Armazem armazemLista : listaArmazem) {
					armazemLista.imprimirDados();
				}
				break;
				
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		}
	}
}
