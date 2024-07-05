package set.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

import set.listaDeTarefas.models.Tarefa;

public class ListaTarefas {
	private Set<Tarefa> listTarefas;
	
	public ListaTarefas() {
		listTarefas = new HashSet<>();
	}
	
	
	
	public void adicionarTarefa(String desc) {
		listTarefas.add(new Tarefa(desc));
	}
	public void adicionarTarefa(Tarefa t) {
		listTarefas.add(t);
	}
	
	public void removerTarefa(String desc) {
		listTarefas.remove(new Tarefa(desc));
	}
	public void exibirTarefas() {
		System.out.println("Numero de tarefas: "+ this.contar());
		for(Tarefa t: listTarefas) {
			System.out.println(t.toString());
		}
		System.out.println("=============");
	}
	public int contar() {
		return listTarefas.size();
	}
	public ListaTarefas obterConcluidas(){
		ListaTarefas concluidas = new ListaTarefas();
		
		for(Tarefa t: listTarefas) {
			if(t.isCompleta()) {
				concluidas.adicionarTarefa(t);
			}
		}
		
		return concluidas;
	}
	public ListaTarefas obterPendentes(){
		ListaTarefas pendentes = new ListaTarefas();
		
		for(Tarefa t: listTarefas) {
			if(!t.isCompleta()) {
				pendentes.adicionarTarefa(t);
			}
		}
		
		return pendentes;
	}
	public void marcarTarefaConcluida(String desc) {
		for(Tarefa f: listTarefas) {
			if(f.equals(new Tarefa(desc))){
				f.setCompleta(true);
				break;
			}
		}
	}
	
	public void limparListaTarefas() {
		listTarefas.clear();
	}
}
