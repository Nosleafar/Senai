package Principal;

import entites.Pessoa;

public class pessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

    
        pessoa.setNome("João");
        pessoa.setIdade(30);
        pessoa.setEndereço("123 Main Street");


        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereço());
    }
}