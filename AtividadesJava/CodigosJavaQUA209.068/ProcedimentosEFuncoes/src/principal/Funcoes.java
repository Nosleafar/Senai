package principal;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Fun��es representam um processamento
		//ou processo;
		//O que identifica uma fun��o
		//s�o os parenteses;
		//System.out.println() � uma fun��o/procedimento;
		mostrarMensagem();
		mostrarMensagemComParametro(23);
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebeu: " + recebeCalcular);}
		
		
	static void mostrarMensagem() {
		System.out.println("Minha primeira fun��o");
	}

	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade �: " + idade);

	}

	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;
	}

	static int soma(int x, int y) {
		return x + y;
	}

}
