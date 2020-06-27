package com.exript.AulaJava;
import java.util.Scanner;
public class exercicio0004 {
   public static void main(String[]  args) {
	   
	   Scanner in = new Scanner(System.in);
	   System.out.println("Qual a sua idade? ");
	   int idadeFilho = in.nextInt();
	   
	  // Scanner inn = new Scanner (System.in);
	   System.out.println("Qual a idade da sua mãe? ");
	   int idadeMae = in.nextInt();
	   
	   int diferencaIdade = idadeMae - idadeFilho;
	   
	   System.out.println("Minha idade é: "+ idadeFilho);
	   System.out.println("A idade da minha mãe é: "+ idadeMae);
	   System.out.printf("Minha mãe é %d  anos mais velha do que eu.", diferencaIdade);
	
	   
	   
	   
   }
}
