package CRUD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Arquivo {

	public static void criarArquivo() {
		try {
			File arquivo = new File("dados.txt");
			arquivo.createNewFile();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro, ligue para o Rizzi");
			e.printStackTrace();
		}
	}

	public static void cadastrarArmazem(List<Armazem> armazens) {
		try {
			criarArquivo();
			FileWriter arquivo = new FileWriter("dados.txt");
			for (Armazem armazem : armazens) {
				arquivo.write("{");
				arquivo.write("Armazem: " + armazem.getNome());
				arquivo.write("Endereço: " + armazem.getEndereco());
				arquivo.write("NumEndereço: " + armazem.getNum_endereco());
				arquivo.write("Capacidade: " + armazem.getCapacidade());
				for (Produto produto : armazem.getListaProdutos()) {
					arquivo.write(produto.getDadosProduto());
				}
				arquivo.write("}");
			}
			arquivo.close();
			System.out.println("Dados salvos com sucesso!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro, ligue para o Rizzi");
			e.printStackTrace();
		}
	}

	public static List<Armazem> lerArquivo() {

		try {
			String[] valores;
			File arquivo = new File("dados.txt");
			Scanner myReader = new Scanner(arquivo);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				data = data.replace("{", "").replace("}", "");
				valores = data.split(":");

				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro, ligue para o Rizzi");
			e.printStackTrace();
		}
		return null;
	}

	public static Armazem lerArmazem(Scanner myReader, String nome) {
		String[] valoresLer;
		String _nome = nome;

		String data = myReader.nextLine();
		data = data.replace("{", "").replace("}", "");
		valoresLer = data.split(":");

		String endereco = valoresLer[1];

		data = myReader.nextLine();
		data = data.replace("{", "").replace("}", "");
		valoresLer = data.split(":");

		String num_endereco = valoresLer[1];

		data = myReader.nextLine();
		data = data.replace("{", "").replace("}", "");
		valoresLer = data.split(":");

		int capacidade = Integer.parseInt(valoresLer[1]);

		List<Produto> listaProdutos = null;

		Armazem armazem = new Armazem(_nome, endereco, num_endereco, capacidade, listaProdutos);
		return armazem;
	}
}