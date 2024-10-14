import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = leia.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = leia.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = leia.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        double nota4 = leia.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Média: " + media);
        
        if (media == 10) {
            System.out.println("Aprovado com honras!");
        } else if (media > 7 && media < 10) {
            System.out.println("Aprovado");
        } else if (media >= 6 && media < 7) {
            System.out.println("Recuperação");
        }else if (media > 10) {
        	System.out.println("Você digitou algum valor incorreto!");
        } else {
            System.out.println("Reprovado");
            
            leia.close();
        }
    }
}