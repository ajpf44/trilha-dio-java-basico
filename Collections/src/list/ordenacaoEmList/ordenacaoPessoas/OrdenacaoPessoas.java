package list.ordenacaoEmList.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.ordenacaoEmList.ordenacaoPessoas.models.CompararAltura;
import list.ordenacaoEmList.ordenacaoPessoas.models.Pessoa;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoas;
	
	public OrdenacaoPessoas() {
		this.pessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		Pessoa p = new Pessoa(nome, idade, altura);
		pessoas.add(p);
	}
	
	public List<Pessoa> ordenarPorIdade(){
		Collections.sort(pessoas);
		return pessoas;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		Collections.sort(pessoas, new CompararAltura());
		
		return pessoas;
	}
	
	public List<Pessoa> ordenarPorIdade2(boolean ordemCrescente){
		int indice = ordemCrescente ? -1:+1;
		
		pessoas.sort((p1,p2)-> ( p2.getIdade()-p1.getIdade() )*indice );
		
		return pessoas;
	}
	public List<Pessoa> ordenarPorAltura2(boolean ordemCrescente){
		int indice = ordemCrescente ? -1:+1;
		
		pessoas.sort((p1,p2)-> (p2.getAltura()-p1.getAltura())>0?1*indice:-1*indice );
		
		return pessoas;
	}
}
