package pesquisaEmList.catalogoDeLivros;

import java.util.List;

import pesquisaEmList.catalogoDeLivros.models.Livro;

public class Main {
	public static void main(String[] args) {
		CatalogoLivros cl = new CatalogoLivros();
		
		cl.adicionarLivro("Tolkien", "O hobbit", 1937);
		cl.adicionarLivro("Midrovar", "Funcionária Argoniana", 1500);
		cl.adicionarLivro("Ardoriana III","O grande conto",  1940);
		cl.adicionarLivro("Tolkien", "A sociedade do anel", 1954);
		
		List<Livro> tolkienLivros = cl.pesquisarPorAutor("Tolkien");
		
		System.out.println("os livros de tolkien: " + tolkienLivros.size() + " livros");
		for(Livro l: tolkienLivros) {
			System.out.println(l.getTitulo() + " - " + l.getAnoPublicacao());
		}
		
		List<Livro> livrosAntigos = cl.pesquisarPorIntervaloAnos(0, 1600);
		System.out.println("\nLivros antigos: ");
		for(Livro l: livrosAntigos) {
			System.out.println(l.getTitulo() + " - " + l.getAnoPublicacao() + " - " +l.getAutor());
		}
		
		String tituloLivro = "O grande conto";
		Livro livro = cl.pesquisarPorTitulo(tituloLivro);
		System.out.println("\npesquisando o livro: " + tituloLivro);
		System.out.println(livro.getTitulo() + " - " + livro.getAnoPublicacao() + " - " +livro.getAutor());
	}
}
