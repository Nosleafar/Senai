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
		
		System.out.println("Digite o nome do funcion�rio: ");
		nome = sc.nextLine();
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salarioBruto = sc.nextDouble();
		System.out.println("Digite o tota de vendas no m�s: ");
		totalVendas = sc.nextDouble();
		
		
		
		double descontos = calcularDescontos(salarioBruto, inss, irpf);
		double comissao = calcularComissao(totalVendas);
		double salarioLiquido = salarioBruto - descontos + comissao;
		System.out.println("*************************************");
		System.out.println("Funcionario: " + nome);
		System.out.println("Salario Bruto: R$" + salarioBruto);
		System.out.println("Total de vendas do m�s: R$" + totalVendas);
		System.out.println("Descontos do m�s: R$" + descontos);		
		System.out.println("Comiss�o do m�s: R$" + comissao);
		System.out.println("Salario do m�s: R$" + salarioLiquido);
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


