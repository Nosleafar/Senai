package entities;

public class canal {

    private int canal;

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void exibirCanal() {
        if (canal >= 0 && canal < 17) {
            System.out.println("Você selecionou o canal " + canal);
        } else {
            System.out.println("O canal selecionado é incorreto");
        }
    }

}