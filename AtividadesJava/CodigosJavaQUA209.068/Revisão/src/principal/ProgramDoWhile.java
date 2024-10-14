package principal;

import java.util.Random;
import java.util.Scanner;

public class ProgramDoWhile {
	public static void main(String[]args) {
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numeroAleatorio = random.nextInt(100) +
		1;
		int tentativa, contadorTentativas = 0;

		do { System.out.print("Tente adivinhar o n�mero (entre 1 e 100): ");

		tentativa = scanner.nextInt();
		contadorTentativas++;

		if (tentativa < numeroAleatorio) {
			System.out.println("Tente um n�mero maior.");
		}else if (tentativa > 100) {
			System.out.println("Os n�meros s�o v�lidos apenas entre 0 e 100");	
		}else if (tentativa > numeroAleatorio) {
			System.out.println("Tente um n�mero menor.");
		} else {
			System.out.println("Parab�ns! Voc� acertou em " + contadorTentativas + " tentativas.");}

		} while (tentativa != numeroAleatorio);
		scanner.close();
	}
}