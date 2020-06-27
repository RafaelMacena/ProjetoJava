package com.exript.AulaJava;
import java.util.Scanner;
public class exercicio0003 {

	public static void main(String[] args) {
		
	
	
		Scanner in = new Scanner(System.in);
		String nome;
		System.out.println("Qual o seu nome? ");
		nome = in.next();
		
		Scanner cidadeNascimento = new Scanner(System.in);
		String cidade;
		System.out.println("Em que cidade voçê nasceu? ");
		cidade = cidadeNascimento.next();
		
        Scanner id = new Scanner(System.in);
        int idade;
        System.out.println("qual a sua idade? ");
		idade = id.nextInt();
		
	
		System.out.print("Olá. Meu nome é "+ nome );
		System.out.print(", sou natural de "+ cidade );
		System.out.print(", tenho "+ idade);
		System.out.println(" anos e estou aprendendo a programar" );
		
			
		

		
		
		 
		

	}

}
