package principal;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		//Faça um programa que receba o nome do aluno e as 
		//4 notas bimestrais desse aluno, 
		//mostre a media e se foi aprovado (>=7) ou reprovado(<7);
		
		Scanner sc = new Scanner (System.in);

		double[]notas = new double[4];
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		
		for (int contador = 0; contador<notas.length; contador ++) {
		System.out.println("Digite uma nota:");	
		notas[contador]=sc.nextDouble();
		}
		double media = (notas[0] + notas [1] + notas [2] + notas [3]) /4;
		
		if (media>=7){
			System.out.print("Ele(a) foi aprovado(a), ");}
		if (media<7) {
			System.out.print("Ele(a) foi reprovado(a), ");
		}
		
		System.out.printf("a média do %s é: %.2f", nome, media);
		sc.close();
		
		
	}

}
