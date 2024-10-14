package Principal;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o n�mero de termos da sequ�ncia de Fibonacci a ser gerada: ");
        int n = input.nextInt();

        input.close();

        for (int i = 0; i < n; i++) {
            int termo = fibonacci(i);
            System.out.print(termo + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}