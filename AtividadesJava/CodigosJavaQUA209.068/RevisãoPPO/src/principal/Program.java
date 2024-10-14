package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Funcionario func = new Funcionario();
		
		System.out.println("Dados pesoais");
		pessoa.setNome("Rafaelson");
		pessoa.setAltura(1.80);
		pessoa.setCpf("000.000.000-00");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(23);
		
		System.out.println(pessoa + "\n");
		
		System.out.println("Dados do Empregado");
		func.setNome("Rafaelson");
		func.setAltura(1.80);
		func.setCpf("000.000.000-00");
		func.setGenero("Masculino");
		func.setIdade(23);
		func.setSalario(1378.00);
		func.setEmpresa("Profarma");
		
		System.out.println(func);
		
		int [] numeros = new int [5];
		int cont = 10;
		for(int i = 0; i <5; i++);{
			System.out.println("Digite sua altura: ");
			numeros [i] = cont++;
		}	
		for (int n : numeros) {
			System.out.println(n);
		}
	}

}