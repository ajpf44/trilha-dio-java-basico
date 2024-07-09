package edu.desafio_poo.models;

import java.util.Set;

public class Dev {
	private String nome;
	private Set<Mentoria> mentorias;
	private Set<Atividade> atividades;
	private Set<Curso> cursos;
	
	public void inscreverBootcamp(Bootcamp boot) {
		boot.getDevs().add(this);
	}
	
	public void progredir() {
		System.out.println("Progredindo");
	}
	
	public double calcularTotalXp () {
		double ativsXp = atividades.stream()
			.mapToDouble(Atividade::calcularXp)
			.sum();
		
		double mentXp = mentorias
				.stream()
				.mapToDouble(Mentoria::calcularXp)
				.sum();
		
		return mentXp + ativsXp;
	}
	
	public void exibirCursos() {
		System.out.println("Cursos de: " + this.nome);
		cursos.forEach(c->c.exibir());
	}
	
	

	public Dev(String nome, Set<Mentoria> mentorias, Set<Atividade> atividades, Set<Curso> cursos) {
		super();
		this.nome = nome;
		this.mentorias = mentorias;
		this.atividades = atividades;
		this.cursos = cursos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Mentoria> getMentorias() {
		return mentorias;
	}

	public void setMentorias(Set<Mentoria> mentorias) {
		this.mentorias = mentorias;
	}

	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(Set<Atividade> atividades) {
		this.atividades = atividades;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}
}
