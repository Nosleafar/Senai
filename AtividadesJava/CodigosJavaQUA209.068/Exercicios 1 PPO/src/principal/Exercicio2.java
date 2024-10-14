package principal;

import java.util.Scanner;

import entities.Storage;

public class Exercicio2 {

	public static void main(String[] args) {
		//crie um programa de estoque, onde você poderá inserir um produto 
		//e a quantidade e mostrar o valor total do estoque da loja; use scanner
		
		Scanner sc = new Scanner(System.in);
		
		Storage estoque = new Storage();
		System.out.println("Qual produto?");
		estoque.setProduto(sc.nextLine());
		System.out.println("Qual a quantidade?");
		estoque.setQuantidade(sc.nextInt());
		
		estoque.quantidadeEstoque();
		
		
		
	}

}
