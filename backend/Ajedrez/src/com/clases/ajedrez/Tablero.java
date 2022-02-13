package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Tablero implements Cloneable {

	private Pieza[][] piezas = new Pieza[8][8];

	public Pieza damePieza(int columna, int fila) {
		return piezas[columna][fila];
	}

	public Pieza damePieza(Posicion posicion) {
		return piezas[posicion.getColumna()][posicion.getFila()];
	}

	public void ponPieza(int columna, int fila, Pieza pieza) {
		piezas[columna][fila] = pieza;
	}

	public void ponPieza(Posicion posicion, Pieza pieza) {
		piezas[posicion.getColumna()][posicion.getFila()] = pieza;
	}

	private boolean esValido(int i) {
		return (i >= 1 && i <= 8);
	}

	public boolean hayPieza(Posicion posicion) {
		if (piezas[posicion.getColumna()][posicion.getFila()] != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean hayPieza(int columna, int fila) {
		if (piezas[columna][fila] != null) {
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

		Posicion posicionInicio = movimiento.getPosIni();
		Posicion posicionFinal = movimiento.getPosFin();
		Pieza piezaMovida = damePieza(posicionInicio);

		if (!posicionInicio.equals(posicionFinal) && !hayPiezasEntre(movimiento)) {
			Pieza piezaDestino = damePieza(posicionFinal);
			if (piezaDestino != null && piezaDestino.getColor() != piezaMovida.getColor()) {
				QuitaPieza(posicionFinal);
			} else if (piezaDestino != null && piezaDestino.getColor() == piezaMovida.getColor()) {
				throw new JuegoException("Hay una pieza del mismo color");
			}
			piezas[posicionFinal.getColumna()][posicionFinal
					.getFila()] = piezas[posicionInicio.getColumna()][posicionInicio.getFila()];
			QuitaPieza(posicionInicio);
		} else {
			throw new JuegoException("La posición de inicio y final no pueden ser la misma");
		}

	}

	public Object clonarTablero() throws CloneNotSupportedException {
		return this.clone();
	}

	public Color colorEscaque(int columna, int fila) {
		if ((columna % 2) == (fila % 2)) {
			return Color.BLANCO;
		} else {
			return Color.NEGRO;
		}
	}

	public boolean hayPiezasEntre(Movimiento movimiento) throws JuegoException {

		int filaIni = movimiento.getPosIni().getFila();
		int colIni = movimiento.getPosIni().getColumna();
		int filaFin = movimiento.getPosFin().getFila() - movimiento.deltaFila();
		int colFin = movimiento.getPosFin().getColumna() - movimiento.deltaColumna();

		int movimientos = Math.abs(colIni - colFin);
		int movCol = colIni;
		int movFila = filaIni;

		if (movimiento.esHorizontal()) {
			for (int i = 1; i <= movimientos; i++) {
				movCol = movCol + movimiento.deltaColumna();
				if (hayPieza(movCol, filaIni)) {
					throw new JuegoException("Hay piezas en el camino, no puedes hacer el movimiento");
				}
			}
		}

		if (movimiento.esVertical()) {
			movimientos = Math.abs(filaIni - filaFin);
			for (int i = 1; i <= movimientos; i++) {
				movFila = movFila + movimiento.deltaFila();
				if (hayPieza(colIni, movFila)) {
					throw new JuegoException("Hay piezas en el camino, no puedes hacer el movimiento");
				}
			}
		}

		if (movimiento.esDiagonal()) {

			for (int i = 1; i <= movimientos; i++) {
				movCol = movCol + movimiento.deltaColumna();
				movFila = movFila + movimiento.deltaFila();
				if (hayPieza(movCol, movFila)) {
					throw new JuegoException("Hay piezas en el camino, no puedes hacer el movimiento");
				}
			}

		}
		return false;
	}

}
