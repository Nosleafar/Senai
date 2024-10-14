package principal;

import java.util.Scanner;

public class ContraCheque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioBruto = 0;
		double totalVendas = 0;
		double inss = 0.05;
		double irpf = 0.11;
		
		System.out.println("Digite o nome do funcionário: ");
		nome = sc.nextLine();
		System.out.println("Digite o salário do funcionário: ");
		salarioBruto = sc.nextDouble();
		System.out.println("Digite o tota de vendas no mês: ");
		totalVendas = sc.nextDouble();
		
		
		
		double descontos = calcularDescontos(salarioBruto, inss, irpf);
		double comissao = calcularComissao(totalVendas);
		double salarioLiquido = salarioBruto - descontos + comissao;
		System.out.println("*************************************");
		System.out.println("Funcionario: " + nome);
		System.out.println("Salario Bruto: R$" + salarioBruto);
		System.out.println("Total de vendas do mês: R$" + totalVendas);
		System.out.println("Descontos do mês: R$" + descontos);		
		System.out.println("Comissão do mês: R$" + comissao);
		System.out.println("Salario do mês: R$" + salarioLiquido);
		if (totalVendas<10000) {
			System.out.println("Continue tentando!");
		}
		System.out.println("*************************************");
		
		
		
		sc.close();
		
	}
	static double calcularDescontos(double salarioB, double inss, double irpf) {
		return(salarioB * inss ) + (salarioB * irpf);
	}
	static double calcularComissao(double totalVendas) {
		double bonificacao = 0;
		
		if (totalVendas>20000) {
			bonificacao = totalVendas * 0.05;
		}else if(totalVendas>15000){
			bonificacao = totalVendas *0.03;
		}else if(totalVendas>10000) {
			bonificacao = totalVendas*0.01;
		}else {
			bonificacao=0;
		
		}
		return bonificacao;

	}
}


