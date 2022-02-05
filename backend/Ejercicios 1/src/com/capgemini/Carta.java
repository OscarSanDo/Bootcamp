package com.capgemini;

import com.enums.Palos;

public class Carta {

	private int numero; // eliminar
	private Palos palos;
	private int valor;
	private String etiqueta;

	public Carta(int numero, Palos palo, int valor, String etiqueta) {
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

	public Palos getPalos() {
		return palos;
	}

	public void setPalos(Palos palos) {
		this.palos = palos;
	}

}