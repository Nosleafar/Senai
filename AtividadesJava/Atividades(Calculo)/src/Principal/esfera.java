package Principal;

import java.util.Scanner;

public class esfera {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Digite o raio da esfera: ");
        double raio = input.nextDouble();

        input.close();


        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

    
        System.out.println("O volume da esfera é: " + volume);
    }
}