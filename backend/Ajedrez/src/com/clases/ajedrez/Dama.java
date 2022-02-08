package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Dama extends Pieza{

	public Dama(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		return true;
	}
	
}
