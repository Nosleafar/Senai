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

    public double calcular�rea() {
        return largura * altura;
    }

    public double calcularPer�metro() {
        return 2 * (largura + altura);
    }
}