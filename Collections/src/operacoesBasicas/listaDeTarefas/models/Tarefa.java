package operacoesBasicas.listaDeTarefas.models;

public class Tarefa {
	private String descricao;

	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}