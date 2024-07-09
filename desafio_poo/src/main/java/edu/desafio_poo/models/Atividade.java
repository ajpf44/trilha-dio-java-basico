package edu.desafio_poo.models;

public class Atividade extends PraxisAbstract{

	public Atividade() {
		super();
	}

	public Atividade(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao, cargaHoraria);
	}
	
	public double calcularXp() {
		return cargaHoraria/2;	
	}
}
