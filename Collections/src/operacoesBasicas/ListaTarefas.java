package operacoesBasicas;

import java.util.ArrayList;

import operacoesBasicas.models.Tarefa;

public class ListaTarefas {
	private ArrayList<Tarefa> tarefas;
	
	public ListaTarefas() {
		this.tarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		for(Tarefa t: tarefas) {
			if(t.getDescricao().equals(descricao)){
				tarefas.remove(t);
				break;
			}
		}
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefas.size();
	}
	
	public String[] obterDescricoesTarefas() {
		String[] descricaoTarefas = new String[tarefas.size()];
		
		for(int i =0; i < tarefas.size(); ++i) {
			descricaoTarefas[i] = tarefas.get(i).getDescricao();
		}
		
		return descricaoTarefas;
	}
}
