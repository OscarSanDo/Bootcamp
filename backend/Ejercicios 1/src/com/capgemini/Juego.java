package com.capgemini;

import java.util.Random;

public class Juego {
	
	private int contador = 10;
	private Random random = new Random();
	private int numeroRandom = random.nextInt(101);
	private String mensaje = "";
	private boolean finalizarJuego = false;

	public Juego() {
		inicializar();
		}

	public void inicializar() {
	contador = 10;
	numeroRandom = random.nextInt(101);
	mensaje = "";
	finalizarJuego = false;
	}



	public void jugada(int num) {



	if (num > numeroRandom) {
	mensaje = "El n�mero secreto es MENOR que " + num + ", te quedan " + (contador - 1) + " intentos.";
	} else if (num < numeroRandom) {
	mensaje = "El n�mero secreto es MAYOR que " + num + ", te quedan " + (contador - 1) + " intentos.";
	} else {
	mensaje = "Has acertado el n�mero secreto, has necesitado " + (10 - (contador - 1)) + " intentos.";



	finalizarJuego = true;
	return;
	}
	contador--;



	if (contador == 0) {
	mensaje = "No te quedan intentos, has perido la partida. El n�mero secreto era: "   + num;



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