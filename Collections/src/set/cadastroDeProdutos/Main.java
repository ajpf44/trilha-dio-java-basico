package set.cadastroDeProdutos;

public class Main {
	public static void main(String[] args) {
		CadastroProdutos cp = new CadastroProdutos();
		
		cp.adicionarProduto(1, "Produto A", 10.20, 2);
		cp.adicionarProduto(2, "Produto B", 15.50, 3);
		cp.adicionarProduto(3, "Produto C", 8.99, 5);
		cp.adicionarProduto(6, "1984", 13.45, 3);
		cp.adicionarProduto(10, "Água Mineral", 2.50, 10);
		cp.adicionarProduto(11, "Água de Coco", 3.75, 7);
		cp.adicionarProduto(12, "Água Tônica", 4.20, 5);
		cp.adicionarProduto(13, "Água com Gás", 3.00, 8);
		cp.adicionarProduto(7, "O Senhor dos Anéis", 25.90, 2);
		cp.adicionarProduto(8, "Dom Quixote", 17.80, 4);
		cp.adicionarProduto(9, "Guerra e Paz", 20.50, 1);
		cp.adicionarProduto(4, "Produto D", 22.30, 1);
		cp.adicionarProduto(5, "Produto E", 19.75, 4);
		
		//cp.exibirPorNome();
		//cp.exibirPorPreco();
		//cp.exibirPorNomeCerto();
		cp.exibirPorPrecoCerto();
	}
}
