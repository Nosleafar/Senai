package principal;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int algoritmo1, algoritmo2;
        
        do {
            System.out.print("Digite o primeiro algoritmo: ");
            algoritmo1 = sc.nextInt();
        } while (algoritmo1 == 0);
        
        do {
            System.out.print("Digite o segundo algoritmo: ");
            algoritmo2 = sc.nextInt();
        } while (algoritmo2 == 0);
        
        System.out.println("Algoritmo 1: " + algoritmo1);
        System.out.println("Algoritmo 2: " + algoritmo2);
        
        sc.close();
    }
}