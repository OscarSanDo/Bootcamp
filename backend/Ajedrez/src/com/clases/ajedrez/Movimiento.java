package com.clases.ajedrez;

public class Movimiento {

	private Posicion posIni;
	private Posicion posFin;

	public Movimiento(String posicion) throws JuegoException {

		posIni = new Posicion(posicion.charAt(0), posicion.charAt(1));
		posFin = new Posicion(posicion.charAt(2), posicion.charAt(3));
		if (posFin.equals(posIni)) {
			throw new JuegoException("La posición incial tiene que ser distinata de la posición final");
		} else if (posicion.length() != 4) {
			throw new JuegoException("La posición incial tiene que ser distinata de la posición final");
		}

	}

	public Posicion getPosIni() {
		return posIni;
	}

	public Posicion getPosFin() {
		return posFin;
	}

	public boolean esVertical() {
		return (posFin.getColumna() == posIni.getColumna());
	}

	public boolean esHorizontal() {
		return (posFin.getFila() == posIni.getFila());
	}

	public boolean esDiagonal() {
		return (saltoVertical() == saltoHorizontal());
	}

	public int saltoVertical() {
		return Math.abs(posFin.getFila() - posIni.getFila());
	}

	public int saltoHorizontal() {
		return Math.abs(posFin.getColumna() - posIni.getColumna());
	}

	public int deltaFila() {
		int delta = 0;

		if (posIni.getFila() < posFin.getFila()) {
			delta = 1;
		} else if (posIni.getFila() > posFin.getFila()) {
			delta = -1;
		}

		return delta;

	}

	public int deltaColumna() {
		int delta = 0;
		if (posIni.getColumna() < posFin.getColumna()) {
			delta = 1;
		} else if (posIni.getColumna() > posFin.getColumna()) {
			delta = -1;
		}
		return delta;
	}

}
