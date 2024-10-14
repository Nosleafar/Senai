package entites;

public class Livro {
    private String t�tulo;
    private String autor;
    private int n�meroDeP�ginas;

    public void setT�tulo(String t�tulo) {
        this.t�tulo = t�tulo;
    }

    public String getT�tulo() {
        return t�tulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setN�meroDeP�ginas(int n�meroDeP�ginas) {
        if (n�meroDeP�ginas >= 0) {
            this.n�meroDeP�ginas = n�meroDeP�ginas;
        } else {
            System.out.println("N�mero de p�ginas n�o pode ser negativo.");
        }
    }

    public int getN�meroDeP�ginas() {
        return n�meroDeP�ginas;
    }
}