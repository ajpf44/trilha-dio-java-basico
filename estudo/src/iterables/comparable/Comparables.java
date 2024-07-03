package iterables.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//dois jetios de ordenar diferente;
public class Comparables {
	public static void main(String[] args) {
		//ordenarArtefatos();
		ordenarArmas();
	}
	
	static void ordenarArmas() {
		List<Arma> armas = new ArrayList<>();
		String[] organizacoes = {"S.H.I.E.L.D.", "Cyberdyne Systems", "Skynet", "Stark Industries", "Weyland-Yutani"};
		String[] nomes = {"Mjolnir", "T-800", "Arc Reactor", "Pulse Rifle", "Phaser"};
		int[] danos = {100, 150, 200, 250, 300};
		int[] municoes = {30, 50, 10, 60, 100};
		
		for(int i =0 ; i < danos.length; ++i) {
			Arma a = new Arma(organizacoes[i], nomes[i], danos[i], municoes[i]);
			armas.add(a);
		}
		
		//Dessa vez está ordenando pelo método implementado na pŕopria classe
		//como se fosse uma ordenização padrão
		Collections.sort(armas);
		
		for (Arma arma : armas) {
            System.out.println("Organizacao: " + arma.getOrganizacao());
            System.out.println("Nome: " + arma.getNome());
            System.out.println("Dano: " + arma.getDano());
            System.out.println("Municao: " + arma.getMunicao());
            System.out.println();
        }
	}
	
	static void ordenarArtefatos() {
		List<Artefato> artefatos = new ArrayList<>();
		String[] autores = {"Gandalf", "Fígaro", "Savos", "Saruman","Vingamo", "Aurelius"};
		String[] nomes = {"Espada da luz", "Navalha cinzenta", "Amuleto do infortúnio" ,"Língua traçoeira", "Presas penetrantes", "Alfebato Articulado"};
		Integer[] poderes = {10,6, 3, 5, 8, 2};
		
		for(int  i =0; i < poderes.length; ++i) {
			Artefato a = new Artefato(autores[i], nomes[i], poderes[i]);
			artefatos.add(a);
		}
		//Compare to parece que compara duas strings pra ver qual está na frente da outra
		//em termos de caracter
		artefatos.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()) );
		
		for( Artefato a: artefatos) {
			System.out.println(a.getNome() + " - " + a.getAutor() + " - " + a.getPoder());
		}
	}
}
