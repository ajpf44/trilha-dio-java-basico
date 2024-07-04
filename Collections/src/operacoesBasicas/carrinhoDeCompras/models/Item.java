package operacoesBasicas.carrinhoDeCompras.models;

public class Item {
	private String nome;
	private double preco;
	private int quantiade;
	
	public Item(String nome, double preco, int quantiade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantiade = quantiade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantiade() {
		return quantiade;
	}

	public void setQuantiade(int quantiade) {
		this.quantiade = quantiade;
	}
}
