package principal;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		   	//Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
			//at� 20 litros, desconto de 3% por litro �lcool
			//acima de 20 litros, desconto de 5% por litro

			//at� 20 litros, desconto de 4% por litro Gasolina
			//acima de 20 litros, desconto de 6% por litro

			//Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da
			//seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
			//que o pre�o do litro da gasolina � R$ 5,80 e o pre�o do litro do �lcool � R$ 3,90. 
				
		
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
					//valida��o para que o usu�rio n�o digite o combustivel inv�lido
					
					do {
					System.out.println("Alcool ou gas, meu patr�o?: ");
					tipoCombustivel = leia.next().charAt(0);
					}while(Character.toUpperCase(tipoCombustivel) != 'A' && Character.toUpperCase(tipoCombustivel) != 'G');
					
					//atualizar o valor da variavel para UpperCase, igual no bloco while
					tipoCombustivel = Character.toUpperCase(tipoCombustivel);
					
					//pedir a quantidade de litros abastecidos
					//validar a quantidade de litros, n�o pode ser zero e nem negativo
					
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
							System.out.println("J� manda logo na m�o, com aquele descontinho: " + totalAPagar);
					}else {
						totalAPagar = (quantidadeLitros * valorGasolina);
						totalAPagar = totalAPagar-(totalAPagar * 0.06);
						System.out.println("J� manda logo na m�o, com aquele descontinho: " + totalAPagar);	
							
						}
					}
					if(tipoCombustivel == 'A') {
						if(quantidadeLitros<=20) {
							totalAPagar = (quantidadeLitros * valorAlcool);
							totalAPagar = totalAPagar-(totalAPagar * 0.03);
							System.out.println("J� manda logo na m�o, com aquele descontinho: " + totalAPagar);
					}else {
						totalAPagar = (quantidadeLitros * valorAlcool);
						totalAPagar = totalAPagar-(totalAPagar * 0.05);
						System.out.println("J� manda logo na m�o, com aquele descontinho: " + totalAPagar);	
							
						}
					}
	}					

}
