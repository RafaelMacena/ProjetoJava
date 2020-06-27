package com.exript.AulaJava;
import java.util.Scanner; 
public class Aula0014 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int crianca = 17;
		final int idoso = 60;
	    System.out.println("Digite a sua idade:");	
	    
		int idade = in.nextInt();
		if(idade<=17) {
			  System.out.println("Você é uma crinça.");	
		
		
		}else {
			if(idade>=60){
			  System.out.println("Vocẽ é um idoso");
			}	if((idade>17)&&(idade<60)) {
				System.out.println("Vocẽ é um adulto");
			}
		}
		
		 {
			 	
			    
		}
	   
		

	
	}
}
