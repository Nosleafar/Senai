package principal;

import java.util.Scanner;

public class correcaoatividade {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			double altura = 0;
			double media = 0;
			
			for(int contador = 1; contador<11;contador++);{
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();
			media = media + altura;
			//media += altura;
			
			}
			System.out.println("A média das alturas é: " + (media/10));
			

		}
		
				

	}

}
