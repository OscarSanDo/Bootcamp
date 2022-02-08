package com.enums;

public enum ValoresBarajaEspComp {
	DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), SOTA(11), CABALLO(12),
	REY(13), A(14);

	public int valor;


	ValoresBarajaEspComp(int valoresCartas) {
		valor = valoresCartas;

	}

	public int getValor() {
		return valor;
	}

}
