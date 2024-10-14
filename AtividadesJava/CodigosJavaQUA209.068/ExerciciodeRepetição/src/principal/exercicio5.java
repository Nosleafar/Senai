package principal;

import java.util.Scanner;


public class exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] alturas = new double[10];
        
        for (int contador = 0; contador < 10; contador++) {
            System.out.print("Digite a altura da pessoa " + (contador+1) + ": ");
            alturas[contador] = scanner.nextDouble();
        }
        
        double somaAlturas = 0;
        for (double altura : alturas) {
            somaAlturas += altura;
        }
        
        double media = somaAlturas / 10;
        
        System.out.printf("A média das alturas é: %.2f%n", media);
    }
}