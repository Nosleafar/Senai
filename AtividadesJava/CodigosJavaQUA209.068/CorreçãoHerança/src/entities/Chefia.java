package entities;

public class Chefia  extends Funcionario{

	
	@Override
	public double getBonus() {
		return (salarioBruto *0.05);
	}
}