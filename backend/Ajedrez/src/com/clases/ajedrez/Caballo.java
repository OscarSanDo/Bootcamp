package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Caballo extends Pieza {

	public Caballo(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {

		int filaIni = movimiento.getPosIni().getFila();
		int colIni = movimiento.getPosIni().getColumna();
		int filaFin = movimiento.getPosFin().getFila();
		int colFin = movimiento.getPosFin().getColumna();

		int movFila = Math.abs(filaFin - filaIni);
		int movColumna = Math.abs(colFin - colIni);

		if (movFila == 2 && movColumna == 1) {
			return true;
		} else if (movFila == 1 && movColumna == 2) {
			return true;
		} else {
			return false;
		}

	}

}
