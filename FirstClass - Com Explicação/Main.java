package FirstClass;

public class Main {

	public static void main(String[] args) {
		/*
		 Depois de ter criado a classe aluno, com os atributos desejados, já podemos realiizar a criação de objetos, utilizando a classe alunos, dentro do Main.
		 Todos as classes dentro do projeto podem ser instanciadas a qualquer momento.
		
		 Aqui estamos criando o objeto "Matheus", que irá ter todos os atributos da classe Aluno;
		 Em programação estruturada, geralmente é declarado da seguinte forma:]
		  String Aluno;
		 No caso, a classe se comporta como se fosse um novo tipo de variavel, que você acabou de criar. A diferença, é que é necessário falar para o programa
		  que o objeto Matheus receberá tudo que tiver em aluno
		 Talvez uma forma que fique mais de um entendimento melhor.
		 Aluno Matheus;
		 Matheus = new Aluno();
		*/
		Aluno Matheus = new Aluno();
		
		//Depois do objeto criado, vamos atribuir alguns valores aos nossos atributos.
		
		Matheus.Nome = "Matheus";
		Matheus.RA = 000001;
		Matheus.Nota = 9.55;
		
		//E por último, vamos chamar o nosso método de Exibir Dados, onde por sua vez, irá exibir todos os dados definidos para os atributos.
		Matheus.exibirDados();		

	}

}
