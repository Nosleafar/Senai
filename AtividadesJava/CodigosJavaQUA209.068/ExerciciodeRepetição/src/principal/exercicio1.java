package principal;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double nota = 0;
		
		
		System.out.println("Entre com uma nota entra 0 e 10: ");
		nota = sc.nextDouble();
		
		while(nota <= 0 || nota >=10) {
		System.out.println("Nota inválida. ");	
		
		System.out.println("Entre com uma nota entra 0 e 10: ");
		nota = sc.nextDouble();
		
		}
		
		System.out.println("Nota válida! Valor informado: " + nota);
		
		
		sc.close();
	}

}