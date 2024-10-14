package principal;

import java.util.Scanner;
import entities.Car;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car carro = new Car();

        System.out.println("Qual o modelo do Carro? ");
        carro.setModelo(sc.nextLine());
        System.out.println("Qual o ano do Carro? ");
        carro.setAno(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual o tipo de c�mbio? ");
        carro.setCambio(sc.nextLine());
        System.out.println("Qual a velocidade m�xima do carro? ");
        carro.setVelocidade(sc.nextLine());
        System.out.println("Qual a cor do Carro? ");
        carro.setCor(sc.nextLine());
        System.out.println("Qual o motor do Carro? ");
        carro.setMotor(sc.nextLine());
        System.out.println("Voc� deseja acelerar ou freiar o Carro? ");
        String acao = sc.nextLine();
       
        if (acao.equalsIgnoreCase("acelerar")) {
            System.out.println("Voc� est� acelerando o carro");
        } else if (acao.equalsIgnoreCase("freiar")) {
            System.out.println("Voc� est� freando o carro");
        } else {
            System.out.println("O carro est� desligado");
        }

        carro.especificacoes();
    }
}