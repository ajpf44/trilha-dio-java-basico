package list.pesquisaEmList.somaDeNumeros;

public class Main {
	public static void main(String[] args) {
		SomaNumeros sm = new SomaNumeros();
		
		for( int i =0; i < 10; ++i) {
			sm.adicionarNumero(i);
		}
		//esperado 45
		System.out.println(sm.calcularSoma());
		
		//esperado 9
		System.out.printf("Maior número: ");
		System.out.println(sm.encontrarMaiorNumero());
		
		//esperado 0
		System.out.printf("Menor número: ");
		System.out.println(sm.encontrarMenorNumero());
	}
}
