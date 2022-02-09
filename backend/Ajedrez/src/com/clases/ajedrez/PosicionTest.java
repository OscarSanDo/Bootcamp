package com.clases.ajedrez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosicionTest {
	
	Posicion posicion;
	
	@BeforeEach
	void setUp() throws Exception {
	
	}

	@Test
	void testPosicionIntInt() throws JuegoException {
		
		
		assertAll("Constructor",
				() -> assertEquals(1, new Posicion(1, 1).getFila()),
				() -> assertEquals(1, new Posicion(1, 1).getColumna()),
				() -> assertEquals(4, new Posicion(4, 1).getFila()),
				() -> assertEquals(4, new Posicion(1, 4).getColumna()),
				() -> assertEquals(6, new Posicion(6, 1).getFila()),
				() -> assertThrows(JuegoException.class, () -> new Posicion(9, 1))
				);
		
	}

//	@Test
//	void testPosicionCharChar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetFila() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetColumna() {
//		fail("Not yet implemented");
//	}

}
