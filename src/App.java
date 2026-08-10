public class App {

	public static void main(String[] args) {
		ProdutoNaoPerecivel np1 = new ProdutoNaoPerecivel("Chocolate",10.0);
		System.out.println(np1);

		ProdutoNaoPerecivel np2 = new ProdutoNaoPerecivel("Maça",10.0,0.5);
		System.out.println(np2);
	}
}
