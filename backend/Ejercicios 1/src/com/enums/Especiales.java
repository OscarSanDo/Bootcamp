package com.enums;

public enum Especiales {
	K(10), Q(10), J(10), A(11);
	
	public int valor;
		
	Especiales(int especiales){
		valor=especiales;
		}
	
	
	public int getValor() {
		return valor;
	}
	
	
}
