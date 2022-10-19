package Pokemon;

public class Pikachu extends Pokemon{

	public Pikachu(String nome, String tipo, String habilidade) {
		super(nome, tipo, habilidade);	
	}
	
	public void executarHabilidades() {
		super.executarHabilidades();
		System.out.println(super.getNome() + " esta usando a habilidade: " + super.gethabilidade());
	}
}
