package com.enums;

public enum PalosEsp {

	OROS(1), COPAS(2), BASTOS(3), ESPADAS(4);
	
	public int palos;
	
	PalosEsp(int palosCartas) {
		palos = palosCartas;

	}

	public int getPalos() {
		return palos;
	}
}
