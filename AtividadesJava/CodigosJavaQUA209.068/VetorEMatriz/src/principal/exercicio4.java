package principal;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
		//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o nome do primeiro time: ");
		String time1 = sc.nextLine();
		
		System.out.println("Digite o nome do segunto time: ");
		String time2 = sc.nextLine();
		
		System.out.println("Quantos gols " + time1 + " marcou? ");
		int gol1 = sc.nextInt();
		
		System.out.println("Quantos gols " + time2 + " marcou? ");
		int gol2 = sc.nextInt();
		
		int maior = gol1;
		
		if (gol2>maior) {
			maior = gol2;
		System.out.println("O " + time2 + " foi o vencedor da partida.");
		
		}else if(maior>gol2) {
			maior = maior;
		System.out.println("O " + time1 + " foi o vencedor da partida.");
			
		}else {
			System.out.println("A partida terminou empatada.");
			
		
		
		}
		
		
	}

}
