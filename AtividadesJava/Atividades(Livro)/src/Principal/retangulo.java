package Principal;

import entites.Retangulo;

public class retangulo {

	 public static void main(String[] args) {
	        Retangulo ret�ngulo = new Retangulo();

	        ret�ngulo.setLargura(5.0);
	        ret�ngulo.setAltura(10.0);

	        System.out.println("Largura do ret�ngulo: " + ret�ngulo.getLargura());
	        System.out.println("Altura do ret�ngulo: " + ret�ngulo.getAltura());
	        System.out.println("�rea do ret�ngulo: " + ret�ngulo.calcular�rea());
	        System.out.println("Per�metro do ret�ngulo: " + ret�ngulo.calcularPer�metro());
	    }
	}