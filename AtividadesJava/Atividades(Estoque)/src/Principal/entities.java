package Principal;

public class entities {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Divis�o por zero n�o � permitida.");
            return Double.NaN; //
        }
        return (double) a / b;
}