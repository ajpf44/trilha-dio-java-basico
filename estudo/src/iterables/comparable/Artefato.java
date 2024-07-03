package iterables.comparable;

public class Artefato {
	private String autor;
	private String nome;
	private int poder;
	
	public Artefato(String autor, String nome, int poder) {
		super();
		this.autor = autor;
		this.nome = nome;
		this.poder = poder;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	
}
