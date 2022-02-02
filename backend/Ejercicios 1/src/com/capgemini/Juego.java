package com.capgemini;

import java.util.Random;

public class Juego {
	
	private int intentos = 10;
	private Random random = new Random();
	private int numeroRandom = random.nextInt(101);
	private String mensaje = "";
	private boolean finalizarJuego = false;

	public Juego() {
		inicializar();
		}

	public void inicializar() {
	intentos = 10;
	numeroRandom = random.nextInt(101);
	mensaje = "";
	finalizarJuego = false;
	}



	public void jugada(int num) {



	if (num > numeroRandom) {
	mensaje = "El número secreto es MENOR que " + num + ", te quedan " + (intentos - 1) + " intentos.";
	} else if (num < numeroRandom) {
	mensaje = "El número secreto es MAYOR que " + num + ", te quedan " + (intentos - 1) + " intentos.";
	} else {
	mensaje = "Has acertado el número secreto, has necesitado " + (10 - (intentos - 1)) + " intentos.";



	finalizarJuego = true;
	return;
	}
	intentos--;



	if (intentos == 0) {
	mensaje = "No te quedan intentos, has perido la partida. El número secreto era: "   + num;



	finalizarJuego = true;
	}
	}



	public String getMensaje() {
	return mensaje;
	}



	public boolean getTerminado() {
	return finalizarJuego;
	}
	

}
