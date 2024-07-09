package edu.desafio_poo.models;

//Parar extender em cursos e atividades
public abstract class PraxisAbstract {
	protected String titulo;
	protected String descricao;
	protected int cargaHoraria;

	public PraxisAbstract() {
		
	}
	
	public PraxisAbstract(String titulo, String descricao, int cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
