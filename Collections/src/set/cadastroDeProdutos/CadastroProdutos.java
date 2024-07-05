package set.cadastroDeProdutos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import set.cadastroDeProdutos.models.Produto;

public class CadastroProdutos {
	private Set<Produto> listProd;
	
	public CadastroProdutos() {
		this.listProd = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		listProd.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public void exibirPorNomeCerto() {
		Set<Produto> prods = new TreeSet<>(listProd);
		
		for(Produto p: prods) {
			System.out.println(p.toString());
		}
	}
	
	public void exibirPorPrecoCerto() {
		Set<Produto> prods=  new TreeSet<>(new CompararPreco());
		prods.addAll(listProd);
		
		for(Produto p: prods) {
			System.out.println(p.toString());
		}
	}
	
	public void exibirPorNome(){
		List<Produto> prods = new ArrayList<>();
		
		for(Produto p: listProd) {
			prods.add(p);
		}
		prods.sort((p,p2)-> p.getNome().compareTo(p2.getNome()));
		
		for(Produto p: prods) {
			System.out.println(p.toString());
		}
	}
	
	public void exibirPorPreco(){
		List<Produto> prods = new ArrayList<>();
		
		for(Produto p: listProd) {
			prods.add(p);
		}
		prods.sort((p,p2)-> Double.compare(p.getPreco(), p2.getPreco()));
		
		for(Produto p: prods) {
			System.out.println(p.toString());
		}
	}
	
	
}
