import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	    	Scanner leia = new Scanner(System.in);
	    	//faça um programa que peça para o usuário
	    	//entrar com um ano e dizer se ele é bissexto ou não
	    	

	    	System.out.println("Digite o ano");
            int ano;
			ano = leia.nextInt();
            
			
            if(ano%4 == 0 ) {
			System.out.println("O ano é bissexto");
	        }else {
	        System.out.println("O ano não é bissexto!");}

	}

}
