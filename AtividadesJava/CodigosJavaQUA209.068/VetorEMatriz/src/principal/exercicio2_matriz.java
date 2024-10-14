package principal;

import java.util.Scanner;

public class exercicio2_matriz {

	public static void main(String[] args) {
		//Fazer uma matriz 4x4 para inserir nome e as 4 notas
		//do aluno, não precisa mostrar a media, imprima o nome e as notas
		
		Scanner sc = new Scanner (System.in);
		
			String[][]alunos = new String[4][5];
			
			/*alunos [0][0] = "Rafaelson";
			alunos [0][1]="10";
			alunos [0][2]="6,5";
			alunos [0][3]="2,5";
			alunos [0][4]="9,0";
			
			
			alunos [1][0] = "Marcos";
			alunos [1][1]="10";
			alunos [1][2]="6";
			alunos [1][3]="2";
			alunos [1][4]="5";
			
			
			alunos [2][0] = "Maria";
			alunos [2][1]="10";
			alunos [2][2]="7,5";
			alunos [2][3]="1,5";
			alunos [2][4]="9,0";
			
			
			alunos [3][0] = "José";
			alunos [3][1]="5";
			alunos [3][2]="6,9";
			alunos [3][3]="2,7";
			alunos [3][4]="1";
			
			alunos [4][0] = "Antônio";
			alunos [4][1]="4";
			alunos [4][2]="0,9";
			alunos [4][3]="2,7";
			alunos [4][4]="1";*/
				
			for (int i = 0; i <alunos.length; i++) {
				for (int j = 0; j<alunos[i].length;j++) {
					if(j == 0) {
						System.out.println("Digite o nome do aluno: ");
							alunos[i][j] = sc.nextLine();
					}else {
						System.out.printf("Digite %d nota: ", (j));
						alunos[i][j] = sc.nextLine();
					}
				}
				System.out.println();
			}
			for (int i = 0; i <alunos.length; i++) {
				for (int j = 0; j <alunos[i].length; j++) {
					System.out.println(alunos[i][j] + "\t");
				}
				System.out.println();
			}
			
	}
}
		