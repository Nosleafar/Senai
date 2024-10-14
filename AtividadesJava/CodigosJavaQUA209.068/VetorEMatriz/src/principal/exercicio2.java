package principal;


	//Faça um programa que peça quantidade x de nomes, 
	//insira os nomes, e mostre os nomes inseridos;
	
	import java.util.Scanner;

	public class exercicio2 {
	
		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de nomes: ");
        int quantidade = sc.nextInt();

        String[] nomes = new String[quantidade];

        for (int cont = 0; cont < quantidade; cont++) {
            System.out.print("Digite o nome: ");
            nomes[cont] = sc.next();
        }

        System.out.println("Os nomes inseridos foram:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}
