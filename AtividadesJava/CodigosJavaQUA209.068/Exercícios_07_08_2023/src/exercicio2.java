import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	    	Scanner leia = new Scanner(System.in);
	    	
	    	//fa�a um programa que entre com um n�mero
	    	//e indique se ele � par ou �mpar
	    	
	    	System.out.println("Digite o n�mero");
            int numero;
			numero = leia.nextInt();
			double decimal = 0;
            
			
            if(numero%2 == decimal) {
			System.out.println(numero + " � par");
	        }else {
	        System.out.println(numero + " � impar!");}
	    	
	}

}
