package principal;

public class Variaveis {

	public static void main(String[] args) {

		int numero = 10;
		// numero = 10;
		double decimal = 10.50;

		// testeNumero = converte para numero inteiro
		int testeNumero = (int) 50.25;
		// double converte para numero decimal
		double testeNovoNumero = 10;

		// armazenar um conjunto de caracteres na variável nome
		// aspas duplas para strings
		String nome = "Rafaelson";
		// aspas simples para char
		char sexo = 'M';
		// booleanos = valores verdadeiros, ou falsos
		boolean verdadeiro = true;
		boolean falso = false;
		
		double peso = 100.00;
		int idade = 33;

		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(sexo);
		System.out.println(nome);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("Nome:");
		System.out.println(" Rafaelson M");
		
		//para organizar as linhas de código, pressionar CNTRL + Shift + F
		System.out.println ("******************");
		System.out.print("meu nome é: " + nome);
		System.out.print(", meu peso real é menos de: " + peso);
		System.out.println(", e em cerca de dez anos, chegarei à idade de: " + idade);

	}

}
