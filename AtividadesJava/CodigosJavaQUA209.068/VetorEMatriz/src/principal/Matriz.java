package principal;

public class Matriz {

	public static void main(String[] args) {
		
		
		//Uma matriz é um vetor multidimensional
		//Geralmente, trabalhamos com duas dimensões
		//Linha e coluna, parece uma tabela
		
		//Os dois ultimos abre e fecha colchetes são
		//para indicar coluna e linha
		//No exemplo abaixo, temos uma matriz 3 x 3
		
		
		/*int[][] numeros = new int[3][3];
		
		int contador = 10;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				numeros [i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;
			}*/
			int[][] numeros = new int[3][3];
		
			System.out.print((numeros[0][0]=10) + "\t");
			System.out.print((numeros[0][1]=11) + "\t");
			System.out.print((numeros[0][2]=12) + "\t");
			System.out.println();
			System.out.print((numeros[1][0]=13) + "\t");
			System.out.print((numeros[1][1]=14) + "\t");
			System.out.print((numeros[1][2]=15) + "\t");
			System.out.println();
			System.out.print((numeros[2][0]=16) + "\t");
			System.out.print((numeros[2][1]=17) + "\t");
			System.out.print((numeros[2][2]=18) + "\t");
			System.out.println();
	}

}


