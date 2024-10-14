package principal;

import java.util.Scanner;

import entities.Usuario;

public class ProgramUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o nome do usuário: ");
		usuario.setNome(sc.nextLine());
		
		System.out.println("Entre com o e-mail: ");
		usuario.setE_mail(sc.nextLine());
		
		System.out.println("Cadastre uma senha: ");
		usuario.setSenha(sc.nextLine());
		
		usuario.obterDadosUsuario();
		
		
		sc.close();
		
		
		

	}

}
