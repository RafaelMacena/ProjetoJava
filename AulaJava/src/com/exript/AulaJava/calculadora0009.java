package com.exript.AulaJava;
import java.util.Scanner;
public class calculadora0009 {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	Double num1, num2, soma, sub, muti, div;
	
	System.out.println("digite um numero; ");
	num1 = in.nextDouble();
	
	System.out.println("digite um numero; ");
	num2 = in.nextDouble();
	
    soma = num1 + num2;
    System.out.println("O resultado da soma  é: " + soma);
    sub = num1 - num2;
    System.out.println("O resultado da subtraçao  é: " + sub);
    muti = num1 * num2;
    System.out.println("O resultado da multiplicação  é; " + muti);
    div = num1 / num2;
    System.out.println("O resultado da divisão  é: " + div);
	
	
	}

}
