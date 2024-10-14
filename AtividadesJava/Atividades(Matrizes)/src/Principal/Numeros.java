package Principal;

public class Numeros {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1;
}

       
        System.out.print("Números no array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos no array: " + soma);
    }
}