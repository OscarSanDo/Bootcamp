package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Rey extends Pieza{

	public Rey(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		return true;
	}
}
