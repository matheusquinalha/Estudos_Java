package FirstClass;

public class Aluno {
	/*
	Nesse momento, estaremos declarando alguns atributos para essa classe.
	Inicialmente, podemos definir se o atributo vai ser público ou privado, ou seja, se vamos poder enxergar ou manipular as informações fora da classe ou não;
	Posteriormente, vem o tipo do atributo (String, Int, Float, etc...), e por fim, o seu nome;
	Estarei criando 03 atributos, sendo o Nome, o RA (Registro do Aluno), e sua Nota. Como é um primeiro exemplo, não iremos criar atributos privados, pois não
	vimos ainda como alimentaremos esses dados. Então, vamos alimentá-los la no MAIN.
	*/
	public String Nome;
	public int RA;
	public Double Nota;
	
	
	
	//Vamos criar também um método, que nada mais é que uma ação que essa classe pode realizar.
	//Nesse caso, será algo simples, apenas para exibir os dados do Aluno
	
	public void exibirDados() {
		System.out.println("Dados do Aluno:");
		System.out.println("Nome: " + this.Nome);
		System.out.println("RA: " + this.RA);
		System.out.println("Nota: " + this.Nota);
	}
	
	
	
}
