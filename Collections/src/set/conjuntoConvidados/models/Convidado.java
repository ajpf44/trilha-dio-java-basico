package set.conjuntoConvidados.models;

import java.util.Objects;

public class Convidado {
	private String nome;
	private int codigo;
	public Convidado(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigo=" + codigo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigo == other.codigo;
	}
}
