package edu.desafio_poo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import edu.desafio_poo.models.Atividade;
import edu.desafio_poo.models.Bootcamp;
import edu.desafio_poo.models.Curso;
import edu.desafio_poo.models.Dev;
import edu.desafio_poo.models.Mentoria;

public class Application {
	public static void main(String[] args) {
		Mentoria ment1 = new Mentoria("Explorando o Universo das Partículas", "Descubra o mundo subatômico", LocalDate.of(2024, 7, 10));
		Mentoria ment2 = new Mentoria("Construindo Castelos de Areia", "Técnicas avançadas de escultura", LocalDate.of(2024, 8, 15));
		Mentoria ment3 = new Mentoria("Desvendando o Código dos Piratas", "Aprenda a programar como um verdadeiro corsário", LocalDate.of(2024, 9, 20));
		Mentoria ment4 = new Mentoria("Navegando pelos Mares do Tempo", "Exploração temporal: teoria e prática", LocalDate.of(2024, 10, 25));
		
		Atividade ativ1 = new Atividade("Programando ao Luar", "Uma atividade noturna de codificação", 20);
		Atividade ativ2 = new Atividade("Escalando Montanhas", "Aventura extrema em altitudes elevadas", 40);
		Atividade ativ3 = new Atividade("Desvendando Mistérios Antigos", "Exploração arqueológica em ruínas perdidas", 30);
		Atividade ativ4 = new Atividade("Dançando sob as Estrelas", "Aprenda danças tradicionais de diferentes culturas", 15);
		
		Curso curso1 = new Curso("A Arte do Equilíbrio", "Domine técnicas milenares de concentração", 120);
		Curso curso2 = new Curso("Exploração das Profundezas Marinhas", "Aprenda sobre vida marinha e oceanografia", 180);
		Curso curso3 = new Curso("A Ciência das Poções Mágicas", "Descubra os segredos da alquimia em prática", 150);
		Curso curso4 = new Curso("Gastronomia dos Sete Reinos", "Explore a culinária dos mundos fantásticos", 90);
		
		Set<Mentoria> mentorias = new HashSet<>(Arrays.asList(ment1, ment2, ment3, ment4));
		Set<Curso> cursos = new HashSet<>(Arrays.asList(curso1, curso2, curso3, curso4));
		Set<Atividade> atividades = new HashSet<>(Arrays.asList(ativ1, ativ2, ativ3, ativ4)); 
		
		Dev dev1 = new Dev("Ricardão", mentorias, atividades, cursos);
		Dev dev2 = new Dev("Jonas", mentorias, atividades, cursos);
		Set<Dev> devs = new HashSet<>(Arrays.asList(dev1,dev2));
		Bootcamp b = new Bootcamp("Java Incrível", "O incrível mundo de java"
				, LocalDate.now(), LocalDate.of(2025, 03, 12), devs
				, mentorias, atividades, cursos);
		
		dev1.exibirCursos();
		double xp = dev2.calcularTotalXp();
		System.out.println("Total de xp do dev2: " + xp);
	}
}
