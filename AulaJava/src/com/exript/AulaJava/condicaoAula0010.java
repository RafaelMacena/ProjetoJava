package com.exript.AulaJava;
import java.util.Scanner;
public class condicaoAula0010 {
	public static void main(String[] args) {
	// declara uma variavel,	nesse caso um numero tipo inteiro
		int num;
	// Imprima uma mesagem ao usuario para digitar um numero	
		System.out.println("Digite o número 10:");
	// lê a mensagem que o usuari inseriu	
		Scanner in = new Scanner(System.in);
	// atribui o valor que o usuario digitou a variavel que vc criou	
		num = in.nextInt();
	// compara se o valor da sua variavel é igual a 10(valor digitado pelo usuario)	
		if (num == 10) {
			System.out.println("Obrigado vc digitou o número 10");
	// se nao for igual  a 10o valor digitado pelo usuario imprimirá essa msg 		
		}else {
			System.out.println("O número digitado não é igual a 10");
		}
		
		
				
		
		
	}

}
