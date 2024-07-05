package set.listaDeTarefas.models;

import java.util.Objects;

public class Tarefa {
	private String descricao;
	private boolean completa;
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
		this.completa = false;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isCompleta() {
		return completa;
	}
	public void setCompleta(boolean completa) {
		this.completa = completa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}
	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", completa=" + completa + "]";
	}
	
}
