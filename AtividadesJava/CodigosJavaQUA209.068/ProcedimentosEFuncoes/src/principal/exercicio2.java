package principal;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

			//Faça um programa que receba um valor 
			//em real e converta para dólares na cotação 
			//atual; faça o inverso também;
			
			Scanner sc = new Scanner (System.in);
		
			double dólar = 4.99;
			
			System.out.println("Digite o valor em Dólares: ");
			double reais = sc.nextDouble();
			System.out.printf("O valor de real em dólar é: %.2f reais", calculaDolar(dólar, reais));
		
			
			
		}
		static double calculaDolar(double reais,double dolares){
			return reais*dolares;		
		

		}

	}
