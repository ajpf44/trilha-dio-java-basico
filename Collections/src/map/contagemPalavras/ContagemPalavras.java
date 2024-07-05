package map.contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	private Map<String, Integer> words;
	
	public ContagemPalavras() {
		this.words = new HashMap<String, Integer>();
	}
	
	public void adicionarPalavra(String word, int cont) {
		words.put(word, cont);
	}
	
	public void removeWord(String word) {
		words.remove(word);
	}
	
	public void showWordsCount() {
		for(Map.Entry<String, Integer> word: words.entrySet()) {
			System.out.println(word.getKey() + ": " + word.getValue() );
		}
	}
	
	public String encontrarPalavraMaisFrequente() {
		String foundStr = null;
		int count = 0;
		for(Map.Entry<String, Integer> word: words.entrySet()) {
			if(word.getValue() > count) {
				count = word.getValue();
				foundStr = word.getKey();
			}
		}
		
		return foundStr;
	}
}
