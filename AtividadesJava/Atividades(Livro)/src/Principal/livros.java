package Principal;

import entites.Livro;

public class livros {

public static void main(String[] args) {
    Livro livro = new Livro();

    livro.setT�tulo("Dom Casmurro");
    livro.setAutor("Machado de Assis");
    livro.setN�meroDeP�ginas(256);

    System.out.println("T�tulo: " + livro.getT�tulo());
    System.out.println("Autor: " + livro.getAutor());
    System.out.println("N�mero de P�ginas: " + livro.getN�meroDeP�ginas());

    
    livro.setN�meroDeP�ginas(-10);
}
}