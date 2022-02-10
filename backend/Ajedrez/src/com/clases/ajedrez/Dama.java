package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Dama extends Pieza{

	public Dama(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		if( movimiento.deltaColumna() == movimiento.deltaFila() ) {
			return true;
		}else {
			return false;
		}
	}
	
}
