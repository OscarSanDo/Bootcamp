package com.clases.ajedrez;

/**
 * @author Oscar Sánchez Domingo
 * @version 1.0.0 02/2022 
 */
import com.ajedrez.enums.Color;

public class Juego {

	private Tablero elTablero;
	private Color elTurno;
	private boolean partidaActiva = false;

	/**
	 * 
	 * @return devuelve el tablero clonado si se ha inicializado el juego previamente
	 */
	public Tablero getTablero() throws CloneNotSupportedException, JuegoException {
		if (partidaActiva) {
			return (Tablero) elTablero.clone();
		} else {
			throw new JuegoException("No se ha iniciado la partida");
		}
	}

	/**
	 * 
	 * @return devuelve el turno si se ha inicializado el juego previamente
	 */
	public Color turno() throws JuegoException {
		if (partidaActiva) {
			return elTurno;
		} else {
			throw new JuegoException("No se ha iniciado la partida");
		}
	}

	/**
	 * 
	 * Inicializa el juego creando las piezas en sus posiciones iniciales, activando
	 * la partira y asignando el turno a las piezas blancas
	 */
	public void inicializar() {
		elTurno = Color.BLANCO;
		partidaActiva = true;
		elTablero = new Tablero();

		elTablero.ponPieza(0, 0, new Torre(Color.BLANCO));
		elTablero.ponPieza(1, 0, new Caballo(Color.BLANCO));
		elTablero.ponPieza(2, 0, new Alfil(Color.BLANCO));
		elTablero.ponPieza(3, 0, new Dama(Color.BLANCO));
		elTablero.ponPieza(4, 0, new Rey(Color.BLANCO));
		elTablero.ponPieza(5, 0, new Alfil(Color.BLANCO));
		elTablero.ponPieza(6, 0, new Caballo(Color.BLANCO));
		elTablero.ponPieza(7, 0, new Torre(Color.BLANCO));

		elTablero.ponPieza(0, 7, new Torre(Color.NEGRO));
		elTablero.ponPieza(1, 7, new Caballo(Color.NEGRO));
		elTablero.ponPieza(2, 7, new Alfil(Color.NEGRO));
		elTablero.ponPieza(3, 7, new Dama(Color.NEGRO));
		elTablero.ponPieza(4, 7, new Rey(Color.NEGRO));
		elTablero.ponPieza(5, 7, new Alfil(Color.NEGRO));
		elTablero.ponPieza(6, 7, new Caballo(Color.NEGRO));
		elTablero.ponPieza(7, 7, new Torre(Color.NEGRO));

		for (int i = 0; i < 8; i++) {
			elTablero.ponPieza(i, 1, new Peon(Color.BLANCO));
			elTablero.ponPieza(i, 6, new Peon(Color.NEGRO));
		}

	}

	/**
	 * @param String jugada 
	 * Recibe la jugada introducida por el usuario si se ha
	 * inicializado el juego previamente
	 */
	public void jugada(String jugada) throws JuegoException {
		if (partidaActiva) {
			Movimiento movimientoJugada = new Movimiento(jugada);
			movimiento(movimientoJugada);
			cambiaTurno();
		} else {
			throw new JuegoException("No se ha iniciado la partida");
		}

	}

	/**
	 * @param Movimiento 
	 * Comprueba si el movimiento introducido es válido y llama al método mover
	 * para poner la pieza en la posición correspondiente
	 */
	private void movimiento(Movimiento movimiento) throws JuegoException {

		Pieza piezaMovimiento = elTablero.damePieza(movimiento.getPosIni());

		if (piezaMovimiento.esValido(movimiento, elTablero)) {
			piezaMovimiento.mover(movimiento, elTablero);
		} else {
			throw new JuegoException("El movimiento no es valido");
		}
	}

	/**
	 * 
	 * Controla el turno de la partida
	 */
	private void cambiaTurno() {
		if (elTurno == Color.BLANCO) {
			elTurno = Color.NEGRO;
		} else {
			elTurno = Color.BLANCO;
		}
	}

	/**
	 * 
	 * Sin implementación en la version 1.0.0
	 */
	private void promocionaPeon() {

	}

}
