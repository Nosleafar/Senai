package principal;

public class Vetor {

	public static void main(String[] args) {
		
		//Vetor � uma sequencia n�o ordenada de dados do mesmo tipo
		//a contagem do Vetor � por indice e inicia do indice 0
		//Vetor n�o pode conter dados de tipos diferentes
		//Vetor tambem � conhecido como Array
		//Vetor � unidimensional, uma dire��o
		//os dados do array s�o armazenados em um espa�o de memoria
		
		/*(xpto123) = 10 , 20, 30, 40
		 */
		int array = 5;
		String nome = "Rafaelson";
		
		int [] numeros = new int[array];
		numeros [0] = 10;
		numeros [1] = 20;
		numeros [2] = 30;
		numeros [3] = 40;
		numeros [4] = 50;
		
		System.out.println(numeros[0]);
		for(int contador = 0; contador<numeros.length; contador++ ) {
			System.out.println("Dentro do for: " + numeros[contador]);
			}
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
	}

}
