package operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;

import operacoesBasicas.carrinhoDeCompras.models.Item;

public class CarrinhoDeCompras {
	private ArrayList<Item> items;

	public CarrinhoDeCompras() {
		super();
		items = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quant) {
		Item i = new Item(nome, preco, quant);
		
		items.add(i);
	}
	
	public void removerItem(String nome) {	
		for(Item item: items) {
			if(item.getNome().equals(nome)) {
				items.remove(item);
				return;
			}
		}
	}
	
	public double calcularValorTotal() {
		double valor = 0;
		
		for(Item item: items) {
			valor += item.getPreco();
		}
		
		return valor;
	}
	
	public void exibirItens() {
		for(Item i: items) {
			System.out.println("Item "+ items.indexOf(i));
			System.out.printf("Nome: %s\n", i.getNome());
			System.out.printf("Preço: R$ %.2f\n", i.getPreco());
			System.out.printf("Quantidade: %s\n\n", i.getQuantiade());
		}
		System.out.println("=================");
		
	}
}
