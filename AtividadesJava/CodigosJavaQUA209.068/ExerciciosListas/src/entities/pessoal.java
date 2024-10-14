package entities;

public class pessoal implements Comparable<pessoal> {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }

    @Override
    public int compareTo(pessoal outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }
}