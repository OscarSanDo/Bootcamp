package com.capgemini;

public class Carta {

	
	
	private int numero;
	private String palo;
	
	public static String[] PALOS = {"Corazones", "Tréboles", "Picas", "Rombos"};
	public static String[] NUMEROS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;		
			}
	
	public String toString() {
		return "numero = " + numero + ", palo=" + palo;
	}

	
	
	
	
	
	
}