package edu.desafio_banco;

import edu.desafio_banco.models.Cliente;
import edu.desafio_banco.models.ContaPoupanca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Cliente cliente = new Cliente("Alexandre", 25);
		ContaPoupanca cp = new ContaPoupanca("359-9", "0293", cliente , 2000.20 );
		
		cp.info_rendimento(24);
		
		String numero_conta = cp.getNumero();
		System.out.println(numero_conta);
		cp.log_info_conta();
    }
}
