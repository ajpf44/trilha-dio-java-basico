package set.agendaDeContatos;

import java.util.Set;

import set.agendaDeContatos.models.Contato;

public class Main {
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Gás nobre", 8);
		agenda.adicionarContato("Maluco beleza", 0);
		agenda.adicionarContato("Ricardinho", 19);
		agenda.adicionarContato("Gás nobre", 10);
		
		agenda.exibirContatos();
		
		agenda.atualizarNumero("ricardinho", 2024);
		System.out.println("============\n");
		agenda.exibirContatos();
		
		System.out.println("============\n");
		Set<Contato > cs = agenda.pesquisar("Gás nobre");
		for(Contato c: cs) {
			System.out.println(c.toString());
		}
	}
}
