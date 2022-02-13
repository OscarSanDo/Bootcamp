package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Rey extends Pieza {

	public Rey(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		Pieza piezaRey = tablero.damePieza(movimiento.getPosIni());
		Pieza piezaDestino = tablero.damePieza(movimiento.getPosFin());

		int numeroMov = Math.abs(movimiento.getPosIni().getFila() - movimiento.getPosFin().getFila());
		if (piezaRey.getColor() == Color.NEGRO) {
			numeroMov = Math.abs(numeroMov);
		}

		if (movimiento.esVertical() && numeroMov == 1) {
			return true;
		} else if (movimiento.esDiagonal() && piezaDestino.getColor() != piezaRey.getColor()) {
			return true;
		} else {
			return false;
		}

	}
}
