package principal;

import java.util.Scanner;
import entites.triangulo; //

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado 1: ");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o valor do lado 2: ");
        double lado2 = sc.nextDouble();
        System.out.println("Digite o valor do lado 3: ");
        double lado3 = sc.nextDouble();

        triangulo triangulo = new triangulo(lado1, lado2, lado3); 

        String tipoTriangulo = triangulo.determinarTipo(); 
        System.out.println("O triangulo é do tipo: " + tipoTriangulo);
    }
}