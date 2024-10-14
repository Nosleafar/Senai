package principal;

import java.util.Scanner;

public class exercicio1_matriz {

	public static void main(String[] args) {
		
		//Fazer uma matriz 3x3 ou 4x4, imprimir os numeros
		//da diagonal dessa matriz

		Scanner sc = new Scanner(System.in);
		
		
		
		int matriz [][] = new int [3][3];
		int contador = 1;
			for (int i = 0;i <matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++){
				 matriz [i][j]= contador;
			System.out.print(matriz[i][j] + "\t");
			contador++;
			}
			System.out.println("\n");


}	
System.out.print("Os números na diagonal são: \n  \n");

System.out.print((matriz [0][0]));
System.out.println("\n");
System.out.print("\t"+(matriz [1][1]));
System.out.println("\n");
System.out.print("\t" + "\t" + (matriz [2][2]));
	
	
	}
}


/*				
	
		int matriz [][] = new int [3][3];
		int contador = 1;
				for (int i = 0; i<matriz.length; i++) {
					for(int j = 0; j<matriz.length; j++) {
				if (i == j) {
								 System.out.print(contador);
						}else{
								 System.out.print("\t");
				}
							contador++;
				}
				System.out.println();
				}
	}

}
*/
