package principal;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais para ser convertido para d�lares:");
		double real = sc.nextDouble();
		
		System.out.printf("O valor em dolar �: %.2f \n \n", converterParaDolar(real));
		
		System.out.println("Digite o valor em d�lar para ser convertido para reais:");
		double dolar = sc.nextDouble();
		
		System.out.printf("O valor em reais �: %.2f", converterParaReal(dolar));
		

	}
	static double converterParaDolar(double real) {
		return real/4.99;
	}
	static double converterParaReal(double dolar) {
		return dolar*4.99;
			
		}

}
