import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	    	Scanner leia = new Scanner(System.in);
	    	//fa�a um programa que pe�a para o usu�rio
	    	//entrar com um ano e dizer se ele � bissexto ou n�o
	    	

	    	System.out.println("Digite o ano");
            int ano;
			ano = leia.nextInt();
            
			
            if(ano%4 == 0 ) {
			System.out.println("O ano � bissexto");
	        }else {
	        System.out.println("O ano n�o � bissexto!");}

	}

}
