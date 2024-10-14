package Principal;

public class contaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public contaBancaria(String nomeTitular, int numeroConta, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }

    public static void main(String[] args) {
   
        contaBancaria conta1 = new contaBancaria("João", 12345, 1000.0);
        contaBancaria conta2 = new contaBancaria("Maria", 67890, 500.0);

        conta1.exibirSaldo();
        conta1.depositar(200.0);
        conta1.sacar(300.0);
        conta1.exibirSaldo();

        conta2.exibirSaldo();
        conta2.depositar(100.0);
        conta2.sacar(700.0);
        conta2.exibirSaldo();
    }
}