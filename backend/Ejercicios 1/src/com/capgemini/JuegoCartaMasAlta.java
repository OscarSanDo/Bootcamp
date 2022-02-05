package com.capgemini;

import javax.swing.JOptionPane;

import com.enums.TipoJuego;

public class JuegoCartaMasAlta {

	public static void main(String[] args) {

		comenzarJuego();

	}

	public static void comenzarJuego() {

		int jugador1, jugador2;
		BarajaCartas barajaNueva = new BarajaCartas(TipoJuego.POKER);
		barajaNueva.barajar();

		jugador1 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Escoge una carta de la baraja (de la posicion 0 a la 51)"));

	

		JOptionPane.showMessageDialog(null, (barajaNueva.baraja.get(jugador1).getEtiqueta() + " de "
				+ barajaNueva.baraja.get(jugador1).getPalos()));

		jugador2 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Escoge una carta de la baraja (de la posicion 0 a la 51)"));

		JOptionPane.showMessageDialog(null, (barajaNueva.baraja.get(jugador2).getEtiqueta() + " de "
				+ barajaNueva.baraja.get(jugador2).getPalos()));

		// barajaNueva.mostrarBaraja(); //muestra baraja para comprobar que los indices
		// corresponden

		barajaNueva.compararValorCarta(barajaNueva.baraja.get(jugador1), barajaNueva.baraja.get(jugador2));

	}

}
