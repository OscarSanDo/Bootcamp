package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Rey extends Pieza{

	public Rey(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		if( movimiento.esHorizontal() || movimiento.esVertical() && movimiento.deltaColumna() == 1){
			return true;
		}else {
			return false;
		}
	}
}
