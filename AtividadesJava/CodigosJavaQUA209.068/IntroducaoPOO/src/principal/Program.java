package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		
		//Conceito de carros	
		//Caracteristicas (atributos)
		//Comportamentos (m�todos/fun��o):
		//Acelerar, frear, acender far�is
		
		//Classes t�m muitos recursos como:
		//Sobrecarga de m�todos e cosntrutores
		//4 pilares podem ser aplicados
		
		//entities(entidades do sistema) de acordo com a modelagem de neg�cios: Carro, Pessoa, Endere�o
		//services: ClienteServices, E-mail services..
		//controllers
		//utilitarias: Math
		//Classe � um molde para o objeto
		
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
