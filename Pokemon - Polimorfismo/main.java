package Pokemon;

public class main {

	public static void main(String[] args) {
		Pokemon pikachu = new Pikachu("Pikachu","El�trico","Choque do Trov�o");
		Pokemon bulbassauro = new Bulbassauro("Bulbassauro","Planta","Folhas Navalhas");
		Pokemon squirtle = new Squirtle("Squirtle","�gua","Jato D'�gua");
		Pokemon charmander = new Charmander("Charmander","Fogo","Lan�a Chamas");
		
		pikachu.executarHabilidades();
		System.out.println("-------------");
		bulbassauro.executarHabilidades();
		System.out.println("-------------");
		squirtle.executarHabilidades();
		System.out.println("-------------");
		charmander.executarHabilidades();
	}
}
