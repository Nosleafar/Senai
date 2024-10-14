package entites;

public class Livro {
    private String título;
    private String autor;
    private int númeroDePáginas;

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getTítulo() {
        return título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setNúmeroDePáginas(int númeroDePáginas) {
        if (númeroDePáginas >= 0) {
            this.númeroDePáginas = númeroDePáginas;
        } else {
            System.out.println("Número de páginas não pode ser negativo.");
        }
    }

    public int getNúmeroDePáginas() {
        return númeroDePáginas;
    }
}