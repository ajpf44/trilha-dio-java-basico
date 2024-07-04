package operacoesBasicas.listaDeTarefas;

public class Main {
	public static void main(String[] args) {
		ListaTarefas lt = new ListaTarefas();
		lt.adicionarTarefa("Fazer comida");
		lt.adicionarTarefa("tirar uma pestana");
		lt.adicionarTarefa("tirar um cochilo");
		lt.adicionarTarefa("comer sobremesa");
		String str = "degustar uma cerveja artesanal";
		lt.adicionarTarefa(str);
		lt.removerTarefa(str);
		
		System.out.println("Numero total de tarefas: " + lt.obterNumeroTotalTarefas());
		
		String[] descTarefas = lt.obterDescricoesTarefas();
		
		for(String s: descTarefas) {
			System.out.println(s);
		}
		
	}
}
