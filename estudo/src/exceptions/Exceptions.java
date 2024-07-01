package exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class Exceptions {
	public static void main(String[] args) {
		
		String newCep = Cep.formatCep(29190920);
		
		System.out.println(newCep);
	}
	
	public static double valueOfString() {
		String str = "19.80";
		
		double strValue = Double.valueOf(str);
		
		return strValue - 10;
	}
	
	public static Number valueOfStringError() {
		String str = "10.60";
		
		try {
			return NumberFormat.getInstance().parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 10;
	}
}
