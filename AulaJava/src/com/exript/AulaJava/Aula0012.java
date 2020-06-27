package com.exript.AulaJava;
import java.util.Scanner;

public class Aula0012 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		 
		
		
		System.out.println("Digite a primeira nota:");
		nota1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = in.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		nota3 = in.nextDouble();
		
		System.out.println("Digite a quarta nota:");
		nota4 = in.nextDouble();
		
		double soma = nota1 + nota2 + nota3 + nota4;
		
		soma = soma / 4;
		
		if(soma >= 7) {
			System.out.println("Parabéns vc foi aprovado, a sua nota foi: " +soma);

		}else {
			System.out.println("Você foi reprovado, sua nota foi:" + soma );
		}
		
	}

}
