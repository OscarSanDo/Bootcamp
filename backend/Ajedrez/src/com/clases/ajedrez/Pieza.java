package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public abstract class Pieza{

	private Color color;
	
	public Pieza(Color color) {

		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	
	
	protected abstract boolean esValido(Movimiento movimiento, Tablero tablero);
	
	public void mover (Movimiento movimiento, Tablero tablero) throws JuegoException {
		if (esValido(movimiento, tablero)) {
			tablero.mover(movimiento);
		}
	}
	
}
