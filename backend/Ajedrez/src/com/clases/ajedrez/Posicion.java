package com.clases.ajedrez;

/**
 * @author Oscar Sánchez Domingo
 * @version 1.0.0 02/2022 6
 */

public class Posicion {

	int fila, columna;

	/**
	 * Constructor comprobamos que los valores están entre 1 y 8
	 * 
	 * @param int columna
	 * @param int fila
	 * @throws JuegoException
	 */
	public Posicion(int columna, int fila) throws JuegoException {

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

	/**
	 * 
	 * Constructor comprobamos que los valores están entre A y H en las columnas y
	 * entre 1 y 8 en las filas
	 * 
	 * @param char columna
	 * @param char fila
	 * @throws JuegoException
	 */
	public Posicion(char columna, char fila) throws JuegoException {
		columna = Character.toUpperCase(columna);
		if (columna >= 'A' && columna <= 'H') {
			this.columna = columna - 'A';
		} else {
			throw new JuegoException("La columna debe estar entra la A y la H");
		}
		if (Character.getNumericValue(fila) >= 1 && Character.getNumericValue(fila) <= 8) {
			this.fila = Character.getNumericValue(fila) - 1;
		} else {
			throw new JuegoException("La fila debe estar entra el 1 y el 8");
		}

	}

	/**
	 * 
	 * @return retorna la fila de la posición
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * 
	 * @return retorna la columna de la posición
	 */
	public int getColumna() {
		return columna;
	}

	/**
	 * 
	 * @return compara posición
	 */

	public boolean Equals(Posicion posicion) {
		return (this.getColumna() == posicion.getColumna() && this.getFila() == posicion.getFila());
	}

}
