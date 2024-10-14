package principal;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
			
		/*uma estrutura de repeti��o
		 * repete determinado bloco de codigo
		 * enquanto uma condi��o for satisfeita
		 */
		
		//for = at�; utilizado quando sabemos a quantidade
		// de vezes que ser� necess�rio repetir o bloco
		
		for(int contador = 0; contador < 10; contador++) {
//		System.out.println("Contador est� valendo: " + contador);
		}
		
		
		/*while = enquanto
		 * geralmente usado quando n�o sabemos a quantidade
		 * de vezes que ser� executadp determinado comando
		 */
		
		int contador = 0;
		char opcao;
		
		System.out.println("Deseja entrar no loop s/n");
		opcao = leia.next().charAt(0);
		
		
		while(opcao == 's') {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar o loop s/n");
			opcao = leia.next().charAt(0);
		}
		
		/*do while = fa�a enquanto
		 * executa pelo menos uma vez, temos a garantia
		 * de que ser� executado ao menos uma vez
		 */
		
		
		
		do {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar no loop s/n");
			opcao = leia.next().charAt(0);
		}while(opcao == 's');
		
		
		
			leia.close();
		}

	}


