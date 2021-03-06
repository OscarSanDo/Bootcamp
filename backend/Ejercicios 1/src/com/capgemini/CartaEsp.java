package com.capgemini;

import com.enums.PalosEsp;
import com.enums.ValoresBarajaEspComp;

public class CartaEsp extends Carta <PalosEsp, ValoresBarajaEspComp>{

	private PalosEsp palos;
	private ValoresBarajaEspComp valor;
	

	public CartaEsp(PalosEsp palos, ValoresBarajaEspComp valor) {
		super(palos, valor);
		this.palos = palos;
		this.valor = valor;

	}

	public ValoresBarajaEspComp getValor() {
		return valor;
	}

	public void setValor(ValoresBarajaEspComp valor) {
		this.valor = valor;
	}


	public PalosEsp getPalos() {
		return palos;
	}

	public void setPalos(PalosEsp palos) {
		this.palos = palos;
	}

}