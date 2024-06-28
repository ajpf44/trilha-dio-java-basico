package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String args[]) {
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Por favor, digite as informações relativa a sua conta bancária");
		
		System.out.print("Número: ");
		int accountNumber = Integer.valueOf(sc.nextLine());

		System.out.print("Digite o número da agência: ");
		String bankBranch = sc.nextLine();
		
		System.out.print("Nome do clinte: ");
		String clientName = sc.nextLine();
		
		System.out.print("Digite o saldo da conta: ");
		double balance =  sc.nextDouble();
		String formattedBallance = String.format("R$ %.2f", balance).replace(".", ",");
		
		System.out.printf("\nOlá %s.\nObrigado por criar uma conta em nosso banco, sua agência é %.2s, conta %d e seu saldo %s já está disponível para saque", clientName, bankBranch, accountNumber, formattedBallance);
		sc.close();
	}
}
