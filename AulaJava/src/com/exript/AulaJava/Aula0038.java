package com.exript.AulaJava;

public class Aula0038 {
	public static void main(String[]  args) {
	
		labelForI: for (int i = 0; i<10; i++) {
	      for (int j = 0; j<10; j++) {
	      System.out.println("O valor de i = " +i+ "o valor de j é " + j);
		if (j==6 && i==0) 
	          break labelForI;
	          
		}
		}
	}

}
