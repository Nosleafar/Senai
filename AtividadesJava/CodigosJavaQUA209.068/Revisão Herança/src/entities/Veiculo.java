package entities;

public class Veiculo {
	
		
	String marca;
	int ano;
	
	Veiculo(String marca, int ano){
		this.marca = marca;
		this.ano = ano;
		}
	public void exibirInforma��es() {
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
	}
}
