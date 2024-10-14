package principal;

import java.util.Scanner;

public class Operacoes2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.println("Valor da Nota 1" );
        nota1 = leia.nextDouble();
        System.out.println("Valor da Nota 2"  );
        nota2 = leia.nextDouble();
        System.out.println("Valor da Nota 3"  );
        nota3 = leia.nextDouble();
        System.out.println("Valor da Nota 4"  );
        nota4 = leia.nextDouble();
     
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("Media Total: " + media);
        
	}

}
