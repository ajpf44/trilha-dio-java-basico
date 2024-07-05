package list.ordenacaoEmList.ordenacaoPessoas;

import java.util.List;

import list.ordenacaoEmList.ordenacaoPessoas.models.Pessoa;

public class Main {
	public static void main(String[] args) {
		OrdenacaoPessoas op = new OrdenacaoPessoas();
		
		op.adicionarPessoa("Alexandre", 25, 1.80);
		op.adicionarPessoa("Ronaldo", 48, 1.83);
		op.adicionarPessoa("Cristiano Ronaldo", 38, 1.87);
		op.adicionarPessoa("Yoda", 230, 1.20);
		op.adicionarPessoa("Gandalf",  152, 1.94);
		
		//caso true ordem crescente, caso false ordem decrescente
		List<Pessoa> listaPorAltura =  op.ordenarPorAltura();
		for(Pessoa p: listaPorAltura) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Altura: " + p.getAltura());
			System.out.println("Idade: " + p.getIdade());
			System.out.println();
		}
		
		System.out.println("===============");
		List<Pessoa> listaIdade = op.ordenarPorIdade();
		for(Pessoa p: listaIdade) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Altura: " + p.getAltura());
			System.out.println("Idade: " + p.getIdade());
			System.out.println();
		}
	}
}
