package Classe;

public class DataTeste {

	public static void main(String[] args) {

		Data aniversario = new Data();
		aniversario.dia = 19;
		 aniversario.mes = "maio";
		//aniversario.ano = 1989;

		Data casamento = new Data(10, "Novembro", 2018);

		System.out.println(aniversario.obterDataFormatada());
		System.out.printf("Sou casado desde %d %s %d", casamento.dia, casamento.mes, casamento.ano);
	}

}
