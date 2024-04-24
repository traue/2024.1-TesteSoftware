package br.mack.voto.test;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import br.mack.voto.Eleicao;

public class EleicaoTest {

	public EleicaoTest() {
	}

	Eleicao objEleicao = new Eleicao();

	@Test
	public void testClassificaEleitorInvalido() {
		System.out.println("Teste classificaEleitor Invalido");
		assertEquals("Idade invalida", objEleicao.classificaEleitor(-1));
		assertEquals("Idade invalida", objEleicao.classificaEleitor(131));
	}

	@Test
	public void testClassificaEleitorNaoPermitido() {
		System.out.println("Teste classificaEleitor Nao permitido");
		assertEquals("Não permitido", objEleicao.classificaEleitor(0));
		assertEquals("Não permitido", objEleicao.classificaEleitor(1));
		assertEquals("Não permitido", objEleicao.classificaEleitor(14));
		assertEquals("Não permitido", objEleicao.classificaEleitor(15));
	}

	@Test
	public void testClassificaEleitorFacultativo() {
		System.out.println("Teste classificaEleitor Facultativo");
		assertEquals("Facultativo", objEleicao.classificaEleitor(16));
		assertEquals("Facultativo", objEleicao.classificaEleitor(17));
		assertEquals("Facultativo", objEleicao.classificaEleitor(70));
		assertEquals("Facultativo", objEleicao.classificaEleitor(71));
		assertEquals("Facultativo", objEleicao.classificaEleitor(129));
		assertEquals("Facultativo", objEleicao.classificaEleitor(130));
	}

	@Test
	public void testClassificaEleitorObrigatorio() {
		System.out.println("Teste classificaEleitor Obrigatorio");
		assertEquals("Obrigatório", objEleicao.classificaEleitor(18));
		assertEquals("Obrigatório", objEleicao.classificaEleitor(19));
		assertEquals("Obrigatório", objEleicao.classificaEleitor(68));
		assertEquals("Obrigatório", objEleicao.classificaEleitor(69));
	}

}
