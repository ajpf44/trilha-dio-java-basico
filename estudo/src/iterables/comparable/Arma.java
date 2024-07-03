package iterables.comparable;

public class Arma implements Comparable<Arma> {
	private String organizacao;
	private String nome;
	private int dano;
	private int municao;
	public Arma(String organizacao, String nome, int dano, int municao) {
		super();
		this.organizacao = organizacao;
		this.nome = nome;
		this.dano = dano;
		this.municao = municao;
	}
	public String getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getMunicao() {
		return municao;
	}
	public void setMunicao(int municao) {
		this.municao = municao;
	}
	
	@Override
	public int compareTo(Arma o) {
		return this.organizacao.compareTo(o.getOrganizacao());
	}
	
}