package entities;

public class Chefia extends Dados {
    @Override
    public double getBonus() {
        return (salario * 0.05);
    }
}