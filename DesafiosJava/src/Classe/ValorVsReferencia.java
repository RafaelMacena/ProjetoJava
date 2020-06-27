package Classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;// atribuição por valor(tipo primitivo)

		a++;
		b--;
		System.out.println(a + " " + b);

		Data d1 = new Data(1, "setembro", 2022);
		Data d2 = d1;
		d1.dia = 31;
		d2.mes = "outubro";

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = "janeiro";
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}

}
