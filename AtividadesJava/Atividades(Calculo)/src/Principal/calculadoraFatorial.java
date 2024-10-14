package Principal;

import java.util.Scanner;

public class calculadoraFatorial {
    public static void main(String[] args) {
    	
       
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um n�mero inteiro: ");
        int numero = input.nextInt();
 
        if (numero < 0) {
            System.out.println("O fatorial n�o est� definido para n�meros negativos.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " � " + fatorial);
        }
    }
    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}