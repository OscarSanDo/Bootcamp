package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import com.enums.PalosEsp;
import com.enums.TipoJuego;
import com.enums.ValoresBarajaEspComp;
import com.enums.ValoresBarajaEspInc;

public class BarajaEspComp {
	public ArrayList<CartaEsp> baraja;

	

	public BarajaEspComp() {
		barajaEspañolaCompleta();
	}

	public void barajaEspañolaCompleta() {
		
		baraja = new ArrayList<>();

		for (PalosEsp palo : PalosEsp.values()) { // for each para recorrer los palos
			for (ValoresBarajaEspComp valores : ValoresBarajaEspComp.values()) { // for each para recorrer todas las cartas
				baraja.add(new CartaEsp(palo, valores));

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

	public void compararValor(CartaEsp carta1, CartaEsp carta2) {
		if (carta1.getValor() == carta2.getValor()) {
			JOptionPane.showMessageDialog(null, ("Las cartas comparadas son iguales"));
		} else if (carta1.getValor().valor > carta2.getValor().valor) {
			JOptionPane.showMessageDialog(null, ("La carta del primer jugador es mayor que la del segundo"));
		} else {
			JOptionPane.showMessageDialog(null, ("La carta del segundo jugador es mayor que la del primero"));
		}
	}
	public int getTamaño() {
		return PalosEsp.values().length * ValoresBarajaEspComp.values().length;
	}
	
	public ArrayList <CartaEsp> repartirCartas(int numReparto) {
		if ( numReparto > baraja.size() || numReparto < 1)
			throw new IllegalArgumentException("Numero de reparto no permitido");
		
		ArrayList <CartaEsp> mano = new ArrayList<>();
		for (int i=0; i < numReparto; i++)
			mano.add(baraja.get(0));
			baraja.remove(baraja.get(0));
			return mano;
	}
}
