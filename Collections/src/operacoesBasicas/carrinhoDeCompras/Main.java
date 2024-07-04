package operacoesBasicas.carrinhoDeCompras;

public class Main {
	public static void main(String[] args) {
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		c.adicionarItem("Video Game Insano", 200.10, 3);
		c.adicionarItem("Varinha Mágica", 1287.20, 10);
		c.adicionarItem("Compilador Manual", 2.50, 1);
		c.adicionarItem("Abacus", 5.99, 23);
		
		c.exibirItens();
		c.removerItem("Compilador Manual");
		c.exibirItens();
	}
}
