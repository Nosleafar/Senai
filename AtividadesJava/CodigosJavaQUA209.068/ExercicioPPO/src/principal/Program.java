package principal;

import java.util.Scanner;

import entities.Terreno;

public class Program {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Terreno terreno = new Terreno();
		
		System.out.print("Digite a largura do terreno: ");
		terreno.largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		terreno.comprimento = sc.nextDouble();
		
		terreno.areaTerreno();
		
		System.out.print("A área total do terreno, é de: " + terreno.area + " metros quadrados");
		

	}

}