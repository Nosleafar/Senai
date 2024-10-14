package Principal;

import entites.Livro;

public class livros {

public static void main(String[] args) {
    Livro livro = new Livro();

    livro.setTítulo("Dom Casmurro");
    livro.setAutor("Machado de Assis");
    livro.setNúmeroDePáginas(256);

    System.out.println("Título: " + livro.getTítulo());
    System.out.println("Autor: " + livro.getAutor());
    System.out.println("Número de Páginas: " + livro.getNúmeroDePáginas());

    
    livro.setNúmeroDePáginas(-10);
}
}