package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import com.enums.Palos;

public class BarajaCartas {


	public ArrayList<Carta> baraja;

	public BarajaCartas() {
		
		crearBaraja();
	}

	public void crearBaraja() {
		baraja = new ArrayList<>();
	
		for (int i = 1; i <= 13; i++) {
			baraja.add(new Carta(i, Palos.CORAZONES));
		}
		for (int i = 1; i <= 13; i++) {
			baraja.add(new Carta(i, Palos.PICAS));
		}
		for (int i = 1; i <= 13; i++) {
			baraja.add(new Carta(i, Palos.ROMBOS));
		}
		for (int i = 1; i <= 13; i++) {
			baraja.add(new Carta(i, Palos.TREBOLES));
		}


	}

	public void mostrarBaraja() {
		for (int i = 0; i < baraja.size(); i++) {
			System.out.println(baraja.get(i).getNumero() + " de " + baraja.get(i).getPalos());
		}

	}

	public void barajar() {
		Collections.shuffle(baraja);

	}

	public void repartirCarta()                                  {
		baraja.get(0);
	}
}
