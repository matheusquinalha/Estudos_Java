package Pokemon;

public class main {

	public static void main(String[] args) {
		Pokemon pikachu = new Pikachu("Pikachu","Elétrico","Choque do Trovão");
		Pokemon bulbassauro = new Bulbassauro("Bulbassauro","Planta","Folhas Navalhas");
		Pokemon squirtle = new Squirtle("Squirtle","Água","Jato D'água");
		Pokemon charmander = new Charmander("Charmander","Fogo","Lança Chamas");
		
		pikachu.executarHabilidades();
		System.out.println("-------------");
		bulbassauro.executarHabilidades();
		System.out.println("-------------");
		squirtle.executarHabilidades();
		System.out.println("-------------");
		charmander.executarHabilidades();
	}
}
