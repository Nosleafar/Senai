package principal;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais para ser convertido para dólares:");
		double real = sc.nextDouble();
		
		System.out.printf("O valor em dolar é: %.2f \n \n", converterParaDolar(real));
		
		System.out.println("Digite o valor em dólar para ser convertido para reais:");
		double dolar = sc.nextDouble();
		
		System.out.printf("O valor em reais é: %.2f", converterParaReal(dolar));
		

	}
	static double converterParaDolar(double real) {
		return real/4.99;
	}
	static double converterParaReal(double dolar) {
		return dolar*4.99;
			
		}

}
