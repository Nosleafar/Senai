package entities;

public class volume {

    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void exibirVolume() {
        if (volume >= 0 && volume < 17) {
            System.out.println("O volume selecionado é: " + volume);
        } else {
            System.out.println("O televisor está no volume máximo");
        }
    }

}