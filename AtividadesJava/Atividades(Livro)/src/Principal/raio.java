package Principal;

public class raio {
    private double raio;
    private static final double PI = 3.14;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularÁrea() {
        return PI * raio * raio;
    }

    public double calcularPerímetro() {
        return 2 * PI * raio;
    }

    public static void main(String[] args) {
        raio círculo = new raio();
        círculo.setRaio(5.0);
        double área = círculo.calcularÁrea();
        double perímetro = círculo.calcularPerímetro();

        System.out.println("Área do círculo: " + área);
        System.out.println("Perímetro do círculo: " + perímetro);
    }
}
