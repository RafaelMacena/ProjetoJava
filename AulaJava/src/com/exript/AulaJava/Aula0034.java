package com.exript.AulaJava;
import java.util.Random;
public class Aula0034 {
//escoher numero aleatorio para Dado 
	public static void main(String[] args) {
		
		Random num = new Random();
		for(double i = 0; i<20; i++ ) {
        
        //System.out.println(num.nextInt(6)+1);
        System.out.println(num.nextDouble()*50 + 10);// 10 é o intervalo 
		}
	}

}
