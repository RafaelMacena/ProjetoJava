package Controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("nota inválida");

		} else if (nota >= 8.0) {
			System.out.println("Conceito A");
		} else if (nota >= 6.0) {
			System.out.println("conceito B");
		} else if (nota >= 4) {
			System.out.println("conceito C");
		} else {
			System.out.println("Conceito D");
		}
		entrada.close();

	}

}
