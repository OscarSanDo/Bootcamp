package com.capgemini;

import com.enums.PalosFr;

public class CartaFr {

	private int numero; // eliminar
	private PalosFr palos;
	private int valor;
	private String etiqueta;

	public CartaFr(int numero, PalosFr palo, int valor, String etiqueta) {
		this.numero = numero;
		this.palos = palo;
		this.valor = valor;
		this.etiqueta = etiqueta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public PalosFr getPalos() {
		return palos;
	}

	public void setPalos(PalosFr palos) {
		this.palos = palos;
	}

}