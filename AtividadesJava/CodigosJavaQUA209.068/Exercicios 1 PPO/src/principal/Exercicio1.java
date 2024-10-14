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
        System.out.println("Qual o tipo de câmbio? ");
        carro.setCambio(sc.nextLine());
        System.out.println("Qual a velocidade máxima do carro? ");
        carro.setVelocidade(sc.nextLine());
        System.out.println("Qual a cor do Carro? ");
        carro.setCor(sc.nextLine());
        System.out.println("Qual o motor do Carro? ");
        carro.setMotor(sc.nextLine());
        System.out.println("Você deseja acelerar ou freiar o Carro? ");
        String acao = sc.nextLine();
       
        if (acao.equalsIgnoreCase("acelerar")) {
            System.out.println("Você está acelerando o carro");
        } else if (acao.equalsIgnoreCase("freiar")) {
            System.out.println("Você está freando o carro");
        } else {
            System.out.println("O carro está desligado");
        }

        carro.especificacoes();
    }
}