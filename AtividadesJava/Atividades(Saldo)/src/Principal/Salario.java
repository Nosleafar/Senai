package Principal;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salarioMinimo = 1420;
        System.out.print("Informe o valor do salário do usuário (R$): ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salário(s) minimo(s)." + "fazuEli");

        scanner.close();
    }
}