package entities;

public class Carro extends Veiculo {
		String modelo;

		public Carro(String marca, int ano, String modelo) {
			super(marca, ano);
			this.modelo = modelo;
			System.out.println("Modelo: " + modelo);

		}

		public void ligarMotor() {
			System.out.println("Carro ligando o motor");
	}

}
