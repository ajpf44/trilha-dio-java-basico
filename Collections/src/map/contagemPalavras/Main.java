package map.contagemPalavras;

public class Main {
	public static void main(String[] args) {
		ContagemPalavras cp = new ContagemPalavras();
		
		cp.adicionarPalavra("Lula" , 13);
		cp.adicionarPalavra("Molusco", 9);
		cp.adicionarPalavra("Patrick", 2);
		cp.adicionarPalavra("Estrela", 30);
		cp.adicionarPalavra("Ricardo", 2);
		cp.adicionarPalavra("Esponja", 8);
		cp.adicionarPalavra("o tal bob", 20);
		
		String mostCommon_str =cp.encontrarPalavraMaisFrequente();
		System.out.println(mostCommon_str);
		
		cp.removeWord(mostCommon_str);
		System.out.println(cp.encontrarPalavraMaisFrequente());
		
		System.out.println("====================");
		cp.showWordsCount();
	}
}
