package list.pesquisaEmList.somaDeNumeros;

import java.util.ArrayList;

public class SomaNumeros {
	private ArrayList<Integer> nums;
	
	public SomaNumeros() {
		super();
		this.nums = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		nums.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer i: nums) {
			soma += i;
		}
		
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNum = nums.get(1);
		
		for(int n: nums) {
			if(n > maiorNum) maiorNum = n;
		}
		return maiorNum;
	}
	
	public int encontrarMenorNumero() {
		int menorNum = nums.get(1);
		
		for(int n: nums) {
			if(n < menorNum) menorNum = n;
		}
		return menorNum;
	}
}
