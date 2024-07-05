package pesquisaEmList.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

import pesquisaEmList.catalogoDeLivros.models.Livro;

public class CatalogoLivros {
	private ArrayList<Livro> livros;

	public CatalogoLivros() {
		this.livros = new ArrayList<>();
	}
	
	public void adicionarLivro(String autor, String nome, int anoPublicacao) {
		Livro l = new Livro(autor, nome, anoPublicacao);
		livros.add(l);
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosEncontrados = new ArrayList<>();
		
		for(Livro l: livros) {
			if(l.getAutor().equals(autor)) livrosEncontrados.add(l);
		}
		
		return livrosEncontrados;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosEncontrados = new ArrayList<>();
		
		for(Livro l: livros) {
			int ano = l.getAnoPublicacao();
			
			if(ano >= anoInicial && ano <= anoFinal) {
				livrosEncontrados.add(l);
			}
		}
		return livrosEncontrados;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		for(Livro l: livros) {
			if(l.getTitulo().equals(titulo)) return l;
		}
		
		return null;
	}
}
