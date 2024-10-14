package principal;

import java.util.Scanner;
			
				
		//Faça um programa que receba o salario e a quantidade de venda total que o vendedor fez
		//no mes, e calcule o salario do mês. Há também o desconto de 5% de inss e 11% de IRPF
		//sobre o salario bruto.

		//Se o vendedor possui o total de venda acima de 20 mil no mês, ele recebe uma bonificação
		//de 5% sobre o valor das vendas;

		//Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonificação de
		//3% no valor da venda;

		//Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonificação de
		//1% no valor da venda;

		//Se o valor não passar de 10 mil, imprima uma frase motivacional;


public class exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite a quantidade de vendas total no mês: ");
        double vendasTotal = scanner.nextDouble();

        double bonificacao = 0;
        if (vendasTotal > 20000) {
            bonificacao = vendasTotal * 0.05;
        } else if (vendasTotal >= 15000 && vendasTotal <= 20000) {
            bonificacao = vendasTotal * 0.03;
        } else if (vendasTotal >= 10000 && vendasTotal < 15000) {
            bonificacao = vendasTotal * 0.01;
        } else {
            System.out.println("Pedras no caminho, " + nome + "? Guarde todas, um dia você poderá construir um Castelo!");
        }

        double salarioBruto = salarioBase + bonificacao;
        double inss = salarioBruto * 0.05;
        double irpf = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - inss - irpf;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + inss);
        System.out.println("Desconto IRPF: " + irpf);
        System.out.println("O salário de " + nome + " foi de " + "R$" + salarioLiquido );

        scanner.close();
    }
}