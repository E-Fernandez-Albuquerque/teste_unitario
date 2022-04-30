package programa_base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSomar() {
		calculadora calc = new calculadora();
		int x = 0;
		int y = 0;
		int soma = calc.somar(x, y);
		assertEquals(3, soma);
	}

}
