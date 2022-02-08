package com.capgemini;


public abstract class Carta <P, V>{

	private P palos;
	private V valor;
	

	public Carta(P palos, V valor) {

		this.palos = palos;
		this.valor = valor;

	}

	public V getValor() {
		return valor;
	}

	public void setValor(V valor) {
		this.valor = valor;
	}

	public P getPalos() {
		return palos;
	}

	public void setPalos(P palos) {
		this.palos = palos;
	}

	
}
