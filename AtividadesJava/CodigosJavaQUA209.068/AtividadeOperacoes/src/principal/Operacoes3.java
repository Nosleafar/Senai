package principal;

import java.util.Scanner;

public class Operacoes3 {

	public static void main(String[] args) {
		//Fa�a um Programa que pergunte quanto voc� ganha
		//por hora e o n�mero de horas trabalhadas no m�s. 
		//Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos).

		Scanner leia = new Scanner (System.in);
		
		double salarioHora;
		double horasTrabalhadas;
		double totalSalario;
		
		System.out.println("Qual o seu salario por hora? ");
		salarioHora = leia.nextDouble();
		System.out.println("Quantas horas voce trabalhou esse m�s? ");
		horasTrabalhadas = leia.nextDouble();
		
		double media = horasTrabalhadas * salarioHora;
				
		System.out.println("Seu salario total � de: " + media);
	}

}
