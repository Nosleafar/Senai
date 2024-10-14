package principal;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		   	//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
			//até 20 litros, desconto de 3% por litro Álcool
			//acima de 20 litros, desconto de 5% por litro

			//até 20 litros, desconto de 4% por litro Gasolina
			//acima de 20 litros, desconto de 6% por litro

			//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
			//seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
			//que o preço do litro da gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90. 
				
		
					//criar variaveis para reeber os valores dos combustiveis
					double valorGasolina = 5.80;
					double valorAlcool = 3.90;
					
					//criar variavel para receber quantidade de litros
					double quantidadeLitros = 0;
					
					//variavel para receber qual o tipo do combustivel
					char tipoCombustivel; 
					
					//variavel total a pagar com o desconto
					
					double totalAPagar = 0;
					
					//pedir para o usuario digitar a quantidade de litros
					//qual o tipo de combustivel, para saber o valor total a ser pago
					//validação para que o usuário não digite o combustivel inválido
					
					do {
					System.out.println("Alcool ou gas, meu patrão?: ");
					tipoCombustivel = leia.next().charAt(0);
					}while(Character.toUpperCase(tipoCombustivel) != 'A' && Character.toUpperCase(tipoCombustivel) != 'G');
					
					//atualizar o valor da variavel para UpperCase, igual no bloco while
					tipoCombustivel = Character.toUpperCase(tipoCombustivel);
					
					//pedir a quantidade de litros abastecidos
					//validar a quantidade de litros, não pode ser zero e nem negativo
					
					do {
					System.out.println("Quantos litros, meu bacana?");
					quantidadeLitros = leia.nextDouble();
					}while(quantidadeLitros<=0);
					
					//fazer o calculo do desconto com base na quantidade de litros
					//que foi abastecido e o tipo do combustivel
					
					if(tipoCombustivel == 'G') {
						if(quantidadeLitros<=20) {
							totalAPagar = (quantidadeLitros * valorGasolina);
							totalAPagar = totalAPagar-(totalAPagar * 0.04);
							System.out.println("Já manda logo na mão, com aquele descontinho: " + totalAPagar);
					}else {
						totalAPagar = (quantidadeLitros * valorGasolina);
						totalAPagar = totalAPagar-(totalAPagar * 0.06);
						System.out.println("Já manda logo na mão, com aquele descontinho: " + totalAPagar);	
							
						}
					}
					if(tipoCombustivel == 'A') {
						if(quantidadeLitros<=20) {
							totalAPagar = (quantidadeLitros * valorAlcool);
							totalAPagar = totalAPagar-(totalAPagar * 0.03);
							System.out.println("Já manda logo na mão, com aquele descontinho: " + totalAPagar);
					}else {
						totalAPagar = (quantidadeLitros * valorAlcool);
						totalAPagar = totalAPagar-(totalAPagar * 0.05);
						System.out.println("Já manda logo na mão, com aquele descontinho: " + totalAPagar);	
							
						}
					}
	}					

}
