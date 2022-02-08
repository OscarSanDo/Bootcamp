package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Tablero {

	Pieza[][] piezas = new Pieza[8][8];
	
	
	public Pieza GetEscaque(int fila, int columna) {
        return null;
    }
	
	
	public Pieza GetEscaque(Posicion posicion) {
        return null;
    }
	
	private boolean esValido (int i) {
		return true;
	}
	
	public boolean hayPieza (Posicion posicion) {
		return true;
	}
	
	public void QuitaPieza(int fila, int columna) {
		
	}
	
	public void QuitaPieza(Posicion posicion) {
		
	}
	
	public void mover (Movimiento movimiento) {
		
	}
	
	public Object clone() {
		return null;
	}
	
	public Color colorEscaque (int fila, int columna) {	
		return  null;
	}
	
	public boolean hayPiezasEntre(Movimiento movimiento) {
		return true;
	}
	
}

