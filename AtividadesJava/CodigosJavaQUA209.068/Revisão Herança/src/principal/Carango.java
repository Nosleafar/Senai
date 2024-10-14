package principal;

import entities.Carro;

public class Carango {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro("Toyota", 1989, "Supra");
		meuCarro.exibirInformações();
		meuCarro.ligarMotor();
	}

}
