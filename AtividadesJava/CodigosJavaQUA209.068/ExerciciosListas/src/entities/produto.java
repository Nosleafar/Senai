package entities;

public class produto {

	private String nome;
	private int quantidade;
	private double pre�o;
		// TODO Auto-generated constructor stub
	
	public produto(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}
	public produto() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		
		
		
		
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome
				+", Quantidade: " + quantidade
				+", Pre�o unit�rio: " + pre�o;
	}
	public int compareTo(produto outroProduto) {
		
		return this.nome.compareTo(outroProduto.nome);
	}
	
}
