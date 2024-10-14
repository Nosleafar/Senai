package principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		conta.setTitular("Rafaelson");
		conta.setAgencia(123456);
		conta.setNumeroConta(8895);
		conta.depositar(150.0);
		conta.sacar(50.0);
		
		conta.obterDadosBancarios();
		
		System.out.println("Conta corrente: ");
		
		cc.setTitular("Rafaelson");
		cc.setAgencia(123456);
		cc.setNumeroConta(8899);
		cc.depositar(550.0);
		cc.sacar(100.0);
		
		cc.obterDadosBancarios();
		
		System.out.println("Conta Poupança: ");
		cp.setTitular("Rafaelson");
		cp.setAgencia(123456);
		cp.setNumeroConta(8899);
		cp.depositar(1000.0);
		cp.sacar(200.0);
		
		cp.obterDadosBancarios();
		

	}

}