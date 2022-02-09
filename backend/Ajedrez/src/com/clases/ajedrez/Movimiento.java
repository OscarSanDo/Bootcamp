package com.clases.ajedrez;

public class Movimiento {

	private Posicion posIni;
	private Posicion posFin;

	public Movimiento(String posicion) throws JuegoException {
		posIni = new Posicion(posicion.charAt(0), posicion.charAt(1));
		posFin = new Posicion(posicion.charAt(2), posicion.charAt(3));
		if (posFin.equals(posIni)) {
			throw new JuegoException("La posición incial tiene que ser distinata de la posición final");
		}
//			else if (posIni. != 4 && posFin != 4){
//				throw new JuegoException("La posición incial tiene que ser distinata de la posición final");
//			}
	}

	public Posicion getPosIni() {
		return posIni;
	}

	public Posicion getPosFin() {
		return posFin;
	}

	public boolean esVertical() { // fila distinta columna igual
		return (posFin.getColumna() == posIni.getColumna());
	}

	public boolean esHorizontal() { // fila igual columna distinta
		return (posFin.getFila() == posIni.getFila());
	}

	public boolean esDiagonal() { // salta las mismas filas que columnas
		return (saltoVertical() == saltoHorizontal());
	}

	public int saltoVertical() { // diferencia de filas fila-fila (valor absoluto para que no incordie el signo)
		return Math.abs(posFin.getFila() - posIni.getFila());
	}

	public int saltoHorizontal() { // diferencia de columnas columna-columna (valor absoluto para que no incordie
									// el signo)
		return Math.abs(posFin.getColumna() - posIni.getColumna());
	}

	public int deltaFila() { // comprobar si hay piezas intermedias pasando por cada casilla que hay en el
								// camino
		int delta = 0;
		if (posFin.getFila() > posIni.getFila()) {
			delta = 1;
		} else {
			delta = -1;
		}
		return delta;
	}

	public int deltaColumna() { // comprobar que el movimiento es hacia delante, si la columna inicial menor que
								// la final +1 si no -1
		int delta = 0;
		if (posFin.getColumna() > posIni.getColumna()) {
			delta = 1;
		} else {
			delta = -1;
		}
		return delta;
	}

}
