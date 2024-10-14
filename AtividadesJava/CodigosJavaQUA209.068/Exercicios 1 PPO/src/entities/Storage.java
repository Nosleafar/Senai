package entities;

import java.util.Scanner;

public class Storage {
	Scanner sc = new Scanner(System.in);
	
	public String produto;
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int quantidade;
	
	public void quantidadeEstoque() {
		System.out.println(produto);
		System.out.println("Disponível no estoque: " + quantidade);
		
		
	}
	

}
