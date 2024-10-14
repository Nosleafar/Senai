import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	    	Scanner leia = new Scanner(System.in);
	    	
	    	//faça um programa que leia dois número
	    	//e imprima o maior deles
	    	
	    	System.out.println("Digite um número");
            int numero;
			numero = leia.nextInt();
			System.out.println("Digite um número");
            int numero2;
			numero2 = leia.nextInt();
            
			System.out.println("O maior número é: ");
            if(numero > numero2 ) {
			System.out.println(numero);
	        }else {
	        System.out.println(numero2);}
	    	
	    	
	    	
	}

}
