package Principal;

import java.util.Scanner;

public class Inteiros {
public static void main(String[] args) {
	    	
Scanner scanner = new Scanner(System.in);

	       
int[] numeros = new int[10];

System.out.println("Digite 10 valores:");


for (int i = 0; i < 10; i++) {
System.out.print("Valor " + (i + 1) + ": ");
numeros[i] = scanner.nextInt();
	        }
int maiorValor = numeros[0]; 
 for (int i = 1; i < 10; i++) {
	if (numeros[i] > maiorValor) {
	   maiorValor = numeros[i];
	  }
}

System.out.println("O maior valor no array é: " + maiorValor);

scanner.close();
 }
}