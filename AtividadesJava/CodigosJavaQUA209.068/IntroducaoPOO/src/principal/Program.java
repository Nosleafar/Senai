package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		
		//Conceito de carros	
		//Caracteristicas (atributos)
		//Comportamentos (métodos/função):
		//Acelerar, frear, acender faróis
		
		//Classes têm muitos recursos como:
		//Sobrecarga de métodos e cosntrutores
		//4 pilares podem ser aplicados
		
		//entities(entidades do sistema) de acordo com a modelagem de negócios: Carro, Pessoa, Endereço
		//services: ClienteServices, E-mail services..
		//controllers
		//utilitarias: Math
		//Classe é um molde para o objeto
		
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		Carro carroPopular = new Carro();
		
		carro.modelo = "Celta";
		carro.ano = "2010";
		carro.placa = "XPT-2023";
		carro.cor = "azul";
		
		carroPopular.modelo = "Gol";
		carroPopular.cor = "Vermelho";
		
		/*carroPopular.ano = sc.nextLine();
	
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);*/
		
		System.out.println(carro.acelerar);
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.acelerar);	
		carro.acelerar = 10;
		
		System.out.println(carro.acelerar);
		
		

	}

}
