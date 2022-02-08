package com.clases.ajedrez;

public class Posicion {

	int fila, columna;

	public Posicion(int fila, int columna) throws JuegoException {

		if (1 <= columna && columna <= 8) {
			this.columna = columna;
		} else {
			throw new JuegoException("La columna debe estar entre el 1 y el 8");
		}
		if (1 <= fila && fila <= 8) {
			this.fila = fila;
		} else {
			throw new JuegoException("La fila debe estar entre el 1 y el 8");
		}

	}

	public Posicion(char fila, char columna) throws JuegoException {

		if ('A' <= columna && columna <= 'H') {
			this.columna = columna - 'A' + 1;
		} else {
			throw new JuegoException("La columna debe estar entra la A y la H");
		}
		if ('1' <= fila && fila <= '8') {
			this.fila = fila - '0' + 1;
		} else {
			throw new JuegoException("La fila debe estar entra el 1 y el 8");
		}

	}

	public int getFila() {
		return fila;
	}

	public void setFila() {

	}

	public int getColumna() {
		return columna;
	}

	public void setColumna() {

	}

}
