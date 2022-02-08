package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;


import com.enums.PalosFr;
import com.enums.TipoJuego;

public class BarajaFr {

	public ArrayList<CartaFr> baraja;
	

	public BarajaFr(TipoJuego tipoJuego) {
		crearBaraja(tipoJuego);
	}

	public void crearBaraja(TipoJuego tipoJuego) {

		if (tipoJuego == TipoJuego.BLACKJACK) {
			barajaBlackJack();
		} else if (tipoJuego == TipoJuego.POKER) {
			barajaPoker();
		}

	}
	
	public void barajaBlackJack() {

		baraja = new ArrayList<>();

		for (PalosFr palo : PalosFr.values()) { // for each
			for (int i = 1; i <= 13; i++) {
				switch (i) {
				case 1:
					baraja.add(new CartaFr(i, palo, 11, "AS"));
					break;
				case 11:
					baraja.add(new CartaFr(i, palo, 10, "J"));
					break;
				case 12:
					baraja.add(new CartaFr(i, palo, 10, "Q"));
					break;
				case 13:
					baraja.add(new CartaFr(i, palo, 10, "K"));
					break;
				default:
					baraja.add(new CartaFr(i, palo, i, Integer.toString(i)));
					break;
				}
			}
		}

	}

	public void barajaPoker() {

		baraja = new ArrayList<>();

		for (PalosFr palo : PalosFr.values()) { // for each
			for (int i = 1; i <= 13; i++) {
				switch (i) {
				case 1:
					baraja.add(new CartaFr(i, palo, 14, "AS"));
					break;
				case 11:
					baraja.add(new CartaFr(i, palo, 11, "J"));
					break;
				case 12:
					baraja.add(new CartaFr(i, palo, 12, "Q"));
					break;
				case 13:
					baraja.add(new CartaFr(i, palo, 13, "K"));
					break;
				default:
					baraja.add(new CartaFr(i, palo, i, Integer.toString(i)));
					break;
				}
			}
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

	public void compararValorCarta(CartaFr carta1, CartaFr carta2) {
		if (carta1.getValor() == carta2.getValor()) {
			JOptionPane.showMessageDialog(null, ("Las cartas comparadas son iguales"));
		} else if (carta1.getValor() > carta2.getValor()) {
			JOptionPane.showMessageDialog(null, ("La carta del primer jugador es mayor que la del segundo"));
		} else {
			JOptionPane.showMessageDialog(null, ("La carta del segundo jugador es mayor que la del primero"));
		}
	}
}
