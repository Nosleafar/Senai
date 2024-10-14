package principal;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Faça um programa que receba um valor 
		//em real e converta para dólares na cotação 
		//atual; faça o inverso também;
		
		Scanner sc = new Scanner (System.in);
	
		double reais = 4.99;
		
		System.out.println("Digite o valor em Reais: ");
		double dolares = sc.nextDouble();
		System.out.printf("O valor de reais em dolares é: %.2f dolares", calculaDolar(dolares, reais));
	
		
		
	}
	static double calculaDolar(double reais,double dolares){
		return reais/dolares;		
	

	}

}
