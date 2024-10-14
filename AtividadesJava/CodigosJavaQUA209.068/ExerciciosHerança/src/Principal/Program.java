package Principal;

import java.util.Scanner;
import entities.Dados;
import entities.Chefia;

public class Program {
    public static void main(String[] args) {

        Dados dados = new Chefia(); // Utilizando a subclasse Chefia
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do funcionário? ");
        dados.setFuncionario(sc.nextLine());
        System.out.println("Qual o cargo do funcionário? ");
        dados.setCargo(sc.nextLine().toUpperCase());
        System.out.println("Qual a idade do funcionário? ");
        dados.setIdade(sc.nextInt());
        System.out.println("Qual o salário do funcionário?");
        dados.setSalario(sc.nextDouble());

        dados.dadosFuncionario();
    }
}