package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class JuegoTest {

	
	Juego juego;
	


	@BeforeEach
	void setUp() throws Exception {
		juego = new Juego();
		juego.numeroRandom = 50;
		}

//	@Test
//	void testJuego() {
//		fail("Not yet implemented");
//	}

	@Test
	void testInicializar() {
		juego.numeroRandom = -1;
		juego.inicializar();
		assertAll("Inicializar",
				() -> assertEquals("Pendiente de empezar", juego.getMensaje()),
				() -> assertEquals(10, juego.intentos),
				() -> assertTrue(0 < juego.numeroRandom && juego.numeroRandom <= 100, "rango entre 1 y 100")
				);	
		}
		

	@Nested
	class jugadas {
		@Test
		void test_es_mayor() {
			juego.jugada(51);
			assertAll("Jugada",
				() -> assertEquals("El número secreto es MENOR que 51, te quedan 9 intentos.", juego.getMensaje()),
				() -> assertEquals(1, juego.getJugada())
			);
		}
		@Test
		void test_es_menor()  {
			juego.jugada(49);
			assertAll("Jugada",
				() -> assertEquals("El número secreto es MAYOR que 49, te quedan 9 intentos.", juego.getMensaje()),
				() -> assertEquals(1, juego.getJugada())
			);
		}
		@Test
		void test_es_igual()  {
			juego.jugada(50);
			assertAll("Jugada",
				() -> assertEquals("Has acertado el número secreto, has necesitado 1 intentos.", juego.getMensaje()),
				() -> assertEquals(1, juego.getJugada())
			);
			
		}
	

//	@Test
//	void testGetMensaje() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetTerminado() {
//		fail("Not yet implemented");
//	}
	}
	
	@Test
	void intentos()  {
		for (int i=0; i<10; i++) {
		juego.jugada(56);
		}
		assertAll("Jugada",
			() -> assertEquals(true, juego.getTerminado()),
			() -> assertEquals("No te quedan intentos, has perido la partida. El número secreto era: 50", juego.getMensaje()),
			() -> assertEquals(10, juego.getJugada())
		);
		
}
}
