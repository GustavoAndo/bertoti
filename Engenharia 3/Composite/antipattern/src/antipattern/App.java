package antipattern;

public class App {

	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();
		
		carrinho.addLivro(new Livro());
		
		carrinho.addPasta(new Pasta());
		
		carrinho.addCaderno(new Caderno());
		
	}

}
