package Principal;

import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = input.nextInt();
        input.close();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}