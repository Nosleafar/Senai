package Principal;

import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);


int[][] matrizA = new int[3][3];
int[][] matrizB = new int[3][3];
int[][] matrizC = new int[3][3];

  
System.out.println("Digite os valores da matriz A (3x3):");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("Digite o valor para A[" + i + "][" + j + "]: ");
            matrizA[i][j] = scanner.nextInt();
    }
}

    
System.out.println("Digite os valores da matriz B (3x3):");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("Digite o valor para B[" + i + "][" + j + "]: ");
            matrizB[i][j] = scanner.nextInt();
     }
}


for (int i = 0; i < 3; i++) {
   for (int j = 0; j < 3; j++) {
      for (int k = 0; k < 3; k++) {
           matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
      }
   }
}


System.out.println("Matriz Resultante (C):");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrizC[i][j] + " ");
        }
    System.out.println();
}

    scanner.close();
}
}