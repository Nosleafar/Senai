package entites;

	public class Banco {
	    private String nomeDoTitular;
	    private double saldo;
	    private int numeroDaConta;

	    public Banco() {
	        this.nomeDoTitular = nomeDoTitular;
	        this.numeroDaConta = numeroDaConta;
	        this.saldo = 0.0;
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito de " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Valor de depósito inválido.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque de " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saldo insuficiente ou valor de saque inválido.");
	        }
	    }

	    public double verificarSaldo() {
	        return saldo;
	 }
}