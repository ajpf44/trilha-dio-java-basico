package set.agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

import set.agendaDeContatos.models.Contato;

public class AgendaContatos {
	private Set<Contato> contatos;
	
	public AgendaContatos() {
		this.contatos = new HashSet<>();
	}
	public void adicionarContato(String nome, int num) {
		contatos.add(new Contato(nome, num));
	}
	
	public void exibirContatos() {
		for(Contato c: contatos) {
			System.out.println(c.toString());
		}
	}
	
	public Set<Contato> pesquisar(String nome) {
		Set<Contato> cEncontrados = new HashSet<>();
			for(Contato c: contatos) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					cEncontrados.add(c);
				}
			}
		return cEncontrados;
	}
	public Contato atualizarNumero(String nome, int num) {
		Contato c = this.pesquisar(nome).iterator().next();
		c.setNumero(num);
		return c;
	}
}
