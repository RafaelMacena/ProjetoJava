package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {

		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		boolean tv50 = trabalhoTerca && trabalhoQuinta;
		boolean tv32 = trabalhoTerca || trabalhoQuinta;

		if (trabalhoTerca && trabalhoQuinta == true) {
			System.out.println(
					"levar familia ao shoping e comprar tv 50 polegadas e tomar sorvete no fim de semana: " + tv50);

		}

		else if (trabalhoTerca || trabalhoQuinta == true) {
			System.out.println("levar famili ao shoping e comprar tv 32 P. e tomar sorvete: " + tv32);
		} else {
			System.out.println("Ficar em casa com a familia: ");

		}

	}

}
