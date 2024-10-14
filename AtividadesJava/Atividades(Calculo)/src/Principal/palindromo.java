package Principal;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        input.close();

        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        if (ehPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String palavra) {
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }
}
