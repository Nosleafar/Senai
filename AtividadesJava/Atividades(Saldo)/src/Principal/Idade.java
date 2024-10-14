package Principal;

import java.util.Scanner;

public class Idade {


				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Digite a idade em anos: ");
						int anos = sc.nextInt();
					System.out.println("Digite a idade em meses: ");
						int meses = sc.nextInt();
					System.out.println("Digite a idade em dias: ");
						int dias = sc.nextInt();
					System.out.println("A quantidade de anos dessa pessoa em dias, é de: " + ((anos * 365)+(meses*30)+dias) + " dias");


	}

}
