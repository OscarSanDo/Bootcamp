package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Caballo extends Pieza {

	public Caballo(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		if( movimiento.esHorizontal() || movimiento.esVertical()){
			if( movimiento.deltaColumna() == 2 && movimiento.deltaFila() == 1 ) {
				return true;
			}else if(movimiento.deltaColumna() == 1 && movimiento.deltaFila() == 2) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
}
