package principal;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.setTitular("Rafaelson");
		//System.out.println("Nome do titular: " + conta.getTitular());
		
		conta.setAgencia("2561-X");
		conta.setNumeroConta(6610);
		//conta.setSaldo(30.00); não funciona mais
		
		conta.depositar(300.00);
		
		conta.obterDadosBancarios();

		conta.sacar(500.00);
		
		conta.obterDadosBancarios();
		
		//conta.saldo = 500.00;
		
		conta.obterDadosBancarios();
		

	}

}
