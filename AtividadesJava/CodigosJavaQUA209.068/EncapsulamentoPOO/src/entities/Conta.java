package entities;

public class Conta {
	
	private String titular;
	private	String agencia;
	private int numeroConta;
	private double saldo;
	
	//get == obter
	public String getTitular() {
		return titular;
	}
	
	//set == atribui valor
	//this identifica o atributo da classe
	public void setTitular(String titular) {
		this.titular  = titular;
	}
	
	//atalho == alt + shift 
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	public void sacar(double valorSaque) {
		saldo -= valorSaque;
	}
	
	public void obterDadosBancarios() {
		System.out.println("Titular: " + titular);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Saldo: R$" + saldo);
	}

}
