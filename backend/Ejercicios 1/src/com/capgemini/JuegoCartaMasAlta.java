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
				JOptionPane.showInputDialog(null, "Escoge una carta de la baraja (de la posicion 1 a la 52)")) - 1;
		if (jugador1 < 0 || jugador1 >= 52) {
			jugador1 = 0;
			JOptionPane.showMessageDialog(null,
					"El número introducido no es correcto se te asignará por defecto la primera carta del mazo");
			JOptionPane.showMessageDialog(null,
					(barajaNueva.baraja.get(0).getEtiqueta() + " de " + barajaNueva.baraja.get(0).getPalos()));
		} else {
			JOptionPane.showMessageDialog(null, (barajaNueva.baraja.get(jugador1).getEtiqueta() + " de "
					+ barajaNueva.baraja.get(jugador1).getPalos()));
		}
		
		
		jugador2 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Escoge una carta de la baraja (de la posicion 1 a la 52)")) - 1;
		if (jugador2 < 0 || jugador2 >= 52 || jugador2 == jugador1) {
			jugador2 = 51;
			JOptionPane.showMessageDialog(null,
					"El número introducido no es correcto se te asignará por defecto la última carta del mazo");
			JOptionPane.showMessageDialog(null,
					(barajaNueva.baraja.get(51).getEtiqueta() + " de " + barajaNueva.baraja.get(51).getPalos()));
		} else {
			JOptionPane.showMessageDialog(null, (barajaNueva.baraja.get(jugador2).getEtiqueta() + " de "
					+ barajaNueva.baraja.get(jugador2).getPalos()));
		}


		barajaNueva.compararValorCarta(barajaNueva.baraja.get(jugador1), barajaNueva.baraja.get(jugador2));

	}

}
