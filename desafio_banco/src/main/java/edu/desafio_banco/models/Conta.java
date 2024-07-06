package edu.desafio_banco.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Conta 
{
	@Getter @Setter
	private String agencia;
	@Getter @Setter
	private String numero;
	@Getter @Setter
	private Cliente titular;
	@Getter @Setter
	private double saldo;
	
	public Conta(String agencia, String numero, Cliente titular, double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public double sacar(double valor) {
		this.saldo -= valor;
		return saldo;
	}
	public double depositar(double valor) {
		this.saldo += valor;
		return valor;
	}
	
	public void log_info_conta() {
		System.out.println("Informações da conta");
		System.out.println("Numero: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("Saldo: " + this.saldo);
	}
}
