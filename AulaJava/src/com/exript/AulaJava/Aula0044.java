package com.exript.AulaJava;
// array
public class Aula0044 {
	public static void main(String[] args) {
		
		int[] array;  // declaracão do array
		array = new int[10];  //cria e reserva o espaço para nosso array
		
		for (int i= 0; i<=9; i++) {
			System.out.printf("%5d%7d\n", i,array[i]);
		}
	}

}
