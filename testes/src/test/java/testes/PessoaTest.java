package testes;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testes.models.Pessoa;

public class PessoaTest
{

	Pessoa p = new Pessoa("Ronaldo", LocalDate.of(2000, 10, 11));
	@Test
	void validarIdade() {
		Assertions.assertEquals(24, p.getIdade() );
	}
	@Test
	void validarNome() {
		Assertions.assertEquals("Ronaldo", p.getNome());
	}
	@Test
	void validarMaiorIdade() {
		Assertions.assertTrue(p.eMaiorIdade());
	}
}
