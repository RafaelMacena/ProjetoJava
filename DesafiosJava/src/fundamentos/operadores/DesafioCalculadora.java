package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("escolha a operação que deseja realizar +, -, *, /, %");
		String operacao = entrada.next();

		System.out.println("digite um numero:");
		double num1 = entrada.nextDouble();

		System.out.println("digite um numero: ");
		double num2 = entrada.nextDouble();

		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f ", num1, operacao, num2, resultado);

		entrada.close();

	}

}
