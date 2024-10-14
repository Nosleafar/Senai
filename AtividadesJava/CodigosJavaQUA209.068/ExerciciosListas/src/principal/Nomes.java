package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entities.pessoal;

public class Nomes {

    public static void main(String[] args) {

        ArrayList<pessoal> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite o nome da Pessoa " + i + ": ");
            String nome = sc.nextLine();
            pessoal pessoa = new pessoal();
            pessoa.setNome(nome);
            pessoas.add(pessoa);
        }

        Collections.sort(pessoas);

        for (pessoal pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}