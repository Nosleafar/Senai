package principal;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Fa�a um programa que receba um valor 
		//em real e converta para d�lares na cota��o 
		//atual; fa�a o inverso tamb�m;
		
		Scanner sc = new Scanner (System.in);
	
		double reais = 4.99;
		
		System.out.println("Digite o valor em Reais: ");
		double dolares = sc.nextDouble();
		System.out.printf("O valor de reais em dolares �: %.2f dolares", calculaDolar(dolares, reais));
	
		
		
	}
	static double calculaDolar(double reais,double dolares){
		return reais/dolares;		
	

	}

}
