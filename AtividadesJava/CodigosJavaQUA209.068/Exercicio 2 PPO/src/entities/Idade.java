package entities;

public class Idade {
	
	public double anoAtual = 2023;
	public double nascimento = 0;
	public double idade = 0;
	
	public void idadeAtual() {
	idade = anoAtual - nascimento; 
	}
}
