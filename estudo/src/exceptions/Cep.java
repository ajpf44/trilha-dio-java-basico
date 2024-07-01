package exceptions;

public class Cep {
	
	public static String formatCep(int cepNumbers) throws InvalidCepException {
		
		if(Util.numbersOfAlgarisms(cepNumbers) != 8)
			throw new InvalidCepException("At least 8 char must be given to format the cep");
		
		String formatedStr = String.valueOf(cepNumbers).substring(0,5) + "-" + String.valueOf(cepNumbers).substring(5);
		
		return formatedStr;
	}
}
