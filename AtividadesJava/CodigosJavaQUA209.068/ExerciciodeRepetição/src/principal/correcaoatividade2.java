package principal;

import java.util.Scanner;

public class correcaoatividade2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		char operacao;
		int numero = 0;

		System.out.println("Qual o tipo de operação (+,-,/,*)");
		operacao = leia.next().charAt(0);

		System.out.println("Qual o numero que deseja a tabuada: ");
		numero = leia.nextInt();

		switch (operacao) {
		case '+':
			for (int contador = 1; contador <= 10; contador++) {
				System.out.println(numero + "+" + contador + "=" + (contador + numero));
			}
			break;

		case '-':
			int aux = numero;
			for (int contador = 1; contador <= 10; contador++) {
				System.out.println((aux + contador) + "-" + numero + "=" + ((contador + aux) - numero));
			}

			break;

		case '*':
			for (int contador = 1; contador <= 10; contador++) {
				System.out.println(numero + "*" + contador + "=" + (contador * numero));
			}

			break;

		case '/':
			for (int contador = 1; contador <= 10; contador++) {
				System.out.println((numero * contador) + "/" + numero + "=" + (numero * contador / numero));
			}
			default:
				System.out.println("Operação Inválida");
			break;

		}
	}
}
