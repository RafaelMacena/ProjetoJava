package Calculando;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Double num1;
		Double num2;
		Integer opcao = definirOperacao();
		if (opcao == null) {
			System.out.println("Opcao inválida.");
		} else {
			num1 = leitura();
			num2 = leitura();
			calcula(num1, num2, opcao);
		}

	}

	private static void calcula(Double num1, Double num2, Integer opcao) {

		if (opcao == 1) {
			somar(num1, num2);
		} else if (opcao == 2) {
			subtrair(num1, num2);
		} else if (opcao == 3) {
			multiplicar(num1, num2);
		} else {
			dividir(num1, num2);
		}

	}

	public static void somar(Double num1, Double num2) {
		Double resultado = num1 + num2;
		System.out.println("O resultado da soma é: " + resultado);
	}
	public static void subtrair(Double num1, Double num2) {
		Double resultado = num1 - num2;
		System.out.println("O resultado da subtração é: " + resultado);
	}
	public static void multiplicar(Double num1, Double num2) {
		Double resultado = num1 * num2;
		System.out.println("O resutado da multiplicação é: " + resultado);
	}
	public static void dividir(Double num1, Double num2) {
		if(num1 == 0) {
			System.out.println("zero não é um número divisível");
		}else {
			Double resultado = num1 / num2;
			System.out.println("O resultado da divisão é: " + resultado);
		}
		
	}

	public static Double leitura() {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite um número: ");
		Double num = in.nextDouble();
		return num;

	}

	public static Integer definirOperacao() {

		System.out.println("1 - somar");
		System.out.println("2 - subtrair");
		System.out.println("3 - multiplicar");
		System.out.println("4 - dividir");

		System.out.print("Esolha uma das opções: ");

		Scanner entrada = new Scanner(System.in);

		int opcao = entrada.nextInt();
		if (opcaoEVerdadeira(opcao)) {
			return opcao;
		} else {
			return null;
		}

	}

	public static boolean opcaoEVerdadeira(int opcao) {
		switch (opcao) {
		case 1:
		case 2:
		case 3:
		case 4:
			return true;

		default:
			return false;
		}
	}

}
