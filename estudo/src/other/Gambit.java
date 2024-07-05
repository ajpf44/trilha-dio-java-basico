package other;

import java.util.concurrent.ThreadLocalRandom;

public class Gambit {
	public static void main(String[] args) {
		int[] chooses= new int[4];
		
		for(int i =0; i < chooses.length; ++i) {
			chooses[i] = ThreadLocalRandom.current().nextInt(1,19);
			System.out.println("Desafio " + (i+1) + ": " + chooses[i]);
		}
	}
	
}
