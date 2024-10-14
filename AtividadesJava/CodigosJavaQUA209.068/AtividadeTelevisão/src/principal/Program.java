package principal;

import java.util.Scanner;
import entities.canal;
import entities.televis�o;
import entities.volume;

public class Program{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        televis�o televisao = new televis�o();
        canal canal = new canal();
        volume volume = new volume();

        System.out.println("Digite 0 para desligar a TV e 1 para ligar: ");
        televisao.setPowerOff(sc.nextInt());

        System.out.println("Selecione o canal: ");
        canal.setCanal(sc.nextInt());

        System.out.println("Qual o volume? ");
        volume.setVolume(sc.nextInt());

        
        televisao.estadoTelevisor();
        canal.exibirCanal();
    }

}