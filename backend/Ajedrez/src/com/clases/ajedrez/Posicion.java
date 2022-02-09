package com.clases.ajedrez;

public class Posicion {

	int fila, columna;

	public Posicion(int fila, int columna) throws JuegoException {

		if (columna >= 1 && columna <= 8) {
			this.columna = columna;
		} else {
			throw new JuegoException("La columna debe estar entre el 1 y el 8");
		}
		if (fila >= 1 && fila <= 8) {
			this.fila = fila;
		} else {
			throw new JuegoException("La fila debe estar entre el 1 y el 8");
		}

	}

	public Posicion(char fila, char columna) throws JuegoException {

		if (columna >= 'A' && columna <= 'H') {
			this.columna = columna - 'A' + 1;
		} else {
			throw new JuegoException("La columna debe estar entra la A y la H");
		}
		if (fila >= '1' && fila <= '8') {
			this.fila = fila - '0' + 1;
		} else {
			throw new JuegoException("La fila debe estar entra el 1 y el 8");
		}

	}

	public int getFila() {
		return fila;
	}



	public int getColumna() {
		return columna;
	}


}
