package condicional;

public class CondicionalSimples {

	public static void main(String args[]) {
		double balance = 11.30;
		double withdrawal = 10;
		
		if(balance >= withdrawal) {
			System.out.println("Transaction accepted");
			System.out.printf("New balance: $%.2f", balance-withdrawal);
			return ;
		}
		
		System.out.println("Transaction dennied");
	}
}
