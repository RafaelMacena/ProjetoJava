package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//tipos numericos inteiros
		//informacões do funcionario
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		//tipos numercos reais
		float salario =11_445_44F;
		double vendaAcumuladas = 2_991_797_103.01;
		//tipo boleano
		boolean estaDeFerias = false; //true
		//tipo caractere 
		char status = 'A';
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		//numero de viagens
		System.out.println(numerosDeVoos/2);
		//pontos por real
		System.out.println(pontosAcumulados / vendaAcumuladas);
		System.out.println(id +":ganha-> "+salario);
		System.out.println("ferias? "+estaDeFerias);
		System.out.println("status "+ status);
		

	}

}
