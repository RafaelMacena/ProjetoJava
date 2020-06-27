package Controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe sua média: ");
		double media = entrada.nextDouble();

		if (media < 10.0 && media >= 7.0) {
			System.out.println("Parabens aprovado!!!");
		}
		if (media < 7.0 && media >= 5.0) {
			System.out.println("Recuperacão");
		}
		if (media < 5.0) {
			System.out.println("Infelizmente vc foi reprovado");
		}

		entrada.close();
	}

}
