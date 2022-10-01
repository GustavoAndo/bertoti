package pattern;


public class App {

	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();
		
		carrinho.add(new Livro());
		
		carrinho.add(new Pasta());
		
		carrinho.add(new Caderno());
		
	}

}
