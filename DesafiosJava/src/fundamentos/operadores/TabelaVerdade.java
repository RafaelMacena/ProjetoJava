
package fundamentos.operadores;

public class TabelaVerdade {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);

		System.out.println("tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("tabela verdade Ou (or)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("tabela verdade Ou exclusivo (xor)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("tabela verdade Not");
		System.out.println(!true);
		System.out.println(!false);

	}

}
