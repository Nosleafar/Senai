package principal;

import java.util.Scanner;

public class Operacoes5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//Faça um Programa que peça a temperatura em graus Celsius, 
		//transforme e mostre a temperatura em graus Fahrenheit.
		//C = 5 * ((F-32) / 9).
        
		int F;
		int C;
		
		System.out.println("Qual a temperatura em Celsius?  ");
		C = leia.nextInt();
		
		double media = (C*9/5) + 32;
		System.out.println("O total de Graus, em Fahreneit é de: " + media + "°F");
		
		
	}

}

		