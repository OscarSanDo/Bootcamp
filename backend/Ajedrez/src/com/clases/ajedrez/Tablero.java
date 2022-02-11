package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Tablero {

	Pieza[][] piezas = new Pieza[8][8]; // casillas del tablero

	public Pieza GetEscaque(int fila, int columna) {
		return piezas[fila][columna];
	}

	public Pieza GetEscaque(Posicion posicion) {
		return null;
	}

	private boolean esValido(int i) { // comprobar si la i está entre el 1 y el 8
		return (i >= 1 && i <= 8);
	}

	public boolean hayPieza(Posicion posicion) {
		if (piezas[posicion.getColumna()][posicion.getFila()] != null) {
			return true;
		} else {
			return false;
		}
	}

	public void QuitaPieza(int columna, int fila) {
		piezas[columna][fila] = null;
	}

	public void QuitaPieza(Posicion posicion) {
		piezas[posicion.getColumna()][posicion.getFila()] = null;
	}

	public void mover(Movimiento movimiento) throws JuegoException {

		Color colorPiezaInicio = piezas[movimiento.getPosIni().getColumna()][movimiento.getPosIni().getFila()]
				.getColor();
		Color colorPiezaDestino = piezas[movimiento.getPosFin().getColumna()][movimiento.getPosFin().getFila()]
				.getColor();
		Posicion posicionInicio = movimiento.getPosIni();
		Posicion posicionFinal = movimiento.getPosFin();

		if (hayPieza(posicionInicio)) {
			if (hayPieza(posicionFinal) && colorPiezaInicio != colorPiezaDestino) {
				QuitaPieza(posicionFinal); // Quitamos la pieza que hemos comido
			} else {
				throw new JuegoException("No puedes comer una pieza del mismo color");
			}
			piezas[posicionFinal.getColumna()][posicionFinal
					.getFila()] = piezas[posicionInicio.getColumna()][posicionInicio.getFila()];
			QuitaPieza(posicionInicio); // Quitamos la pieza del color que mueve de la posición inicial
		} else {
			throw new JuegoException("No hay en la posición inicial");
		}

	}

	public Object clone() {
		return null;
	}

	public Color colorEscaque(int fila, int columna) {
		return null;
	}

	public boolean hayPiezasEntre(Movimiento movimiento) {
		return true;
	}

}
