
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		ProdutoNaoPerecivel np1 = new ProdutoNaoPerecivel("Chocolate",10.0);
		System.out.println(np1);

		ProdutoNaoPerecivel np2 = new ProdutoNaoPerecivel("Maça",10.0,0.5);
		System.out.println(np2);

		LocalDate date = LocalDate.parse("2026-08-01");
		ProdutoPerecivel pp1 = new ProdutoPerecivel("Suco de Uva",20.5,
		 0.5, date);
		 System.out.println(pp1);
	}
}
