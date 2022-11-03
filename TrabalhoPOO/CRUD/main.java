package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Armazem> listaArmazem = new ArrayList<Armazem>();
		int escolha = 0;

		System.out.println("Bem-Vindo ao sistema de gerenciamento de armazens 'SeeHard' ");
		System.out.println("-----------------------------");
		System.out.println("Digita a opção desejada:");
		while (escolha != 9) {
			System.out.println("1 - Cadastrar Armazem");
			System.out.println("2 - Consultar dados");
			System.out.println("9 - Sair");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				List<Produto> produtos = Armazem.listaDeProdutos();
				Armazem armazem = new Armazem("Armazem Real", "Rua Tancredo Neves", "1322", 1000, produtos);
				listaArmazem.add(armazem);
				armazem.imprimirDados();
				break;
			case 2:
				for (Armazem armazemLista : listaArmazem) {
					armazemLista.imprimirDados();
				}
					break;
			default:
				break;
			}
		}

	}
}
