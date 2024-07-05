package set.conjuntoConvidados;

public class Main {
	public static void main(String[] args) {
		ConjuntoConvidados cc = new ConjuntoConvidados();
		cc.adicionarConvidado("João Ninguém", 1);
		cc.adicionarConvidado("João Ninguém", 1);
		cc.adicionarConvidado("Ronaldão", 12);
		
		System.out.println("numero: " + cc.contar());
		cc.exibirConvidados();
		System.out.println("=========");
		cc.removeConvidado(12);
		cc.exibirConvidados();
	}
}
