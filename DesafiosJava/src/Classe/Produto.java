package Classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
    // contrutor padrão sem parametro forma implicita
	Produto() {

	}
     // construtor com parametro, forma explicita
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
