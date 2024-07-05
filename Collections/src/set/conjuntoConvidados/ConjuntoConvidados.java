package set.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

import set.conjuntoConvidados.models.Convidado;

public class ConjuntoConvidados {
	Set<Convidado> convs;

	public ConjuntoConvidados() {
		super();
		this.convs = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigo) {
		convs.add(new Convidado(nome, codigo));
	}
	
	public void removeConvidado(int cod) {
		for(Convidado c: convs) {
			if(c.getCodigo() == cod) {
				convs.remove(c);
				break;
			}
		}
	}
	
	public int contar() {
		return convs.size();
	}
	
	public void exibirConvidados() {
		for(Convidado c: convs) {
			System.out.println(c.toString());
		}
	}
}
