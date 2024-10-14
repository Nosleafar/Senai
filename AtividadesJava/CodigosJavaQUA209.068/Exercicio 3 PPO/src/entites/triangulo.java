package entites;

public class triangulo { 
    private double lado1;
    private double lado2;
    private double lado3;

    public triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1; 
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String determinarTipo() {
        if (lado1 == lado2 && lado1 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}