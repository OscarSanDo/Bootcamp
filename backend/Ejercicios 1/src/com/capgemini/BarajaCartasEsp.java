package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import com.enums.PalosEsp;
import com.enums.TipoJuego;
import com.enums.ValoresCartas;

public class BarajaCartasEsp {

	public ArrayList<CartaEsp> barajaEsp;

	public BarajaCartasEsp(TipoJuego tipoJuego) {
		crearBarajaEsp(tipoJuego);
	}

	public void crearBarajaEsp(TipoJuego tipoJuego) {

		if (tipoJuego == TipoJuego.ESPA�OLA) {
			barajaEspa�olaCompleta();
		}
//		} else if (tipoJuego == TipoJuego.ESPA�OLA) {
//			barajaEspa�olaIncompleta();
//		}

	}

	public void barajaEspa�olaCompleta() {

		barajaEsp = new ArrayList<>();

		for (PalosEsp palo : PalosEsp.values()) { // for each para recorrer los palos
			for (ValoresCartas valores : ValoresCartas.values()) { // for each para recorrer todas las cartas
				barajaEsp.add(new CartaEsp(palo, valores));

			}
		}

	}

//	public void barajaEspa�olaIncompleta() {
//
//		barajaEsp = new ArrayList<>();
//
//		for (PalosEsp palo : PalosEsp.values()) { // for each para recorrer los palos 
//			for (ValoresCartas valores : ValoresCartas.values()) {	//for each para recorrer todas las cartas 
//				barajaEsp.add(new CartaEsp(palo, valores));
//				
//					
//				
//			}
//		}
//	}

	public void mostrarBarajaEsp() {
		for (int i = 0; i < barajaEsp.size(); i++) {
			System.out.println(barajaEsp.get(i).getValor() + " de " + barajaEsp.get(i).getPalos() + " Valor: "
					+ barajaEsp.get(i).getValor().valor);
		}

	}

	public void barajar() {
		Collections.shuffle(barajaEsp);
	}

	public void compararValorCartaEsp(CartaEsp carta1, CartaEsp carta2) {
		if (carta1.getValor() == carta2.getValor()) {
			JOptionPane.showMessageDialog(null, ("Las cartas comparadas son iguales"));
		} else if (carta1.getValor().valor > carta2.getValor().valor) {
			JOptionPane.showMessageDialog(null, ("La carta del primer jugador es mayor que la del segundo"));
		} else {
			JOptionPane.showMessageDialog(null, ("La carta del segundo jugador es mayor que la del primero"));
		}
	}

}
