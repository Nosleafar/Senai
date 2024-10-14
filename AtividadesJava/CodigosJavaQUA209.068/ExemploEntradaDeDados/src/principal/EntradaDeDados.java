package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
	   Scanner leia = new Scanner (System.in);
	   
	   String nome;
	   int idade;
	   double altura;
	   char sexo;
	   
	   System.out.println("Por favor, digite seu nome; ");
	   //leitura de dados tipo String (conjunto de caracteres)
	   nome = leia.nextLine();
	   //leitura de dados tipo Int (conjunto inteiros)
	   System.out.println("Digite a sua idade: ");
	   idade = leia.nextInt ();
	   //leitura de dados tipo Double (conjuntos reais)
	   System.out.println("Digite a sua altura: ");
	   altura = leia.nextDouble();
	   //leitura de dados tipo char (carater unico)
	   System.out.println("Qual o sexo (m/f): ");
	   sexo = leia.next().charAt(0);
	   
	   
	   System.out.println("\nO nome digitado foi: " + nome);
	   System.out.println("A idade digitada foi: " + idade);
	   System.out.println("A altura digitada foi: " + altura);
	   System.out.println("O sexo digitado foi: " + sexo);
	   
	   
	   leia.close();

	}

}
