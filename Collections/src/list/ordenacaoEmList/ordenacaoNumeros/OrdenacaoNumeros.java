package list.ordenacaoEmList.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> nums;
	
	public OrdenacaoNumeros() {
		super();
		this.nums = new ArrayList<>();
	}

	public void adicionarNumero(int num) {
		nums.add(num);
	}
	
	public List<Integer> ordenarAscendente() {
		Collections.sort(nums);
		return nums;
	}
	
	public List<Integer> ordenarDescendente() {
		Collections.reverse(nums);
		return nums;
	}
	
	public List<Integer> getNums() {
		return nums;
	}
}
