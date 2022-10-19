package Pokemon;

public class Charmander extends Pokemon{
	
	public Charmander(String nome, String tipo, String habilidade) {
		super(nome, tipo, habilidade);	
	}
	
	public void executarHabilidades() {
		super.executarHabilidades();
		System.out.println(super.getNome() + " esta usando a habilidade: " + super.gethabilidade());
	}
}
