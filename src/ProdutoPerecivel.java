
import java.text.NumberFormat;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto
{
    private static final double DESCONTO = 0.25;
    private static final int PRAZO_DESCONTO = 7;
    private LocalDate dataDeValidade;

    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro,
        LocalDate dataDeValidade)
    {
        super(desc, precoCusto, margemLucro);
        if(dataDeValidade == null || dataDeValidade.isBefore(LocalDate.now())) 
        {
            throw new IllegalArgumentException("Data de validade inválida.");
        }
        this.dataDeValidade = dataDeValidade;
    }
    @Override
    public double valorDeVenda()
    {
        if(dataDeValidade.isBefore(dataDeValidade.plusDays(PRAZO_DESCONTO)))
        {
            throw new IllegalArgumentException("Produto perecível com prazo de validade inferior a 7 dias.");
        }
        if(LocalDate.now().isBefore(dataDeValidade.minusDays(PRAZO_DESCONTO)))
            // 01/08/2026
            // 
        {
            this.precoCusto = precoCusto * (DESCONTO);
        }
        return (precoCusto * (1.0 + margemLucro));
    }
    @Override
	public String toString() {
    	
    	NumberFormat moeda = NumberFormat.getCurrencyInstance();
    	
		return String.format(
            "NOME: " + descricao + ": " + moeda.format(valorDeVenda())
            + " | Data de Validade: " + dataDeValidade.toString());
	}
}
