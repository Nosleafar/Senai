package principal;

import java.util.Scanner;
			
				
		//Fa�a um programa que receba o salario e a quantidade de venda total que o vendedor fez
		//no mes, e calcule o salario do m�s. H� tamb�m o desconto de 5% de inss e 11% de IRPF
		//sobre o salario bruto.

		//Se o vendedor possui o total de venda acima de 20 mil no m�s, ele recebe uma bonifica��o
		//de 5% sobre o valor das vendas;

		//Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonifica��o de
		//3% no valor da venda;

		//Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonifica��o de
		//1% no valor da venda;

		//Se o valor n�o passar de 10 mil, imprima uma frase motivacional;


public class exerc�cio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcion�rio: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o sal�rio base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite a quantidade de vendas total no m�s: ");
        double vendasTotal = scanner.nextDouble();

        double bonificacao = 0;
        if (vendasTotal > 20000) {
            bonificacao = vendasTotal * 0.05;
        } else if (vendasTotal >= 15000 && vendasTotal <= 20000) {
            bonificacao = vendasTotal * 0.03;
        } else if (vendasTotal >= 10000 && vendasTotal < 15000) {
            bonificacao = vendasTotal * 0.01;
        } else {
            System.out.println("Pedras no caminho, " + nome + "? Guarde todas, um dia voc� poder� construir um Castelo!");
        }

        double salarioBruto = salarioBase + bonificacao;
        double inss = salarioBruto * 0.05;
        double irpf = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - inss - irpf;

        System.out.println("Sal�rio Bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + inss);
        System.out.println("Desconto IRPF: " + irpf);
        System.out.println("O sal�rio de " + nome + " foi de " + "R$" + salarioLiquido );

        scanner.close();
    }
}