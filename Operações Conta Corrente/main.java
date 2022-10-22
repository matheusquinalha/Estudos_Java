package Ex03;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	
		int acao = 0;
		Scanner informacao = new Scanner(System.in);
		
	 for(int i=1; i<=3; i++) {
		 System.out.println("Bem vindo a Conta Corrente " + i);
		 
		 //Conta conta = new Conta();
		 Conta conta = new Conta(123,"Matheus");
		 
		 System.out.print("Digite o número da Conta: ");
		 conta.setNumero(informacao.nextInt());
		 
		 System.out.print("Digite o Saldo da Conta: ");
		 conta.setSaldo(informacao.nextFloat());
		 
		 System.out.print("Digite o Nome do Títular: ");
		 conta.setNome(informacao.next());
		 
		 while (acao != 9){			 
			System.out.println("Ações disponíveis:");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Visualizar Saldo");
			System.out.println("4 - Visualisar Dados da Conta");
			System.out.println("9 - Sair / Ir para próxima Conta");
			System.out.print("Digite a Ação desejada:");
			acao = informacao.nextInt();
			
			switch (acao) {
			case 1: 
				System.out.print("Digite o Valor que deseja depositar: ");
				conta.depositar(informacao.nextFloat());
				break;
			case 2:
				System.out.print("Digite o Valor que deseja sacar: ");
				conta.sacar(informacao.nextFloat());
				break;
			case 3:
				conta.imprimirSaldo();
				break;
			case 4:
				conta.imprimirDadosConta();
				break;
			case 9:
				break;
			default:
				System.out.println("Comando inválido");
		    }
		 };
		 
		 System.out.println("Saíndo da conta " + i + "...");
		 System.out.println("-------------------------");
	 }	 
   }
}
