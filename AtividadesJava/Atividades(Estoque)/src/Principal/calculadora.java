package Principal;

public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    int numero1 = 10;
    int numero2 = 5;

  
    System.out.println("Soma: " + calculadora.somar(numero1, numero2));
    System.out.println("Subtração: " + calculadora.subtrair(numero1, numero2));
    System.out.println("Multiplicação: " + calculadora.multiplicar(numero1, numero2));
    System.out.println("Divisão: " + calculadora.dividir(numero1, numero2));
}
}