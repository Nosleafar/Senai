import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        
        //toLoweCase = caixa baixa
        //toUpCase = caixa alta
        
        char sexo;
        
        System.out.println("Digite o sexo(m/f): ");
        sexo = leia.next().charAt(0);
        
        
        if (Character.toLowerCase(sexo) == 'm') {
        	System.out.println("O sexo digitado foi masculino (M)");
        }else {
        	System.out.println("O sexo digitado foi feminino (F)");
      }
   
	leia.close();
    }
}