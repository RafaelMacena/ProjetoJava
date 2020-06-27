package fundamentos.operadores;

public class Ralacionais {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a';

		System.out.println(a == b);
		System.out.println(30 != 9);
		System.out.println(3 > 7);
		System.out.println(3 >= 5);
		System.out.println(3 < 7);
		System.out.println(3 <= 8);
		double nota = 6.8;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println(" Tem desconto?" + temDesconto);

	}

}
