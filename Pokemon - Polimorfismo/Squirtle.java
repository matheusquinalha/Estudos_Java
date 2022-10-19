package Pokemon;

public class Squirtle extends Pokemon{
	
	public Squirtle(String nome, String tipo, String habilidade) {
		super(nome, tipo, habilidade);	
	}
	
	public void executarHabilidades() {
		super.executarHabilidades();
		System.out.println(super.getNome() + " esta usando a habilidade: " + super.gethabilidade());
	}
}
