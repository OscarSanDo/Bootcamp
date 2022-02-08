package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Torre extends Pieza{

	public Torre(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		return true;
	}
	
}
