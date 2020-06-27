package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrda = new Scanner(System.in);

		int quantidadeNota = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("informe a nota ou -1 para sair: ");
			nota = entrda.nextDouble();
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNota++;
			}else if (nota != -1) {
				System.out.println("nota inválida!!!");
			}
		}
		double media = total / quantidadeNota;
		System.out.println("Média = " + media);

		entrda.close();
	}

}
