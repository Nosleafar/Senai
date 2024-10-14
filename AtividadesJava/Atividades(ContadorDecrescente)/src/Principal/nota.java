package Principal;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (0 a 100): ");

        int nota = scanner.nextInt();

        scanner.close();

        if (nota >= 70) {
            System.out.println("Aprovado");
        } else if (nota >= 40) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}