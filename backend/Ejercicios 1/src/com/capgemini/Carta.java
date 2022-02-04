package com.capgemini;

import com.enums.Palos;


public class Carta {

		
	private int numero;
	private Palos palos;
	
	
	public Carta(int numero, Palos palo) {
		this.numero = numero;
		this.palos = palo;		
			}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Palos getPalos() {
		return palos;
	}


	public void setPalos(Palos palos) {
		this.palos = palos;
	}
	
	
	
}