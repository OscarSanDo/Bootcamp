package com.enums;

public enum ValoresBarajaEspInc {
	DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), SOTA(8), CABALLO(9),
	REY(10), A(11);

	public int valor;


	ValoresBarajaEspInc(int valoresCartas) {
		valor = valoresCartas;

	}

	public int getValor() {
		return valor;
	}
}
