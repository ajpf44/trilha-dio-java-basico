package edu.desafio_poo.models;

public class Curso extends PraxisAbstract {

	public Curso() {
		super();
	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao, cargaHoraria);
	}
	
	public void exibir() {
		System.out.println("Curso: " + this.titulo);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Carga Horaria: " + this.cargaHoraria);
		System.out.println("===================");
	}
}
