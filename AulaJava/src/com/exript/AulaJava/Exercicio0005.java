package com.exript.AulaJava;
import java.util.Scanner;
public class Exercicio0005 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Para efetuar o login digite seu nome: ");
		String login = in.nextLine();
	
		System.out.println("Digite seu CPF para entrar");
         String senha = in.nextLine();
       
	if( login.equals("Rafael") && senha.equals("038837655-46")) {
		System.out.printf("Usuário %s logado com sucesso", login);
	
	}else {
		System.out.println("Login ou Senha inválida");
	
	
	}

	}

}
