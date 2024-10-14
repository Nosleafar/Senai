package principal;

import java.util.Scanner;

public class CalcularMetroQuadrado {

	public static void main(String[] args) {
		//Crie um programa que receba os valores
		//de largura e comprimento do terreno
		//e informe quantos metros quadrados ele tem;
		//Ultilize função.
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento");
		double comprimento = sc.nextDouble();
		System.out.printf("O terreno tem: %.2f metros quadrados", calculaAreaTerreno(largura, comprimento));
	
		
		
	}
	static double calculaAreaTerreno(double largura, double comprimento){
		return largura*comprimento;		
	

	}

}
