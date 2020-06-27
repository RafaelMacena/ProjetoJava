package com.exript.AulaJava;
import java.util.Scanner;
public class aula0036 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o mês do seu aniversário?");
		System.out.println("digite o numero do mês? ex; 1 para janeiro.");
		int  num = in.nextInt();
		  String aniversario = (num==1)? "janeiro":
			           (num==2)? "fevereiro":
			           (num==3)? "marco":
			           (num==4)? "abril":
			           (num==5)? "maio":
			        	         "invalido";
		  System.out.println("o mês do seu aniversário é " + aniversario);
	}

}
