package Principal;

import entites.Pessoa;

public class pessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

    
        pessoa.setNome("Jo�o");
        pessoa.setIdade(30);
        pessoa.setEndere�o("123 Main Street");


        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endere�o: " + pessoa.getEndere�o());
    }
}