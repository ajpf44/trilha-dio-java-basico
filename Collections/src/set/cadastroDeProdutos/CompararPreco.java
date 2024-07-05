package set.cadastroDeProdutos;

import java.util.Comparator;

import set.cadastroDeProdutos.models.Produto;

public class CompararPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
	
}
