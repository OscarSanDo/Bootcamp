package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import com.enums.PalosEsp;
import com.enums.ValoresBarajaEspComp;
import com.enums.ValoresBarajaEspInc;

public class BarajaEspInc {

	public ArrayList<CartaEspInc> baraja;

	public BarajaEspInc() {
		barajaEspañolaInc();
	}


	public void barajaEspañolaInc() {

		baraja = new ArrayList<>();

		for (PalosEsp palo : PalosEsp.values()) { // for each para recorrer los palos
			for (ValoresBarajaEspInc valores : ValoresBarajaEspInc.values()) { // for each para recorrer todas las cartas
																				
				baraja.add(new CartaEspInc(palo, valores));

			}
		}

	}

	public void mostrarBaraja() {
		for (int i = 0; i < baraja.size(); i++) {
			System.out.println(baraja.get(i).getValor() + " de " + baraja.get(i).getPalos() + " Valor: "
					+ baraja.get(i).getValor().valor);
		}

	}

	public void barajar() {
		Collections.shuffle(baraja);
	}

	public void compararValor(CartaEspInc carta1, CartaEspInc carta2) {
		if (carta1.getValor() == carta2.getValor()) {
			JOptionPane.showMessageDialog(null, ("Las cartas comparadas son iguales"));
		} else if (carta1.getValor().valor > carta2.getValor().valor) {
			JOptionPane.showMessageDialog(null, ("La carta del primer jugador es mayor que la del segundo"));
		} else {
			JOptionPane.showMessageDialog(null, ("La carta del segundo jugador es mayor que la del primero"));
		}
	}
	
	public int getTamaño() {
		return PalosEsp.values().length * ValoresBarajaEspInc.values().length;
	}
	
}
