package principal;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		//um vetor de 20 posições
		//mostrar os numeros inseridos
		//somar os numeros inseridos
		
		Scanner leia = new Scanner (System.in);
		
		
		int[]numeros = new int[20];
		int soma = 0;
		
		//i = iterador, mesmo que contador
		for (int i = 0; i< numeros.length; i++) {
			System.out.println("Entre com o numero: ");
			numeros[i] = leia.nextInt();
			while(numeros[i]<0) {
				System.out.println("Numero inválido. ");
				System.out.println("Entre com o numero: ");
				numeros[i] = leia.nextInt();}
			
			soma += numeros[i];			
		}
		System.out.println("A soma dos numeros: " + soma);
		
		System.out.println("Numeros digitados: ");
		
		for(int numero : numeros) {
			System.out.println(numero);
		}

	}

}
