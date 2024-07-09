package edu.desafio_poo.models;

import java.time.LocalDate;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	
	private Set<Dev> devs;
	private Set<Mentoria> mentorias;
	private Set<Atividade> atividades;
	private Set<Curso> cursos;
	
	public Bootcamp() {}
	
	public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal, Set<Dev> devs,
			Set<Mentoria> mentorias, Set<Atividade> atividades, Set<Curso> cursos) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.devs = devs;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Set<Dev> getDevs() {
		return devs;
	}
	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
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
