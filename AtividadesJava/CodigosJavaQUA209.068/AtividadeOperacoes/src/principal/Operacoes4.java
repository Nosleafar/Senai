package principal;

import java.util.Scanner;

public class Operacoes4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//Faça um Programa que peça a temperatura em graus Fahrenheit, 
		//transforme e mostre a temperatura em graus Celsius.
		//C = 5 * ((F-32) / 9).
        
		int Fahrenheit;
		int Celsius;
		
		System.out.println("Qual a temperatura em Fahrenheit?  ");
		Fahrenheit = leia.nextInt();
		
		double media = 5*((Fahrenheit-32)/9);
		System.out.println("O total de Graus, em Celsius é de: " + media + "°C");
		
		
	}

}

		