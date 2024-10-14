package principal;

import entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Rafaelson");
        pessoa.setIdade(23);

        pessoa.imprimeDados();
    }
}