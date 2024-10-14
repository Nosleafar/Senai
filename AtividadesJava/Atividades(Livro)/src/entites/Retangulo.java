package entites;

public class Retangulo {
    private double largura;
    private double altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularÁrea() {
        return largura * altura;
    }

    public double calcularPerímetro() {
        return 2 * (largura + altura);
    }
}