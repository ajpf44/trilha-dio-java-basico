package testes.models;

import java.time.LocalDate;

public class Pessoa 
{
	private String nome;
	private LocalDate dataNascimento;
	private int idade;
	
	public boolean eMaiorIdade() {
		return idade>=18;
	}
	
	public Pessoa(String nome, LocalDate data) {
		this.nome = nome;
		this.dataNascimento = data;
		this.idade = LocalDate.now().compareTo(data);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", idade=" + idade + "]";
	}
}
