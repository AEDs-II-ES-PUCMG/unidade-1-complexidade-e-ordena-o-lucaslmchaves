import java.util.Comparator;

public class ComparadorPorValor implements Comparator<Pedido>{

	@Override
	public int compare(Pedido o1, Pedido o2) {
		
		int cmp = Double.compare(o1.valorFinal(), o2.valorFinal());
		if (cmp != 0) return cmp;
		
		if (o1.compareTo(o2).equals(o2.compareTo(o1))) {
    		return (o1.getIdPedido() - o2.getIdPedido());
    	} else if (o1.compareTo(o2).isBefore(o2.compareTo(o1))) {
        	return -1;
        } else {
        	return 1;
        }
    }
}
