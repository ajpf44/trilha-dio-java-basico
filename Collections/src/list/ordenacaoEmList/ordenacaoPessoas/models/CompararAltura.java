package list.ordenacaoEmList.ordenacaoPessoas.models;

import java.util.Comparator;

public class CompararAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return Double.compare(o1.getAltura(), o2.getAltura());
	}
}
