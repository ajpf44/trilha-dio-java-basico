package exceptions;

public class Util {
	public static int numbersOfAlgarisms(int num) {
		int algarisms = 0;
		
		do{
			algarisms++;
			
			num /=10;			
		} while(num > 0);
		
		return algarisms;
	}
	
	public static int countAlgarisms(int num) {
		return String.valueOf(num).length();
	}
}
