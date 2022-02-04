package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDividir {

	@Test
	void dividir() {
		assertEquals (1.5, Calculadora.dividir(3.0, 2.0));
	}
	@Test
	void dividir0() {
		assertEquals (0, Calculadora.dividir(3.0, 0));
	}

}
