package Exercicio03;


public class main {

	public static void main(String[] args) {
		
		Carros carroCasual = new Carros("Casual","Vermelho","Uno",2);
		
		Carros carroEsporte = new Carros("Esporte","Branco","Golf",4,true);
		
		Carros carroLuxo = new Carros("Luxo","Amarelo","Audi R8",2,true,true,true);
		
		System.out.println("--------Carro Casual--------");
		carroCasual.exibirDados();
		System.out.println("--------Carro Esporte--------");
		carroEsporte.exibirDados();
		System.out.println("--------Carro Luxo--------");
		carroLuxo.exibirDados();
	}
}
