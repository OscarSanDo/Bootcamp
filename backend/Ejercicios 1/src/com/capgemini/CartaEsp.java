package com.capgemini;

import com.enums.PalosEsp;
import com.enums.ValoresCartas;

public class CartaEsp {

	private PalosEsp palos;
	private ValoresCartas valor;
	private String etiqueta;

	public CartaEsp(PalosEsp palo, ValoresCartas valor) {

		this.palos = palo;
		this.valor = valor;

	}

	public ValoresCartas getValor() {
		return valor;
	}

	public void setValor(ValoresCartas valor) {
		this.valor = valor;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public PalosEsp getPalos() {
		return palos;
	}

	public void setPalos(PalosEsp palos) {
		this.palos = palos;
	}

}