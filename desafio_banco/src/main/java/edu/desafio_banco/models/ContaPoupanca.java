package edu.desafio_banco.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
public class ContaPoupanca extends Conta 
{
	@Getter @Setter
	private double taxa_rendimento_mes;
	public ContaPoupanca(String agencia, String numero, Cliente titular, double saldo) 
	{
		super(agencia, numero, titular, saldo);
		this.taxa_rendimento_mes = 0.005;
	}
	
	public double info_rendimento(int meses) 
	{
		double saldo = super.getSaldo();
		double taxa= 1+taxa_rendimento_mes;
		double rendimento = saldo * Math.pow(taxa, meses);
		
		System.out.printf("O rendimento durante %d meses, será de %.2f para %.2f\n", meses,saldo ,rendimento);
		return rendimento;
	}
	
	@Override
	public void log_info_conta() 
	{
		super.log_info_conta();
		System.out.println("Taxa de rendimento: " + this.taxa_rendimento_mes*100 + "% /mês");
		System.out.println("==================");
	}
}
