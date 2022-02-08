package com.capgemini;

import javax.swing.JOptionPane;


public class JuegoCartaMasAltaEsp {

	public static void main(String[] args) {
		comenzarJuego();
		
	}

	public static void comenzarJuego() {

		int jugador1, jugador2;
		BarajaEspInc barajaNueva = new BarajaEspInc();
		barajaNueva.barajar();

		jugador1 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Escoge una carta de la baraja (de la posicion 1 a la 52)")) - 1;
		
		//Cambiar valores de control dependiendo de la longitud de la baraja.
		
		
		if (jugador1 < 0 || jugador1 >= 52) {
			jugador1 = 0;
			JOptionPane.showMessageDialog(null,
					"El número introducido no es correcto se te asignará por defecto la primera carta del mazo");
			JOptionPane.showMessageDialog(null,
					(barajaNueva.baraja.get(0).getValor() + " de " + barajaNueva.baraja.get(0).getPalos()));
		} else {
			JOptionPane.showMessageDialog(null, (barajaNueva.baraja.get(jugador1).getValor() + " de "
					+ barajaNueva.baraja.get(jugador1).getPalos()));
		}

		jugador2 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Escoge una carta de la baraja (de la posicion 1 a la 52)")) - 1;
		if (jugador2 < 0 || jugador2 >= barajaNueva.getTamaño() || jugador2 == jugador1) {
			jugador2 = barajaNueva.getTamaño()-1;
			JOptionPane.showMessageDialog(null,
					"El número introducido no es correcto se te asignará por defecto la última carta del mazo");
			JOptionPane.showMessageDialog(null,
					(barajaNueva.baraja.get(barajaNueva.getTamaño()-1).getValor() + " de " + barajaNueva.baraja.get(barajaNueva.getTamaño()-1).getPalos()));
		} else {
			JOptionPane.showMessageDialog(null, (barajaNueva.baraja.get(jugador2).getValor() + " de "
					+ barajaNueva.baraja.get(jugador2).getPalos()));
		}

		barajaNueva.compararValor(barajaNueva.baraja.get(jugador1), barajaNueva.baraja.get(jugador2));
	}

}
