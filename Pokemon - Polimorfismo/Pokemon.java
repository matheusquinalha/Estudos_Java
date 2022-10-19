package Pokemon;


public class Pokemon {
	private String nome;
	private String tipo;
	private String habilidade;
	private int pontos_vida;
	
	//Construtor
	public Pokemon(String nome, String tipo, String habilidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.habilidade = habilidade;
		this.pontos_vida = 100;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String gethabilidade() {
		return habilidade;
	}
	public void sethabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	public int getPontos_vida() {
		return pontos_vida;
	}
	public void setPontos_vida(int pontos_vida) {
		this.pontos_vida = pontos_vida;
	}

	//Métodos
	public void executarHabilidades() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Habilidade: " + this.habilidade);
		System.out.println("Pontos de vida: " + this.pontos_vida);
	}
}
