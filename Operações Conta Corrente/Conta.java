package Ex03;

public class Conta {
	
	private int numero;
	private float saldo;
	private String nome;
	
	
	//Construtor
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = 0;
	}
	
	//Métodos
	
	public void setNumero(int numConta) {
		numero = numConta;
	}
	public void setSaldo(float saldoConta) {
		saldo = saldoConta;
	}
	public void setNome(String nomeConta) {
		nome = nomeConta;
	}
	
	public void depositar(float saldoDepositado) {
		saldo += saldoDepositado;
	}
	
	public void sacar(float saldoSacado) {
		if (this.saldo >= saldoSacado) {
		saldo -= saldoSacado;
		}else {
			System.out.println("Sem Saldo suficiente");
		}
	}
	
	public void imprimirSaldo() {
		System.out.println("------Saldo------");
		System.out.println("Saldo: " + saldo);
		System.out.println("-----------------");
	}
	
	public void imprimirDadosConta() {
		System.out.println("------Dados Conta------");
		System.out.println("Número da Conta: " + numero);
		System.out.println("Saldo da Conta: " + saldo);
		System.out.println("Nome do Titular: " + nome);
		System.out.println("-----------------------");
	}

}
