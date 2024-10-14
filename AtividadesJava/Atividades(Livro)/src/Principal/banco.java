package Principal;

import entites.Banco;

public class banco {


public static void main(String[] args) {
    Banco minhaConta = new Banco();

    minhaConta.depositar(1000.0);
    minhaConta.sacar(500.0);

    System.out.println("Saldo atual: " + minhaConta.verificarSaldo());
}
}