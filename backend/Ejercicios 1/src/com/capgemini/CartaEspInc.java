package com.capgemini;

import com.enums.PalosEsp;
import com.enums.ValoresBarajaEspInc;

public class CartaEspInc extends Carta <PalosEsp, ValoresBarajaEspInc>{
	private PalosEsp palos;
	private ValoresBarajaEspInc valor;
	

	public CartaEspInc(PalosEsp palos, ValoresBarajaEspInc valor) {
		super(palos, valor);
		this.palos = palos;
		this.valor = valor;

	}

	public ValoresBarajaEspInc getValor() {
		return valor;
	}

	public void setValor(ValoresBarajaEspInc valor) {
		this.valor = valor;
	}


	public PalosEsp getPalos() {
		return palos;
	}

	public void setPalos(PalosEsp palos) {
		this.palos = palos;
	}

}
