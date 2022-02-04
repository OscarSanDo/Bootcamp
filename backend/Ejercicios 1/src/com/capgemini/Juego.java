package com.capgemini;

import java.util.Random;

public class Juego {

	int intentos = 10;
	private Random random = new Random();
	int numeroRandom = random.nextInt(101);
	private String mensaje = "";
	private boolean finalizarJuego = false;

	public Juego() {
		inicializar();
	}

	public void inicializar() {
		intentos = 10;
		numeroRandom = random.nextInt(101);
		mensaje = "Pendiente de empezar";
		finalizarJuego = false;
	}

	public void jugada(int num) {
		intentos--;
		if (num > numeroRandom) {
			mensaje = "El número secreto es MENOR que " + num + ", te quedan " + (intentos) + " intentos.";
		} else if (num < numeroRandom) {
			mensaje = "El número secreto es MAYOR que " + num + ", te quedan " + (intentos) + " intentos.";
		} else {
			mensaje = "Has acertado el número secreto, has necesitado " + (10 - (intentos)) + " intentos.";

			finalizarJuego = true;
			return;
		}
	

		if (intentos == 0) {
			finalizarJuego = true;
			mensaje = "No te quedan intentos, has perido la partida. El número secreto era: " + numeroRandom;

			
		}
	}

	public String getMensaje() {
		return mensaje;
	}

	public boolean getTerminado() {
		return finalizarJuego;
	}

	public int getJugada() {
		return 10 - intentos;
	}
}
