package com.clases.ajedrez;

/**
 * @author Oscar S�nchez Domingo
 * @version 1.0.0 02/2022 6
 */

import com.ajedrez.enums.Color;

public abstract class Pieza {

	private Color color;

	/**
	 * Constructor
	 * 
	 * @param Enum Color
	 */

	public Pieza(Color color) {

		this.color = color;
	}
	/**
	 * 
	 * @return  Color de pieza
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * Asigna color a pieza
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * Definici�n de m�todo abstracto que se implementa en cada heredero
	 */
	protected abstract boolean esValido(Movimiento movimiento, Tablero tablero) throws JuegoException;
	/**
	 * comprueba si el movimiento es valido y llama al m�todo mover del tablero
	 */
	public void mover(Movimiento movimiento, Tablero tablero) throws JuegoException {
		if (esValido(movimiento, tablero)) {
			tablero.mover(movimiento);
		}
	}

}
