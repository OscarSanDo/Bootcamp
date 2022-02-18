package com.capgemini;

import java.util.Random;

import javax.swing.JOptionPane;

public class JuegoDelNumero {

	int intentos = 10;
	private Random random = new Random();
	int numeroRandom = random.nextInt(101);
	private String mensaje = "";
	private boolean finalizarJuego = false;

	public JuegoDelNumero() {
		inicializar();
	}

	public void inicializar() {
		intentos = 10;
		numeroRandom = random.nextInt(101);
		mensaje = "Pendiente de empezar";
		finalizarJuego = false;
	}

	public static void comenzarJuego() {

		int numeroUsuario;
		JuegoDelNumero juego = new JuegoDelNumero();

		do {

			numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Adivina el número secreto que está entre 0 Y 100, \ntienes 10 intentos para acertarlo, introduce un número "));
			juego.jugada(numeroUsuario);

			JOptionPane.showMessageDialog(null, juego.getMensaje());

		} while (!juego.getTerminado());

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
