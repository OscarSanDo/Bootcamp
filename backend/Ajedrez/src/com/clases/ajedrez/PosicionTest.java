package com.clases.ajedrez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PosicionTest {
	Posicion posicion1, posicion2, posicion3, posicion4;

	@Nested
	class Constructores {
		@Test
		void int_int_MovCorrecto() {
			assertAll("Validación posiciones correctas", () -> assertEquals(2, new Posicion(5, 2).getFila()),
					() -> assertEquals(5, new Posicion(5, 2).getColumna()),
					() -> assertEquals(3, new Posicion(6, 3).getFila()),
					() -> assertEquals(6, new Posicion(6, 3).getColumna()),
					() -> assertEquals(1, new Posicion(7, 1).getFila()),
					() -> assertEquals(7, new Posicion(7, 1).getColumna()));
		}

		@Test
		void char_char_MovCorrecto() {
			assertAll("Validación posiciones correctas", () -> assertEquals(1, new Posicion('A', '2').getFila()),
					() -> assertEquals(1, new Posicion('b', '2').getColumna()),
					() -> assertEquals(1, new Posicion('b', '2').getFila()),
					() -> assertEquals(2, new Posicion('C', '2').getColumna()),
					() -> assertEquals(6, new Posicion('H', '7').getFila()),
					() -> assertEquals(5, new Posicion('F', '5').getColumna()));
		}

		@Test
		void int_int_MovIncorrecto() {
			assertAll("Validación posiciones incorrectas",
					() -> assertThrows(JuegoException.class, () -> new Posicion(0, 1)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(1, 0)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(9, 3)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(9, 3)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(0, 0)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(9, 9)));
		}

		@Test
		void char_char_MovIncorrecto() {
			assertAll("Validación posiciones incorrectas",
					() -> assertThrows(JuegoException.class, () -> new Posicion('A', '9')),
					() -> assertThrows(JuegoException.class, () -> new Posicion('I', '1')),
					() -> assertThrows(JuegoException.class, () -> new Posicion('I', '9')),
					() -> assertThrows(JuegoException.class, () -> new Posicion('1', '8')),
					() -> assertThrows(JuegoException.class, () -> new Posicion('0', '0')));
		}
	}

	@Test
	void testEquals() throws JuegoException {
		posicion1 = new Posicion(5, 2);
		posicion2 = new Posicion('F', '3');
		posicion3 = new Posicion(2, 3);
		posicion4 = new Posicion('C', '4');
		assertAll("Comparacion", () -> assertTrue(posicion1.Equals(posicion2)),
				() -> assertTrue(posicion3.Equals(posicion4)), 
				() -> assertFalse(posicion2.Equals(posicion4)),
				() -> assertFalse(posicion1.Equals(posicion3)));
	}
}
