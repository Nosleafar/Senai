import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	    	Scanner leia = new Scanner(System.in);
	    	
	    	//fa�a um programa que leia dois n�mero
	    	//e imprima o maior deles
	    	
	    	System.out.println("Digite um n�mero");
            int numero;
			numero = leia.nextInt();
			System.out.println("Digite um n�mero");
            int numero2;
			numero2 = leia.nextInt();
            
			System.out.println("O maior n�mero �: ");
            if(numero > numero2 ) {
			System.out.println(numero);
	        }else {
	        System.out.println(numero2);}
	    	
	    	
	    	
	}

}
