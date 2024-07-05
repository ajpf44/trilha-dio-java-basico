package map.livrariaOnline;

public class Main {
	public static void main(String[] args) {
		BookStore bs = new BookStore();
		
		bs.addBook("123", "O Grande Autor", "Robson Crusafontes", "www.livro.com", 24.50);
		bs.addBook("124", "Aventuras no Mar", "Carlos Navegante", "www.aventurasnomar.com", 19.99);
		bs.addBook("125", "Mistério na Floresta", "Ana Silva", "www.misterionafloresta.com", 14.75);
		bs.addBook("126", "O Segredo do Vale", "Mariana Campos", "www.osegredodovale.com", 21.30);
		bs.addBook("127", "A Jornada do Herói", "Lucas Mendes", "www.ajornadadoheroi.com", 29.99);
		bs.addBook("128", "Histórias de Um Reino", "Paula Almeida", "www.historiasdeumreino.com", 17.85);
		bs.addBook("129", "O Código Perdido", "Rafael Couto", "www.ocodigoperdido.com", 23.60);
		bs.addBook("130", "O Destino de uma Nação", "Fernanda Rocha", "www.odestinodeumanacao.com", 18.45);
		bs.addBook("131", "Memórias de Um Cientista", "Ricardo Farias", "www.memoriasdecientista.com", 26.00);
		bs.addBook("132", "Contos do Futuro", "Beatriz Souza", "www.contosdofuturo.com", 20.75);
		
		bs.logByPrice();
	}
}
