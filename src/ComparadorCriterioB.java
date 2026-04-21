import java.util.Comparator;

/**
 * Critério B - Volume Total de Itens (crescente).
 * Desempate 1: Data do Pedido.
 * Desempate 2: Código Identificador do pedido.
 */
public class ComparadorCriterioB implements Comparator<Pedido> {
    @Override
    public int compare(Pedido p1, Pedido p2) {
        int cmp = Integer.compare(p1.getFormaDePagamento(), p2.getFormaDePagamento());
        if (cmp != 0) return cmp;
        
        cmp = Double.compare(p1.valorFinal(), p2.valorFinal());
        if (cmp != 0) return cmp;
        
        return Integer.compare(p1.getIdPrimeiroProduto(), p2.getIdPrimeiroProduto());
    }
}
