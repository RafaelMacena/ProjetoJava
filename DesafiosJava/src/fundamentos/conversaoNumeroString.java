package fundamentos;
// Converter numero em String
public class conversaoNumeroString {
	
	public static void main(String[] args) {
		//classe wapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		//classe primitivo 
		int num2 = 1000000;
		System.out.println(Integer.toString(num2).length()); 
	    System.out.println(""+num1);
	    System.out.println(""+num2);
	}

}
