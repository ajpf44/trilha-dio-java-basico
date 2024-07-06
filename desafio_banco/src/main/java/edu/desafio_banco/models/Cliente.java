package edu.desafio_banco.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Cliente 
{
	@Getter @Setter
	private String nome;
	@Getter @Setter
	private int idade;
	public Cliente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
}
