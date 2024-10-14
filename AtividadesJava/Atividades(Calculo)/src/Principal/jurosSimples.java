package Principal;

import java.util.Scanner;

public class jurosSimples {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor principal: ");
        double principal = input.nextDouble();
        System.out.print("Digite a taxa de juros (em decimal): ");
        double taxaJuros = input.nextDouble();
        System.out.print("Digite o tempo (em anos): ");
        int tempoAnos = input.nextInt();

        input.close();

        double juros = principal * taxaJuros * tempoAnos;

 
        System.out.println("O valor dos juros simples é: " + juros);
    }
}