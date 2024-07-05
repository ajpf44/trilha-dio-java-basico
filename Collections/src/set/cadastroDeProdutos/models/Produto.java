package set.cadastroDeProdutos.models;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private long cod;
	private String nome;
	private double preco;
	private int quant;
	public Produto(long cod, String nome, double preco, int quant) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}
	public long getCod() {
		return cod;
	}
	public void setCod(long cod) {
		this.cod = cod;
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
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}
	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nome=" + nome + ", preco=" + preco + ", quant=" + quant + "]";
	}
	@Override
	public int compareTo(Produto o) {
		return this.nome.compareToIgnoreCase(o.getNome());
	}	
}
