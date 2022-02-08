package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Peon extends Pieza{

	
	public Peon(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		return true;
	}
	
	
	
	private boolean avanza (Movimiento movimiento) {
		return true;
	}
	
	private boolean inicia (Posicion posicion) {
		return true;
	}
	
	private boolean puedeComer (Movimiento movimiento, Tablero tablero) {
		return true;
	}
	
	private boolean necesitaPromocion (Posicion posicion) {
		return true;
	}
	
	public void mover(Movimiento movimiento, Tablero tablero) {
		
	}
	
	
}
