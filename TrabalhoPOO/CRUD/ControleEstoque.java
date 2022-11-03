package CRUD;

public interface ControleEstoque {
	public abstract int tamanhoEstoque();

	public abstract void decrementaEstoque(String nomeProduto, int quantidade);

	public abstract void decrementaEstoque(String nomeProduto);

	public abstract void incrementaEstoque(String nomeProduto, int quantidade);

	public abstract void incrementaEstoque(String nomeProduto);
}
