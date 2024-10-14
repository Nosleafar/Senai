package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Du", 23);
		Pessoa pessoa2 = new Pessoa("Dudu", 22);
		Pessoa pessoa3 = new Pessoa("Edu", 26);
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas);
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
		
		System.out.println(pessoas);
		
	}

}
