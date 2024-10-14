package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entities.produto;

public abstract class Produto implements Comparable <Produto>{
	public static void main (String [] args) {
	
		
		produto produto;
		Scanner sc = new Scanner (System.in);
		ArrayList<produto> produtos = new ArrayList<>();
		
		
		for (int i = 1; i <4; i++) {
		produto = new produto();
		
		System.out.println("Digite o produto: ");
		produto.setNome(sc.nextLine());
		
		System.out.println("Digite a quantidade: ");
		produto.setQuantidade(sc.nextInt());
		
		System.out.println("Digite o preço: ");
		produto.setPreço(sc.nextDouble());
		sc.nextLine();
		
		produtos.add(produto);
		}
		
	
		System.out.println(produtos);
	}
}
