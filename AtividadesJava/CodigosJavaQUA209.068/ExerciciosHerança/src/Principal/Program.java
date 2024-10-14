package Principal;

import java.util.Scanner;
import entities.Dados;
import entities.Chefia;

public class Program {
    public static void main(String[] args) {

        Dados dados = new Chefia(); // Utilizando a subclasse Chefia
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do funcion�rio? ");
        dados.setFuncionario(sc.nextLine());
        System.out.println("Qual o cargo do funcion�rio? ");
        dados.setCargo(sc.nextLine().toUpperCase());
        System.out.println("Qual a idade do funcion�rio? ");
        dados.setIdade(sc.nextInt());
        System.out.println("Qual o sal�rio do funcion�rio?");
        dados.setSalario(sc.nextDouble());

        dados.dadosFuncionario();
    }
}