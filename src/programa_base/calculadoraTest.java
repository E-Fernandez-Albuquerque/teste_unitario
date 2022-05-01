package programa_base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSoma() {
		float n1 = 10;
		float n2 = 5;
		float rEsperado = 15;
		float rReal = calculadora.soma(n1, n2);
		assertEquals(rReal, rEsperado);
	}
	
	@Test
	void test2Soma() {
		float n1 = -10;
		float n2 = 5;
		float rEsperado = -5;
		float rReal = calculadora.soma(n1, n2);
		assertEquals(rReal, rEsperado);
	}

	@Test
	void testSubtracao() {
		float n1 = 10;
		float n2 = 5;
		float rEsperado = 5;
		float rReal = calculadora.subtracao(n1, n2);
		assertEquals(rReal, rEsperado);
	}

	@Test
	void testMultiplicacao() {
		float n1 = 10;
		float n2 = 5;
		float rEsperado = 50;
		float rReal = calculadora.multiplicacao(n1, n2);
		assertEquals(rReal, rEsperado);
	}

	@Test
	void testDivisao() {
		float n1 = 10;
		float n2 = 5;
		float rEsperado = 2;
		float rReal = calculadora.divisao(n1, n2);
		assertEquals(rReal, rEsperado);
	}

	@Test
	void testPotenciacao() {
		float n1 = 10;
		float n2 = 5;
		float rEsperado = 100000;
		float rReal = calculadora.potenciacao(n1, n2);
		assertEquals(rReal, rEsperado);
	}

	@Test
	void testRadiciacao() {
		float n = 9;
		float rEsperado = 3;
		float rReal = calculadora.radiciacao(n);
		assertEquals(rReal, rEsperado);
	}

	@Test
	void testFatorial() {
		int n = 5;
		int rEsperado = 120;
		int rReal = calculadora.fatorial(n);
		assertEquals(rReal, rEsperado);
	}

}
