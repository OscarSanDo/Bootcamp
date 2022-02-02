package com.capgemini;

import java.util.Random;

public class BarajaCartas {

	
	Carta cartas[];
	int posSiguienteCarta;
		
	int totalCartas = 52;	
		
	
	public static void main(String[] args) {
		
		

	}
	
	
	
	
	
	
	
	
	public void Baraja() {
	
	this.cartas = new Carta[totalCartas];
	this.posSiguienteCarta = 0;
	crearBaraja();
	
		}
	
	public void crearBaraja() {
		
		String[] baraja = new String[52];
		String[] palos = Carta.PALOS;
		String[] numeros = Carta.NUMEROS;
		
		for(int p = 0; p < palos.length; p++) {
			for(int n = 0; n < numeros.length; n++) {
				baraja[n] = numeros[n] + " " + palos[p]; 
				}
			}
		}
	 
	public void Barajar() {
		
		int posRandom = 0;
		Carta aux;
		
		for(int i=0; i<cartas.length;i++) {
		
		posRandom = new Random().nextInt(0, totalCartas-1);
		
		aux = cartas[i];
		cartas [i] = cartas[posRandom];
		cartas[posRandom] = aux;
		
		}
		
	}
	
	
	
}
	
	
	
	
	
//	private static void crearBaraja(){
//		
//		String[] baraja = new String[52]; 
//		String numeros[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//		String palos[]   = {"Corazones", "Tréboles", "Picas", "Rombos"};
//		
//		for(int p = 0; p < palos.length; p++) {
//			for(int n = 0; n < numeros.length; n++) {
//				baraja[n] = numeros[n] + " " + palos[p]; 
//				
//				System.out.println(baraja[n] = numeros[n] + " " + palos[p]);
//			}
//		}
//			
//	}
		

	
	

