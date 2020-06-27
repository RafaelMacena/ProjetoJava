package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Digite seu salario do mes de abril:");
		String abrilSalario = in.nextLine().replace(",", ".");
		System.out.println("Digite seu salario do mes de maio:");
		String maioSalario = in.nextLine().replace(",", ".");
		System.out.println("Digite seu salario do mes de junho:");	
		String junhoSalario = in.nextLine().replace(",", ".");
		double salario1 = Double.parseDouble(abrilSalario);
		double salario2 = Double.parseDouble(maioSalario);
		double salario3 = Double.parseDouble(junhoSalario);
		double media = (salario1 + salario2 + salario3)/3;
		System.out.printf("A media é %4f",media);
		
		in.close();
		
	}   

}
