package fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		double d = 1; // conversão imlicita
		System.out.println(d);
		// conversão explicita perde valor
		float f = (float) 1.12456784547777;// conversão explicita
		System.out.println(f);

	}
}
