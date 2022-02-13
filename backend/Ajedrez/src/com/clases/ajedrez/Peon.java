package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Peon extends Pieza {

	public Peon(Color color) {
		super(color);

	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) throws JuegoException {

		Pieza piezaPeon = tablero.damePieza(movimiento.getPosIni());

		int numeroMov = Math.abs(movimiento.getPosIni().getFila() - movimiento.getPosFin().getFila());
		if (piezaPeon.getColor() == Color.NEGRO) {
			numeroMov = Math.abs(numeroMov);
		}

		if (movimiento.esVertical() && numeroMov == 1) {
			return true;
		} else if (movimiento.esVertical() && numeroMov == 2 && inicia(movimiento.getPosIni())) {
			return true;
		} else if (puedeComer(movimiento, tablero)) {
			return true;
		} else {
			return false;
		}

	}

	private boolean puedeComer(Movimiento movimiento, Tablero tablero) throws JuegoException {

		if (movimiento.saltoHorizontal() != 1 && movimiento.saltoVertical() != 1) {
			throw new JuegoException("El movimiento no es válido");
		}

		Pieza piezaPeon = tablero.damePieza(movimiento.getPosIni());
		Pieza piezaDestino = tablero.damePieza(movimiento.getPosFin());

		if (movimiento.esDiagonal() && piezaDestino.getColor() != piezaPeon.getColor()) {
			return true;
		}
		return false;
	}

	private boolean avanza(Movimiento movimiento) { // sin implementación en la version 1.0.0
		return true;
	}

	private boolean inicia(Posicion posicion) {
		if (posicion.getFila() == 6 || posicion.getFila() == 1) {
			return true;
		}
		return false;
	}

	private boolean necesitaPromocion(Posicion posicion) { // sin implementación en la version 1.0.0
		return true;
	}

	public void mover(Movimiento movimiento, Tablero tablero) throws JuegoException {
		if (esValido(movimiento, tablero)) {
			tablero.mover(movimiento);
		}
	}

}
