
package com.exript.AulaJava;
import java.util.Scanner;
public class Aula0013 {
	public static void main(String[] args ) {
		 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite 1 para soma");
		System.out.println("Digite 2 para subtracao");
		System.out.println("Digite 3 para multiolicacao");
		System.out.println("Digite 4 para divisao");
		
		int escolha = in.nextInt();
		double num, num1;
		System.out.println("Digite o primeiro numero: ");
		num = in.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num1 = in.nextDouble();
		
		if(escolha == 1) {
			System.out.println(num + num1);
		}else {
			if(escolha == 2) {
				System.out.println(num - num1);	
			
		    }else {
			    if(escolha == 3) {
				System.out.println(num * num1);
			}else {
				if(escolha == 4) {
					System.out.println(num / num1);	
				}else {
					System.out.println("Numero invalido.");
				}
			}
		
			
		}
			
		}
			
		
			
			
			
		
		
		
		
	}
}
