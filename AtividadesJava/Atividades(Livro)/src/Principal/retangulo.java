package Principal;

import entites.Retangulo;

public class retangulo {

	 public static void main(String[] args) {
	        Retangulo retângulo = new Retangulo();

	        retângulo.setLargura(5.0);
	        retângulo.setAltura(10.0);

	        System.out.println("Largura do retângulo: " + retângulo.getLargura());
	        System.out.println("Altura do retângulo: " + retângulo.getAltura());
	        System.out.println("Área do retângulo: " + retângulo.calcularÁrea());
	        System.out.println("Perímetro do retângulo: " + retângulo.calcularPerímetro());
	    }
	}