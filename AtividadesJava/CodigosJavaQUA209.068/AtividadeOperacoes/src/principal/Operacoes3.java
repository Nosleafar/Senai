package principal;

import java.util.Scanner;

public class Operacoes3 {

	public static void main(String[] args) {
		//Faça um Programa que pergunte quanto você ganha
		//por hora e o número de horas trabalhadas no mês. 
		//Calcule e mostre o total do seu salário no referido mês (sem descontos e impostos).

		Scanner leia = new Scanner (System.in);
		
		double salarioHora;
		double horasTrabalhadas;
		double totalSalario;
		
		System.out.println("Qual o seu salario por hora? ");
		salarioHora = leia.nextDouble();
		System.out.println("Quantas horas voce trabalhou esse mês? ");
		horasTrabalhadas = leia.nextDouble();
		
		double media = horasTrabalhadas * salarioHora;
				
		System.out.println("Seu salario total é de: " + media);
	}

}
