package Classe;

public class Data {

	int dia;
	String mes;
	int ano;

	String obterDataFormatada() {

		return String.format("Nasci  no dia %d %s %d", dia, mes, ano);

	}

	Data() {
     //dia = 1;
     //mes = "janeiro";
     //ano = 1970;
		this(1, "janeiro", 1970);
	}

	Data(int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}
}
