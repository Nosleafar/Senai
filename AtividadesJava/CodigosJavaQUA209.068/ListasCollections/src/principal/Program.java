package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Listas trabalham com dados do mesmo tipo
		//uma lista é um tipo genérico de uma collection
		//uma lista é uma coleção de dados
		
		ArrayList<String> nomes = new ArrayList<>();
		
		String nome1 = "Adicionado por ultimo";
		
		nomes.add("Rafaelson");
		nomes.add("Julia");
		nomes.add("Maria");
		nomes.add("João");
		nomes.add(nome1);
		
		System.out.println(nomes);
		
		System.out.println(nomes.get(3) + " e " + nomes.get(2));
		
		nomes.remove(1);
		
		System.out.println(nomes);
		
		
		System.out.println("Imprimindo com forEach: ");
		for(String nome : nomes) {
			System.out.println(nome);
		}
			
		System.out.println("Imprimindo com for: ");
		for (int i = 0; i < nomes.size(); i ++){
			System.out.println(nomes.get(i));
			
		}
		System.out.println("Imprimindo com expressão lambda: ");
		
		//pesquisar sobre expressão lambda
		nomes.forEach(nome -> System.out.println(nome));
		System.out.println("Imprimindo odenadamente: ");
		Collections.sort(nomes);
		
		nomes.forEach(nome -> System.out.println(nome));
		
	}
}


