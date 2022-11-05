package CRUD;

import java.util.List;

public interface ControleEstoque {
	public abstract void removerProduto(List<Produto> list);
	
	public abstract void imprimirDados();
}
