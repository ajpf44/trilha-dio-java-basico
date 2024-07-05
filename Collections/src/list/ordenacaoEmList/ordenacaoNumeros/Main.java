package list.ordenacaoEmList.ordenacaoNumeros;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		OrdenacaoNumeros on = new OrdenacaoNumeros();
		List<Integer> nums = on.getNums();
		on.adicionarNumero(1);
		on.adicionarNumero(20);
		on.adicionarNumero(7);
		on.adicionarNumero(14);
		on.adicionarNumero(3);
		on.adicionarNumero(18);
		on.adicionarNumero(5);
		on.adicionarNumero(11);
		on.adicionarNumero(2);
		on.adicionarNumero(17);
		on.adicionarNumero(9);
		
		
		System.out.println("Sem ordem: ");
		for(int n: nums) {
			System.out.println(n);
		}
		System.out.println("===================");
		System.out.println("ordenarAscendente ordem: ");
		on.ordenarAscendente();
		for(int n: nums) {
			System.out.println(n);
		}
		System.out.println("===================");
		System.out.println("ordenarDescendente ordem: ");
		on.ordenarDescendente();
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
