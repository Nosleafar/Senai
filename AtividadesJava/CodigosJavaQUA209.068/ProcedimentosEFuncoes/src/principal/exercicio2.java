package principal;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

			//Fa�a um programa que receba um valor 
			//em real e converta para d�lares na cota��o 
			//atual; fa�a o inverso tamb�m;
			
			Scanner sc = new Scanner (System.in);
		
			double d�lar = 4.99;
			
			System.out.println("Digite o valor em D�lares: ");
			double reais = sc.nextDouble();
			System.out.printf("O valor de real em d�lar �: %.2f reais", calculaDolar(d�lar, reais));
		
			
			
		}
		static double calculaDolar(double reais,double dolares){
			return reais*dolares;		
		

		}

	}
