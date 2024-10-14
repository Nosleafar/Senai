import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	    	Scanner leia = new Scanner(System.in);
	    	
	    	//faça um programa que entre com um número
	    	//e indique se ele é par ou ímpar
	    	
	    	System.out.println("Digite o número");
            int numero;
			numero = leia.nextInt();
			double decimal = 0;
            
			
            if(numero%2 == decimal) {
			System.out.println(numero + " é par");
	        }else {
	        System.out.println(numero + " é impar!");}
	    	
	}

}
