package principal;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;

public class Animais {

	public static void main(String[] args) {
	
		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();
		
		animal1.fazerSom();
		animal2.fazerSom();
	}

}
