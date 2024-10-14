package principal;

import java.util.Scanner;

public class Operacoes6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double mes1;
		double mes2;
		double mes3;
		
		System.out.println("Qual o total gasto no primeiro mes? ");
		mes1 = leia.nextDouble();
		System.out.println("Qual o total gasto no segundo mes? ");
		mes2 = leia.nextDouble();
		System.out.println("Qual o total gasto no terceiro mes? ");
		mes3 = leia.nextDouble();
		
		
		double media1 = mes1 + mes2 + mes3;
		System.out.println("O valor total gasto no período é de: " + "R$" + media1);
		
		double media2 = media1/3;
		System.out.println("A media total do valor mensal, é de: " + "R$" + media2);
	}

}
