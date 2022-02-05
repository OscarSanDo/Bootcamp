package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import com.enums.Palos;
import com.enums.TipoJuego;

public class BarajaCartas {

	public ArrayList<Carta> baraja;

	public BarajaCartas(TipoJuego tipoJuego) {
		crearBaraja(tipoJuego);
	}

	public void juegoBlackJack() {

		baraja = new ArrayList<>();

		for (Palos palo : Palos.values()) { // for each
			for (int i = 1; i <= 13; i++) {
				switch (i) {
				case 1:
					baraja.add(new Carta(i, palo, 11, "AS"));
					break;
				case 11:
					baraja.add(new Carta(i, palo, 10, "J"));
					break;
				case 12:
					baraja.add(new Carta(i, palo, 10, "Q"));
					break;
				case 13:
					baraja.add(new Carta(i, palo, 10, "K"));
					break;
				default:
					baraja.add(new Carta(i, palo, i, Integer.toString(i)));
					break;
				}
			}
		}

	}

	public void juegoPoker() {

		baraja = new ArrayList<>();

		for (Palos palo : Palos.values()) { // for each
			for (int i = 1; i <= 13; i++) {
				switch (i) {
				case 1:
					baraja.add(new Carta(i, palo, 14, "AS"));
					break;
				case 11:
					baraja.add(new Carta(i, palo, 11, "J"));
					break;
				case 12:
					baraja.add(new Carta(i, palo, 12, "Q"));
					break;
				case 13:
					baraja.add(new Carta(i, palo, 13, "K"));
					break;
				default:
					baraja.add(new Carta(i, palo, i, Integer.toString(i)));
					break;
				}
			}
		}

	}

	public void crearBaraja(TipoJuego tipoJuego) {

		if (tipoJuego == TipoJuego.BLACKJACK) {
			juegoBlackJack();
		} else if (tipoJuego == TipoJuego.POKER) {
			juegoPoker();
		}

	}

	public void mostrarBaraja() {
		for (int i = 0; i < baraja.size(); i++) {
			System.out.println(baraja.get(i).getNumero() + " de " + baraja.get(i).getPalos() + " Valor: "
					+ baraja.get(i).getValor() + " Etiqueta: " + baraja.get(i).getEtiqueta());
		}

	}

	public void barajar() {
		Collections.shuffle(baraja);

	}

	public void repartirCarta() {
		baraja.get(0);
		baraja.remove(0);
	}

	public void compararValorCarta(Carta carta1, Carta carta2) {
		if (carta1.getValor() == carta2.getValor()) {
			JOptionPane.showMessageDialog(null, ("Las cartas comparadas son iguales"));
		} else if (carta1.getValor() > carta2.getValor()) {
			JOptionPane.showMessageDialog(null, ("La carta del primer jugador es mayor que la del segundo"));
		} else {
			JOptionPane.showMessageDialog(null, ("La carta del segundo jugador es mayor que la del primero"));
		}
	}
}
