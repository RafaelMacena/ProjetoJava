package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia x";
		//substituir x
		s = s.replace("x", "Senhora");
		// transformou o texto atribuido a s para maisculas
		s = s.toUpperCase();
		//concatena  outra string ao texto 
		s = s.concat("!!!");
		System.out.println(s);
		

	}

}
