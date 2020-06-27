package com.exript.AulaJava;
import java.util.Scanner;
public class Aula0008{
// comparar a idade de um cachorro se ele fosse humano.
	
	public static void main(String[] args) {
		System.out.println("Qual a idade do seu cachorro?");
		Scanner in = new Scanner(System.in);
		
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 7;
		System.out.println("Se o seu cachorro fosse um humano teria " + idadeCachorro + " anos.");
		
	}

}
