package entities;

public class televis�o {

    private int powerOff = 0;

    public void setPowerOff(int powerOff) {
        this.powerOff = powerOff;
    }

    public void estadoTelevisor() {
        System.out.println("Estado da TV: " + (powerOff == 0 ? "Desligada" : "Ligada"));
    }

}