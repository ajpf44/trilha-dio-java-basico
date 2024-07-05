package set.listaDeTarefas;

public class Main {
	public static void main(String[] args) {
		ListaTarefas lt = new ListaTarefas();
		
		lt.adicionarTarefa("ganhar do romário");
		lt.adicionarTarefa("vencer do brasil de 2002");
		lt.adicionarTarefa("tomar um suquinho");
		lt.adicionarTarefa("beber água");
		lt.adicionarTarefa("estudar programção");
		
		lt.exibirTarefas();
		
		lt.removerTarefa("ganhar do romário");
		lt.marcarTarefaConcluida("estudar programção");
		lt.marcarTarefaConcluida("beber água");
		lt.exibirTarefas();
		
		lt.obterConcluidas().exibirTarefas();
		lt.obterPendentes().exibirTarefas();
		
		lt.limparListaTarefas();
		lt.exibirTarefas();
	}
}
