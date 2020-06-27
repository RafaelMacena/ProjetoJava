package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {

		int a = 6;
		int b = 3;
		int c = 2;
		int d = 1;
		int e = 5;
		int f = 7;
		int g = 10;
		
		int x = a * (b + c);
		int y = (int) Math.pow(x, 2);
		
		int fracao1 = y / (b * c);
		
		int w = ((d - e) * (c - f));
		
		int i = w / c;
		int fracao2 = (int) Math.pow(i, 2);
		
		int fracao = fracao1 - fracao2;
		
		int resultado = (int) Math.pow(fracao, 3);
		int valor = resultado;
		int valor1 = (int) Math.pow(g, 3);
		int resultadoFinal = valor / valor1;
		System.out.println(resultadoFinal);
	}

}
