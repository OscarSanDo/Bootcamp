package com.capgemini;


import javax.swing.JOptionPane;


public class JuegoDelNumero {

	public static void main(String[] args) {

			comenzarJuego();
			}

	
	public static void comenzarJuego() {
		
		int numeroUsuario;
		Juego juego = new Juego();
		

		do {

		numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
		"Adivina el número secreto que está entre 0 Y 100, \ntienes 10 intentos para acertarlo, introduce un número "));
		juego.jugada(numeroUsuario);

		JOptionPane.showMessageDialog(null, juego.getMensaje());

		} while (!juego.getTerminado());

	}
}
	
	
	
	
	
	



